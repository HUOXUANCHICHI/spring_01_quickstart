package com.ablaze.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.ablaze")
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
