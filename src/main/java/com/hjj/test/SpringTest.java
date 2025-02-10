package com.hjj.test;

import com.hjj.spring.applicationContext.AnnotationConfigApplicationContext;
import com.hjj.test.bean.UserService;
import com.hjj.test.bean.UserService1;
import com.hjj.test.config.AppConfig;

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
