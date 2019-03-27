package com.example.controller;

import lombok.extern.java.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Aspect
@Configuration
@Log
public class logAspect {

  //  private Logger logger = LoggerFactory.getLogger(this.getClass());
//  private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(logAspect.class);
    //What kind of method calls I would intercept
    //execution(* PACKAGE.*.*(..))
    //Weaving & Weaver
    @Before("execution(* com.example.controller.controller1.index1(..))")
    public void before(JoinPoint joinPoint){
        //Advice
        System.out.println("before method" + joinPoint.getClass());
//        logger.info(" Check for user access ");
//        logger.info(" Allowed execution for {}", joinPoint);
    }

    @After("execution(* com.example.controller.controller2.*(..))")
    public void after(JoinPoint joinPoint)
    {
        System.out.println("after method" + joinPoint.getClass());
    }
}
