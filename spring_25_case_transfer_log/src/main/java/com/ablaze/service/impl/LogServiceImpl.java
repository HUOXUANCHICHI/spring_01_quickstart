package com.ablaze.service.impl;


import com.ablaze.dao.LogDao;
import com.ablaze.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    @Qualifier("logDao")
    private LogDao logDao;

    @Override
    public void log(String out, String in, Double money) {
        logDao.log("转账操作由" + out + "到" + in + ",金额：" + money);
    }
}
