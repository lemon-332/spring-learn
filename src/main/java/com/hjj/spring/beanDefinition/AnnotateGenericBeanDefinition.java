package com.designPrinciple.spring.beanDefinition;

public class AnnotateGenericBeanDefinition implements AnnotateBeanDefinition {
    private Class<?> clazz;
    private String scope;

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }
}
