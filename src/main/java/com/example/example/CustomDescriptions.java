package com.example.example;

import java.lang.annotation.*;

/**
 * @Author ws
 * @create 2023/3/8 17:42
 * @Description CustomDescription容器
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface CustomDescriptions {
    CustomDescription[] value();

}
