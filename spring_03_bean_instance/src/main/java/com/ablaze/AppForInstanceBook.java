package com.ablaze;

import com.ablaze.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 */
public class AppForInstanceBook {
    public static void main(String[] args) {
        //3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        BookDao bookService = (BookDao) ctx.getBean("bookDao");

        bookService.save();
    }
}
