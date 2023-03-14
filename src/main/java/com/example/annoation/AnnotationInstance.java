package com.example.annoation;

import com.example.example.IAir;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author ws
 * @create 2023/3/9 11:46
 * @Description
 * 注解方式注入 主要涉及
 * @Autowired
 * @Resource
 * @Required 适用于bean属性setter方法
 * @Qualifier
 * @Value
 */
@Component
public class AnnotationInstance {
    @Value("abc") //设置默认值为"abc"
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    private IAir air;

//    (name="CleanAir")
//    public void setAir(IAir air) {
//        this.air = air;
//    }

    public void Breath(){
        System.out.println("Name:"+this.name+";Air:"+this.air.toString());
    }
}
