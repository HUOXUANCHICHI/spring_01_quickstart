package com.ablaze.dao.impl;

import com.ablaze.dao.BookDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Lenovo
 */
@Repository("bookDao")
@Scope("singleton")
public class BookDaoImpl implements BookDao {

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }
    @PostConstruct
    public void init() {
        System.out.println("init ...");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("destroy...");
    }

}
