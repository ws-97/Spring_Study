package com.example.proxy;

/**
 * @Author ws
 * @create 2023/3/8 20:41
 * @Description 静态代理
 * 有了ProxyServiceA之后，打印日志和增加try-catch只需要放在
 * ProxyServiceA类里面，便于后续修改，比如现在打印日志是输出在
 * 操作台的，哪天需要输出到日志文件时候也只需修改ProxyServiceA中
 * 的打印操作即可
 * 问题：项目中的接口可不止一个，而且接口中的方法也很多，一个一个增加的也是问题
 * 动态代理就可以解决这样的问题
 */
public class ProxyServiceA implements IService{
    private final IService service;

    public ProxyServiceA(IService service) {
        super();
        this.service=service;
    }

    @Override
    public void service(String name) throws Exception {
        System.out.println("log start");
        try{
            service.service(name);
        }catch (Exception e){
            throw e;
        }
        System.out.println("log end");
    }


    public static void main(String[] args) throws Exception {
        IService service=new ServiceImplA();
        service=new ProxyServiceA(service);
        service.service("CXK");
    }
}
