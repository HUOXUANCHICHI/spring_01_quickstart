package com.ablaze.service.impl;

import com.ablaze.dao.BookDao;
import com.ablaze.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author Lenovo
 */
public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
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
     *
     * @param bookDao
     */
    public void setBookDao(BookDao bookDao) {
        System.out.println("set...");
        this.bookDao = bookDao;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init");
    }
}
