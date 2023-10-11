package com.ablaze.service.impl;

import com.ablaze.dao.AccountDao;
import com.ablaze.service.AccountService;
import com.ablaze.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Lenovo
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;

    @Override
    public void transfer(String out, String in, Double money) {
        try {
            accountDao.outMoney(out, money);
            int i = 1 / 0;
            accountDao.inMoney(in, money);
        } finally {
            logService.log(out, in, money);
        }

    }
}
