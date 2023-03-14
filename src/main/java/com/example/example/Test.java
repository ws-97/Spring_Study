package com.example.example;

/**
 * @Author ws
 * @create 2023/3/8 18:06
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        CustomDescriptions customDescriptions=new Student().getClass()
                .getAnnotation(CustomDescriptions.class);
        for (CustomDescription h: customDescriptions.value()){
            System.out.println("description :"+h.description());
        }

    }
}
