package com.designPrinciple.spring.applicationContext;

import com.designPrinciple.spring.beanDefinition.AnnotateBeanDefinition;
import com.designPrinciple.spring.beanDefinition.BeanDefinitionRegistry;
import com.designPrinciple.spring.beanFactory.DefaultListableBeanFactory;

public class GenericApplicationContext implements BeanDefinitionRegistry {

    private DefaultListableBeanFactory beanFactory;

    public GenericApplicationContext() {
        this.beanFactory = new DefaultListableBeanFactory();
    }

    @Override
    public void registerBeanDefinition(String beanName, AnnotateBeanDefinition beanDefinition) {
        this.beanFactory.registerBeanDefinition(beanName, beanDefinition);
    }

    protected void refresh() {
        //获取bean工厂
        DefaultListableBeanFactory beanFactory = obtainBeanFactory();
        // 把appConfig 路径下所有的bean进行扫描注册到bean工厂 beanDefinitionMap
        invokeBeanFactoryPostProcessors(beanFactory);
        // 初始化beanDefinition所代表的单例bean，放到单例bean的容器（缓存）里
        finishBeanFactoryInitialization(beanFactory);
    }

    private void finishBeanFactoryInitialization(DefaultListableBeanFactory beanFactory) {
        beanFactory.preInstantiateSingletons();
    }

    private void invokeBeanFactoryPostProcessors(DefaultListableBeanFactory beanFactory) {
        beanFactory.doScan();
    }

    private DefaultListableBeanFactory obtainBeanFactory() {
        return this.beanFactory;
    }

    public Object getBean(String beanName) {
        return beanFactory.getBean(beanName);
    }
}
