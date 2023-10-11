package com.ablaze.dao.impl;

import com.ablaze.dao.BookDao;

/**
 * @author Lenovo
 */
public class BookDaoImpl implements BookDao {

    private BookDaoImpl() {
        System.out.println("book dao constructor is running ...");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");

    }
}
