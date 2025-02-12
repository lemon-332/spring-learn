package com.designPrinciple.test.bean;

import com.designPrinciple.spring.annotation.Scope;
import com.designPrinciple.spring.annotation.Service;

@Service
@Scope("prototype")
public class UserService {
    public String name = "hjj";
}
