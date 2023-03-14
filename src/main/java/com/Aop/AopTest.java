package com.Aop;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ws
 * @create 2023/3/9 15:31
 * @Description
 */
public class AopTest {
    public static void main(String[] args) throws Exception{
        ApplicationContext context=new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        BeanFactory factory=context;
        IAOPServices services=(IAOPServices) context.getBean("aopService");
        services.withAopMethod();
        services.withNoAopMethod();
    }
}
