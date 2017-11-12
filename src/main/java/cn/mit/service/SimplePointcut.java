package cn.mit.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class SimplePointcut
{
    @Pointcut("execution(* cn.mit.lib.Bar.*(..))")
//    @Pointcut("execution(* cn.mit.lib.Bar.*(..))")
    public void say() {}
}
