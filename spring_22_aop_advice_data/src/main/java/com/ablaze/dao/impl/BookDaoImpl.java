package com.ablaze.dao.impl;

import com.ablaze.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @author Lenovo
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public String findName(int id, String password) {
        System.out.println("id:" + id);
        if(true) {
            throw new NullPointerException();
        }
        return "itcast";
    }
}
