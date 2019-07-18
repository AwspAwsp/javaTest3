package com.example.exam1.ApplicationContext.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class fileAop2 {
    @Pointcut("execution(* com.example.exam1.ApplicationContext.service.FileServempl.*(..))")
    public void test2(){
    }

    @Before("test2()")
    public void before() throws Exception {
        System.out.println("BeforeInsertFilmData");
        throw new Exception("插入失败，回滚");
    }
    @After("test2()")
    public void after()
    {
        System.out.println("AfterInsertFilmData");
    }
}
