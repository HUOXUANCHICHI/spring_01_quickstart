package com.ablaze.service.impl;

import com.ablaze.dao.BookDao;
import com.ablaze.dao.UserDao;
import com.ablaze.service.BookService;

/**
 * @author Lenovo
 */
public class BookServiceImpl implements BookService {
    /**
     * 5.删除业务层中使用new的方式创建的dao对象
     */
    private BookDao bookDao;
    private UserDao userDao;

    public BookServiceImpl(BookDao bookDao, UserDao userDao) {
        this.bookDao = bookDao;
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();

    }
}
