package com.ablaze;

import com.ablaze.dao.BookDao;
import com.ablaze.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 */
public class App {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件 加载配置文件初始化容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从文件系统天下加载配置文件
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        System.out.println(bookDao);

        BookService bookService = ctx.getBean(BookService.class);

        System.out.println(bookService);
    }
}
