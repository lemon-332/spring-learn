package com.hjj.test.bean;

import com.hjj.spring.annotation.Scope;
import com.hjj.spring.annotation.Service;

@Service
@Scope("prototype")
public class UserService {
    public String name = "hjj";
}
