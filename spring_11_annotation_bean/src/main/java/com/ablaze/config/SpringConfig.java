package com.ablaze.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Lenovo
 */
@Configuration
@ComponentScan({"com.ablaze.service","com.ablaze.dao"})
public class SpringConfig {
}
