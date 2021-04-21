package com.hong.config;

import com.hong.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 21:08
 */

@Scope("com.hong")
@Configuration
@Import(config2.class)
public class config1 {

    @Bean
    public User getUser(){
        return new User();
    }

}
