package com.example;

import com.example.container.UserBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext(new
                String[]{"ApplicationContext.xml"});

        BeanFactory factory=context;
        UserBean user=(UserBean) factory.getBean("user");
        user.destroy();

    }
}
