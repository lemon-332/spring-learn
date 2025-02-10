package com.hjj.spring.beanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, AnnotateBeanDefinition beanDefinition);
}
