package com.kuang.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //相当于 <bean id="user" class="com.kuang.pojo.User"/>
public class User {
    @Value("张三") //相当于 <property name="name" value="张三" />
    public String name;
}
