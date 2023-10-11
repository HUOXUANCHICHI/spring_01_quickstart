package com.ablaze.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @author Lenovo
 */
public interface AccountService {

    /**
     * 转账操作
     * @param out 转出方
     * @param in 转入方
     * @param money 金额
     */
    @Transactional
    void transfer(String out,String in,Double money);

}
