package cn.mit.service;

import cn.mit.lib.Bar;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect
{
    @Pointcut("execution(* cn.mit.lib.Bar.*())")
//    @Pointcut("execution(* cn.mit.lib.Bar.*(..))")
    public void say() {}

    //    @Before("cn.mit.service.SimplePointcut.test()")
//    @Before("execution(* cn.mit.lib.Foo.say())")
    @Before("say()")
    public void doSomething(JoinPoint joinPoint)
    {
        System.out.println("in @Aspect SimpleAspect doSomething");
    }

    @AfterReturning(value = "cn.mit.service.SimplePointcut.say() && args(x, ..)", returning = "res")
    public void doSomething2(String x, String res)
    {
//        System.out.println(((Bar)bean).label);
        System.out.println(x);
        System.out.println("res = " + res);
//        System.out.println(y);
        System.out.println("in @Aspect SimpleAspect doSomething2");
    }
}

