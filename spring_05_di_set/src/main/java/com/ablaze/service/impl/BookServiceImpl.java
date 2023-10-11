package com.ablaze.service.impl;

import com.ablaze.service.BookService;
import com.ablaze.dao.BookDao;
import com.ablaze.dao.UserDao;

/**
 * @author Lenovo
 */
public class BookServiceImpl implements BookService {
    /**
     * 5.删除业务层中使用new的方式创建的dao对象
     */
    private BookDao bookDao;

    private UserDao userDao;

    /**
     * 6.提供对应的set方法
     *
     * @param bookDao
     */
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();
        userDao.save();
    }
}
