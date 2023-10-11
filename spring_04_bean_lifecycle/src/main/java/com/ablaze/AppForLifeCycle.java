package com.ablaze;

import com.ablaze.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 */
public class AppForLifeCycle {
    public static void main(String[] args) {
        //3.获取IoC容器 ClassPathXmlApplicationContext可关闭容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        BookDao bookService = (BookDao) ctx.getBean("bookDao");

        bookService.save();
        ctx.registerShutdownHook();
//        ctx.close();
    }
}
