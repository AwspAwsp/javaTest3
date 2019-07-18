package com.example.exam1.ApplicationContext.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class fileAop {
    @Pointcut("execution(* com.example.exam1.ApplicationContext.service.FileServempl.*(..))")
    public void test(){
    }

    @Before("test()")
    public void before(){
        System.out.println("BeforeInsertFilmData");
    }
    @After("test()")
    public void after()
    {
        System.out.println("AfterInsertFilmData");
    }
}
