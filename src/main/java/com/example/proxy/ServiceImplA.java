package com.example.proxy;

/**
 * @Author ws
 * @create 2023/3/8 20:44
 * @Description
 */
public class ServiceImplA implements IService{
    @Override
    public void service(String name) throws Exception {
        System.out.println("ServiceImplA name"+name);
    }
}
