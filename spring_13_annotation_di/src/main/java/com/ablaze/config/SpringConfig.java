package com.ablaze.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Lenovo
 */
@Configuration
@ComponentScan("com.ablaze")
@PropertySource({"classpath:jdbc.properties"})
public class SpringConfig {
}
