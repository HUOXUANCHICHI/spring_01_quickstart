package com.ablaze.service.impl;

import com.ablaze.dao.BookDao;
import com.ablaze.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author Lenovo
 */
//@Component
@Service
public class BookServiceImpl implements BookService{
    /**
     * 5.删除业务层中使用new的方式创建的dao对象 注入Dao
     */
    private BookDao bookDao;

    /**
     * 提供set方法
     * @param bookDao
     */
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public void save() {
        System.out.println("book service save ...");
        bookDao.save();


    }

}
