package com.ablaze.factory.impl;

import com.ablaze.dao.BookDao;
import com.ablaze.factory.BookService;

/**
 * @author Lenovo
 */
public class BookServiceImpl implements BookService {

    /**
     * 5.删除业务层中使用new的方式创建的dao对象
     */
    private BookDao bookDao;

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

    /**
     * 6.提供对应的set方法
     * @param bookDao
     */
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }
}
