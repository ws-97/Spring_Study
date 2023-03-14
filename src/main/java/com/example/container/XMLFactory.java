package com.example.container;

import com.example.example.CleanAir;

/**
 * @Author ws
 * @create 2023/3/9 10:56
 * @Description
 */
public class XMLFactory {
    public XMLInstance CreateInstance(){
        return new XMLInstance("instance",new CleanAir());
    }

    public static XMLInstance CreateStaticInstance(){
        return new XMLInstance("static instance",new CleanAir());
    }


}
