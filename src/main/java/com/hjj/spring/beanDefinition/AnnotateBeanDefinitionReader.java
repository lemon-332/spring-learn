package com.hjj.spring.beanDefinition;

import com.hjj.spring.annotation.Scope;

public class AnnotateBeanDefinitionReader {
    private BeanDefinitionRegistry registry;

    public AnnotateBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this.registry = registry;
    }

    // 注册路径扫描 这个bean到bean工厂里
    public void register(Class<?> componentClass) {
        registerBean(componentClass);
    }

    private void registerBean(Class<?> componentClass) {
        doRegisterBean(componentClass);
    }

    private void doRegisterBean(Class<?> componentClass) {
        // 把appConfig 读成一个BeanDefinition 定义
        AnnotateGenericBeanDefinition beanDefinition
                = new AnnotateGenericBeanDefinition();
        beanDefinition.setClazz(componentClass);
        if (componentClass.isAnnotationPresent(Scope.class)) {
            String scope = componentClass.getAnnotation(Scope.class).value();
            beanDefinition.setScope(scope);
        } else {
            beanDefinition.setScope("singleton");
        }
        // beanDefinition创建完成之后，就给beanFactory进行bean注册
        BeanDefinitionReaderUtils.registerBeanDefinition(beanDefinition, this.registry);
    }
}
