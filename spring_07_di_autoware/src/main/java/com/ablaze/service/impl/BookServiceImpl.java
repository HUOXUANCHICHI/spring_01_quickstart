package com.ablaze.service.impl;

import com.ablaze.dao.BookDao;
import com.ablaze.service.BookService;

/**
 * @author Lenovo
 */
public class BookServiceImpl implements BookService{
    /**
     * 5.删除业务层中使用new的方式创建的dao对象
     */
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
    }

}
