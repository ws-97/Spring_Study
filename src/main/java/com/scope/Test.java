package com.scope;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author ws
 * @create 2023/3/9 14:19
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext(
                new String[]{"applicationContext.xml"}
        );
        BeanFactory factory=context;
        UserBean user= (UserBean) context.getBean("user1");
        ((ClassPathXmlApplicationContext)context).close();
    }
}
