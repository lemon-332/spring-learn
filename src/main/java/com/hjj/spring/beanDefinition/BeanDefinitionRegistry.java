package com.designPrinciple.spring.beanDefinition;

public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, AnnotateBeanDefinition beanDefinition);
}
