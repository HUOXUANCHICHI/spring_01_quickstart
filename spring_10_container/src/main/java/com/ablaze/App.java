package com.ablaze;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Lenovo
 */
public class App {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从文件系统下加载配置文件
/*        ApplicationContext ctx = new FileSystemXmlApplicationContext("G:\\SSM\\Spring\\Workspace\\spring_10_container\\src\\main\\resources\\applicationContext.xml");
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");*/
        /*BookDao bookDao = ctx.getBean("bookDao", BookDao.class);*/
/*
        BookDao bookDao = ctx.getBean(BookDao.class);
        bookDao.save();
*/

    }
}
