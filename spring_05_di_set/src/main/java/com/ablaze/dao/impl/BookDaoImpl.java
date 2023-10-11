package com.ablaze.dao.impl;

import com.ablaze.dao.BookDao;

/**
 * @author Lenovo
 */
public class BookDaoImpl implements BookDao {

    private int connectionNum;
    private String databaseName;

    public void setConnectionNum(int connectionNum) {
        this.connectionNum = connectionNum;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public void save() {
        System.out.println("book dao save ..."+databaseName+","+connectionNum);
    }

}
