package com.example.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @Author ws
 * @create 2023/3/8 17:45
 * @Description
 */
@Component //使用@Component将类注解成组件
public class Person {

    IAir air;

    public Person() {
    }

    @Autowired //对构造函数进行标注
    public Person(@Qualifier("cleanair")IAir air) {
        //使用@Qualifier关键字来进行区分
        this.air = air;
    }

    public void Breath() {
        System.out.println(this.air.toString());
    }
}
