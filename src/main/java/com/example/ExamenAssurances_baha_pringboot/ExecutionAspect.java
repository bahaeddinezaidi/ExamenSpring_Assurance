package com.example.ExamenAssurances_baha_pringboot;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component

@Aspect
public class ExecutionAspect {
    @Pointcut("execution(* com.example.ExamenAssurances_baha_pringboot.services.*.get*(..))")
    public void getMethods() {}

    @After("getMethods()")
    public void afterGetMethods() {
        System.out.println("Bon courage !");
    }
}
