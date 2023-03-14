package com.example.example;

import org.springframework.stereotype.Component;

/**
 * @Author ws
 * @create 2023/3/8 18:32
 * @Description
 */
@Component
public class CleanAir  implements IAir{
    @Override
    public String toString() {
        return "CleanAir";
    }
}
