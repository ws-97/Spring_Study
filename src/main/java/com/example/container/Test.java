package com.example.container;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test
{
    public static void main( String[] args ) throws Exception
    {
        System.out.println( "Hello World!" );
        //使用ApplicationContext获取bean的配置，然后赋值给
        //BeanFactory接口对象（因为其实ApplicationContext接口实现了
        // BeanFactory接口）
        //ClassPathXmlApplicationContext表示从类路径下加载配置文件
        //文件路径默认值的是项目的classpath
        //如果指向绝对路径则需要加上file:

        //FileSystemXmlApplicationContext表示从文件系统中加载配置文件，文件
        //路径默认值的是项目根目录，如想要使用项目的classpath路径，则需要加上classpath:
        ApplicationContext context=new ClassPathXmlApplicationContext(new
                String[]{"ApplicationContext.xml"});

        //BeanFactory主要面对Spring框架的基础设施，面对Spring自己
        //ApplicationContext主要面对于Spring使用的开发者
        BeanFactory factory=context;
        UserBean user=(UserBean) factory.getBean("user");
        user.destroy();

    }
}
