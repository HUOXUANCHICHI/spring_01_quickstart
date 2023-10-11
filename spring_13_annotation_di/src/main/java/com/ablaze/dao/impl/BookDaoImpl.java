package com.ablaze.dao.impl;

import com.ablaze.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

/**
 * @author Lenovo
 */
@Repository("bookDao")
public class BookDaoImpl implements BookDao {

    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save ..."+name);
    }


}
