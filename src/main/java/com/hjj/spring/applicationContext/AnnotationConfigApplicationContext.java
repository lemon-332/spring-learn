package com.hjj.spring.applicationContext;

import com.hjj.spring.beanDefinition.AnnotateBeanDefinitionReader;
import com.hjj.spring.beanDefinition.BeanDefinitionRegistry;

public class AnnotationConfigApplicationContext
        extends GenericApplicationContext
        implements BeanDefinitionRegistry {

    private AnnotateBeanDefinitionReader reader;

    // 如果调用无参构造，必须先调用父类的无参构造 GenericApplicationContext 隐示调用
    public AnnotationConfigApplicationContext() {
        this.reader = new AnnotateBeanDefinitionReader(this);
    }

    public AnnotationConfigApplicationContext(Class<?> componentClass) {
        // 1. 读componentClass，也就是扫描路径所在的类的AppConfig。
        // 定义一个阅读器 专门读取AnnotateBeanDefinitionReader
        this();
        // 2. 先把componentClass 注册到bean工厂里(BeanDefinition + registerBeanDefinition + FactoryBean)
        register(componentClass);
        // 3. 扫描componentClass，把扫描到的类注册到bean工厂里(
        // 放到父类中，所有子类都能使用，核心
        refresh();
    }

    private void register(Class<?> componentClass) {
        this.reader.register(componentClass);
    }

}
