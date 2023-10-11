package com.ablaze;

import com.ablaze.config.SpringConfig;
import com.ablaze.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lenovo
 */
public class App {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件 加载配置文件初始化容器
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        //2.从文件系统天下加载配置文件
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");

        System.out.println(bookDao1);
        System.out.println(bookDao2);

        ctx.close();
    }
}
