package com.designPrinciple.test;

import com.designPrinciple.spring.applicationContext.AnnotationConfigApplicationContext;
import com.designPrinciple.test.bean.UserService;
import com.designPrinciple.test.bean.UserService1;
import com.designPrinciple.test.config.AppConfig;

public class SpringTest {
    public static void main(String[] args) {
        // 创建applicationContext (注解)
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // 调用getBean
        UserService bean = (UserService) applicationContext.getBean("UserService");
        UserService1 bean1 = (UserService1) applicationContext.getBean("UserService1");
        System.out.println(bean);
        System.out.println(bean1);
    }
}
