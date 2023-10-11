package com.ablaze.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Lenovo
 */
@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* com.ablaze.dao.BookDao.findName(..))")
    private void pt() {
    }

    //@Before：前置通知，在原始方法运行之前执行
//    @Before("pt()")
    public void before(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("before advice ...");
    }

    //@After：后置通知，在原始方法运行之后执行
//    @After("pt()")
    public void after(JoinPoint jp) {
        Object[] args = jp.getArgs();
        System.out.println(Arrays.toString(args));
        System.out.println("after advice ...");
    }

    //@Around：环绕通知，在原始方法运行的前后执行  重点
//    @Around("pt()")
    public Object around(ProceedingJoinPoint pjp) {
        Object[] args = pjp.getArgs();
        System.out.println(Arrays.toString(args));
        args[0] = 666;
        //表示对原始操作的调用
        Object ret = null;
        try {
            ret = pjp.proceed(args);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return ret;
    }

    //@AfterReturning：返回后通知，在原始方法执行完毕后运行，且原始方法执行过程中未出现异常现象
    @AfterReturning(value = "pt()", returning = "ret")
    public void afterReturning(JoinPoint jp, String ret) {
        System.out.println("afterReturning advice ..." + ret);
    }

    //@AfterThrowing：抛出异常后通知，在原始方法执行过程中出现异常后运行
    @AfterThrowing(value = "pt()", throwing = "t")
    public void afterThrowing(Throwable t) {
        System.out.println("afterThrowing advice ..." + t);
    }

}
