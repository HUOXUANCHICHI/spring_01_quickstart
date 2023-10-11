package com.ablaze.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Lenovo
 */
@Configuration
@ComponentScan("com.ablaze")
@EnableAspectJAutoProxy
public class SpringConfig {
}
