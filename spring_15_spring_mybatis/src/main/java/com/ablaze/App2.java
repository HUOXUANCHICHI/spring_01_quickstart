package com.ablaze;

import com.ablaze.config.SpringConfig;
import com.ablaze.domain.Account;
import com.ablaze.service.AccountService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Lenovo
 */
public class App2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        Account ac = accountService.findById(2);

        System.out.println(ac);

    }
}
