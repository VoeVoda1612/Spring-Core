package edu.project.sample.spring.aop.annotations;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnnotationsAspectClass {

    @Pointcut("execution(* *(..))")
    private void allMethods(){}

    @Before("allMethods()")
    public void methodBefore(){
        System.out.println("AnnotationsAspectClass methodBefore()");
    }

    @After("allMethods()")
    public void methodAfter(){
        System.out.println("AnnotationsAspectClass methodAfter()");
    }
}
