package com.ablaze.config;

import com.ablaze.dao.BookDao;
import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
//@Configuration
public class JdbcConfig {
    //1.定义一个方法获得要管理的对象
    //2.添加@Bean，表示当前方法的返回值是一个bean
    @Value("com.mysql.cj.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://localhost:3306/spring_db?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai")
    private String url;
    @Value("root")
    private String userName;
    @Value("Xh710708")
    private String password;
    @Bean
    public DataSource dataSource(BookDao bookDao){
        System.out.println(bookDao);
        DruidDataSource ds =new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        return ds;
    }
}
