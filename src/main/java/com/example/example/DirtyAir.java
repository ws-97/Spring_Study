package com.example.example;

import org.springframework.stereotype.Component;

/**
 * @Author ws
 * @create 2023/3/8 18:47
 * @Description
 */
@Component
public class DirtyAir implements IAir{
    @Override
    public String toString() {
        return "DirtyAir";
    }
}
