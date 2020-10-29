package com.kuang.config;

import com.kuang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
@Configuration：
1.也会被Spring容器托管，因为它本身也是一个@Component
2.代表这是一个配置类，和之前的applicationContext.xml一样
 */
@Configuration
//@ComponentScan("com.kuang.config") //扫描包，只有该包下的类注解才起作用
public class KuangConfig {

    @Bean  //相当于xml中的bean标签
    public User getUser() {
        return new User();
    }
}
