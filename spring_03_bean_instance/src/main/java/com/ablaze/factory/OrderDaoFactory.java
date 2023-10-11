package com.ablaze.factory;

import com.ablaze.dao.OrderDao;
import com.ablaze.dao.impl.OrderDaoImpl;

/**
 * @author Lenovo
 */
public class OrderDaoFactory {
    public static OrderDao getOrderDao() {
        System.out.println("factory setup...");
        return new OrderDaoImpl();
    }
}
