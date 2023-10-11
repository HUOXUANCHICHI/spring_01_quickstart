package com.ablaze.dao.impl;

import com.ablaze.dao.BookDao;

/**
 * @author Lenovo
 */
public class BookDaoImpl implements BookDao {


    public BookDaoImpl() {
        System.out.println("constructor");
    }

    @Override
    public void save() {
        System.out.println("book dao save ...");
    }

}
