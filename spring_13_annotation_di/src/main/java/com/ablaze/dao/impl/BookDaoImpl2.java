package com.ablaze.dao.impl;

import com.ablaze.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author Lenovo
 */
@Repository("bookDao2")
public class BookDaoImpl2 implements BookDao {


    @Override
    public void save() {
        System.out.println("book dao save ...2");
    }


}
