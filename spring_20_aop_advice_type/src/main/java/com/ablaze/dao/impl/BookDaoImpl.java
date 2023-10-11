package com.ablaze.dao.impl;

import com.ablaze.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author Lenovo
 */
@Repository
public class BookDaoImpl implements BookDao {



    @Override
    public void update() {
        System.out.println("book dao update is running ...");
    }

    @Override
    public int select() {
        System.out.println("book dao select is running ...");
//        int i = 1/0;
        return 100;
    }
    @Override
    public void select2() {
        System.out.println("book dao select is running ...");
//        int i = 1/0;
        throw new RuntimeException("这是运行时异常");
    }
}
