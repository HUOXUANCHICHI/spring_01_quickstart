package com.ablaze.factory;

import com.ablaze.dao.UserDao;
import com.ablaze.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Lenovo
 */
public class UserDaoFactoryBean implements FactoryBean<UserDao> {

    /**
     * 代替原始实例工厂中创建对象的方法 得到bean实例
     * @return
     * @throws Exception
     */
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    /**
     * 得到bean类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        //UserDao的字节码
        return UserDao.class;
    }
//
//    /**
//     * 控制单例true 非单例false
//     * @return
//     */
//    @Override
//    public boolean isSingleton() {
//        return false;
//    }

}
