package com.ablaze.dao.impl;

import com.ablaze.dao.ResourcesDao;
import org.springframework.stereotype.Repository;

/**
 * @author Lenovo
 */
@Repository
public class ResourcesDaoImpl implements ResourcesDao {

    @Override
    public boolean readResources(String url, String password) {
        System.out.println(password.length());
        //模拟校验
        return "root".equals(password);
    }
}
