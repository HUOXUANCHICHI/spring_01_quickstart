package com.ablaze.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Lenovo
 */
@Configuration
//@ComponentScan("com.ablaze.config")
@ComponentScan("com.ablaze")
@Import({JdbcConfig.class})
public class SpringConfig {
}
