package com.Aop;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @Author ws
 * @create 2023/3/9 15:16
 * @Description
 */
public class AOPInterceptor implements AfterReturningAdvice,
        MethodBeforeAdvice, ThrowsAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("方法；"+method.getName()+"运行结束，返回值为："+o);
    }

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {

        System.out.println("执行methodBeforeAdvice,即将执行的方法："+
                method.getName());
        if(o instanceof AOPServicesImpl){
            String description=((AOPServicesImpl)o).getDescription();
            if(description==null){
                throw new NullPointerException("description属性不能为null");
            }
        }
    }

    public void afterThrowing(Exception exception){
        System.out.println("抛出了异常："+exception.getMessage());
    }
    public void afterThrowing(Method method,Object[] args,Object target,
                              Exception ex){
        System.out.println("方法"+method.getName()+"抛出了异常："+ex.getMessage());
    }
}
