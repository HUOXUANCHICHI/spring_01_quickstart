package com;

import com.ablaze.config.SpringConfig;
import com.ablaze.dao.BookDao;
import com.ablaze.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lenovo
 */
public class AppForAnnotation {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件 加载配置类初始化容器
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        System.out.println(bookDao);

        BookService bookService = ctx.getBean(BookService.class);

        System.out.println(bookService);
    }
}
