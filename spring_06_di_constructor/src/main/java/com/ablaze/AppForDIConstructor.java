package com.ablaze;

import com.ablaze.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 */
public class AppForDIConstructor {
    public static void main(String[] args) {
        //3.获取IoC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean
        BookService bookService = (BookService) ctx.getBean("bookService");

        bookService.save();

    }
}
