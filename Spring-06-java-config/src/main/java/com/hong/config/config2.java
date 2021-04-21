package com.hong.config;

import com.hong.pojo.Cat;
import com.hong.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月07日 21:14
 */

@Configuration
public class config2 {

    @Bean
    public Dog getDog(){
        return new Dog();
    }

    @Bean
    public Cat getCat(){
        return new Cat();
    }
}
