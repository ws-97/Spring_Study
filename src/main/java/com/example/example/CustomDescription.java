package com.example.example;


import java.lang.annotation.*;

/**
 * @Author ws
 * @create 2023/3/8 17:37
 * @Description 定义CustomDescription注解
 * CustomDescription注解相当于标签，
 * 为了能多贴标签，因此又定义了注解容器
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)//在运行时环境也可以获取注解
@Target(ElementType.TYPE)
@Inherited //表示可继承
public @interface CustomDescription {
    String description() default "";
}
