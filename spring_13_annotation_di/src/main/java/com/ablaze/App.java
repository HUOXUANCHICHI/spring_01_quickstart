package com.ablaze;

import com.ablaze.service.BookService;
import com.ablaze.config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lenovo
 */
public class App {
    public static void main(String[] args) {
        //1.加载类路径下的配置文件 加载配置文件初始化容器
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        BookService bookService = ctx.getBean(BookService.class);

        bookService.save();
    }
}
