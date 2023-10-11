package com.ablaze;

import com.ablaze.config.SpringConfig;
import com.ablaze.service.ResourcesService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

/**
 * @author Lenovo
 */
public class App {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        ResourcesService resourcesService = ctx.getBean(ResourcesService.class);

        boolean flag = resourcesService.openURL("https://pan.baidu.com/haha", "root  ");

        System.out.println(flag);
    }
}
