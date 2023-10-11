package com.ablaze.service.impl;

import com.ablaze.dao.BookDao;
import com.ablaze.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Lenovo
 */
@Service
public class BookServiceImpl implements BookService{
    /**
     * 注入Dao 暴力反射 默认按类型装配
     */
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();


    }

}
