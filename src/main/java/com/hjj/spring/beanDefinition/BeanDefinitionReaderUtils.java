package com.designPrinciple.spring.beanDefinition;

public class BeanDefinitionReaderUtils {
    public static void registerBeanDefinition(AnnotateBeanDefinition beanDefinition, BeanDefinitionRegistry registry) {
        String beanName = ((AnnotateGenericBeanDefinition) beanDefinition)
                .getClazz().getSimpleName();
        registry.registerBeanDefinition(beanName, beanDefinition);
    }
}
