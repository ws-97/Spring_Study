package com.example.container;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @Author ws
 * @create 2023/3/9 09:27
 * @Description
 */
public class UserBean implements BeanNameAware, BeanFactoryAware,
        InitializingBean, DisposableBean {


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println(beanFactory);
    }

    @Override
    public void setBeanName(String s) {

        System.out.println(s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitialzingBean");
    }
}
