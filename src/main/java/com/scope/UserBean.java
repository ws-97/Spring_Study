package com.scope;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Author ws
 * @create 2023/3/9 14:07
 * @Description
 */
public class UserBean implements BeanNameAware, BeanFactoryAware,
        InitializingBean, DisposableBean, ApplicationContextAware {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("set 方法被调用");
    }

    public UserBean() {
        System.out.println("UserBean类构造方法");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware被调用");
    }

    @Override
    public void setBeanName(String s) {

        System.out.println("sBeanNameAware被调用");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposeableBean被调用");

    }

    public void myInit(){
        System.out.println("myInit被调用");
    }

    public void myDestroy(){
        System.out.println("myDestroy被调用");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean被调用");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext被调用");
    }
}
