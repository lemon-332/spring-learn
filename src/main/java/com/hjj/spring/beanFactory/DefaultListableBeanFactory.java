package com.designPrinciple.spring.beanFactory;

import com.designPrinciple.spring.annotation.ComponentScan;
import com.designPrinciple.spring.annotation.Scope;
import com.designPrinciple.spring.annotation.Service;
import com.designPrinciple.spring.beanDefinition.AnnotateBeanDefinition;
import com.designPrinciple.spring.beanDefinition.AnnotateGenericBeanDefinition;
import com.designPrinciple.spring.beanDefinition.BeanDefinitionRegistry;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


public class DefaultListableBeanFactory implements BeanDefinitionRegistry, BeanFactory {
    private final Map<String, AnnotateBeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>(256);
    private List<String> beanDefinitionNames = new ArrayList<>();

    private final Map<String, Object> singletonObjects = new ConcurrentHashMap<>(256);

    // 只有bean都注册，才能有getBean
    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName);
    }

    private Object doGetBean(String beanName) {
        Object bean = singletonObjects.get(beanName);
        if (bean != null) return bean;
        // 需要根据beanDefinition创建bean
        AnnotateGenericBeanDefinition beanDefinition = (AnnotateGenericBeanDefinition) beanDefinitionMap.get(beanName);
        Object cBean = createBean(beanName, beanDefinition);
        if (beanDefinition.getScope().equals("singleton")) {
            singletonObjects.put(beanName, cBean);
        }
        return cBean;
    }

    private Object createBean(String beanName, AnnotateGenericBeanDefinition beanDefinition) {
        try {
            return beanDefinition.getClazz().getConstructor().newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void registerBeanDefinition(String beanName, AnnotateBeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    public void doScan() {
        for (String beanName : beanDefinitionMap.keySet()) {
            AnnotateGenericBeanDefinition beanDefinition = (AnnotateGenericBeanDefinition) beanDefinitionMap.get(beanName);
            if (beanDefinition.getClazz().isAnnotationPresent(ComponentScan.class)) {
                ComponentScan componentScan = beanDefinition.getClazz().getAnnotation(ComponentScan.class);
                String basePackage = componentScan.value();
                URL resource = this.getClass().getClassLoader()
                        .getResource(basePackage.replace(".", "/"));
                File file = new File(resource.getFile());
                if (file.isDirectory()) {
                    for (File f : file.listFiles()) {
                        try {
                            Class clazz = this.getClass()
                                    .getClassLoader()
                                    .loadClass(basePackage.concat(".").concat(f.getName().split("\\.")[0]));
                            if (clazz.isAnnotationPresent(Service.class)) {
                                String name = ((Service) clazz.getAnnotation(Service.class)).value();
                                if (name.equals("")) {
                                    name = clazz.getSimpleName();
                                }
                                AnnotateGenericBeanDefinition abd = new AnnotateGenericBeanDefinition();
                                abd.setClazz(clazz);
                                if (clazz.isAnnotationPresent(Scope.class)) {
                                    Scope scope = (Scope) clazz.getAnnotation(Scope.class);
                                    abd.setScope(scope.value());
                                } else {
                                    abd.setScope("singleton");
                                }
                                beanDefinitionMap.put(name, abd);
                                beanDefinitionNames.add(name);
                            }
                        } catch (ClassNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
    }

    public void preInstantiateSingletons() {
        // 初始化定义的bean
        // beanDefinitionNames 处于并发环境中，有 beanDefinitionNames.add(name); 这个操作
        // 一旦有其他线程访问了add，就会导致for循环失败（modCount）
        List<String> beanNames = new ArrayList<>(beanDefinitionNames);
        for (String beanName : beanNames) {
            AnnotateGenericBeanDefinition annotateBeanDefinition = (AnnotateGenericBeanDefinition) beanDefinitionMap.get(beanName);
            if (annotateBeanDefinition.getScope().equals("singleton")) {
                // 创建单例对象，保存到单例池里面（内存，缓存）
                // 如果扫描之后，有新的通过动态创建的标有单例bean的class加载到jvm，这部分就会被遗漏，所以使用getBean
                getBean(beanName);
            }
        }
    }
}
