package com.ablaze;

import com.ablaze.dao.BookDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 */
public class App {
    public static void main(String[] args) {
        //3.获取IoC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

/*
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
*/

        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
    }
}
