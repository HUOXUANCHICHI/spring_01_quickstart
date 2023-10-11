package com.ablaze;

import com.ablaze.dao.BookDao;
import com.ablaze.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author Lenovo
 */
public class App {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookDao bookDao = ctx.getBean(BookDao.class);

        bookDao.update();
        int num = bookDao.select();
        bookDao.select2();
        System.out.println(num);
    }
}
