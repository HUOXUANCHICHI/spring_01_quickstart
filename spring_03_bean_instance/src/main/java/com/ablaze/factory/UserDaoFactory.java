package com.ablaze.factory;

import com.ablaze.dao.impl.UserDaoImpl;
import com.ablaze.dao.UserDao;

/**
 * @author Lenovo
 */
public class UserDaoFactory {
    public UserDao getUserDao() {
        return new UserDaoImpl();
    }
}
