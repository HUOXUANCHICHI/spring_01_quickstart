package com.ablaze.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    //@Pointcut("execution(void com.ablaze.dao.BookDao.update())")
    //@Pointcut("execution(void com.ablaze.dao.impl.BookDaoImpl.update())")
    //@Pointcut("execution(* com.ablaze.dao.impl.BookDaoImpl.update(*))")
    //@Pointcut("execution(* *..*(..))")//匹配全部
    //@Pointcut("execution(* *..u*(..))")
    //@Pointcut("execution(* com.ablaze.*.*Service.find*(..))")
    @Pointcut("execution(* com.ablaze.*.*Service.save(..))")//给业务层的保存方法加AOP
    private void pt() {}

    @Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }
}
