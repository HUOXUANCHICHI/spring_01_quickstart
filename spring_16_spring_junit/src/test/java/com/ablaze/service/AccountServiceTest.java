package com.ablaze.service;


import com.ablaze.config.SpringConfig;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

//@SpringJUnitConfig(classes = SpringConfig.class)//JUint5 两句话合成一句话,会报错但不影响使用
//JUint4
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = SpringConfig.class)
//JUint5
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testFindById() {
        System.out.println(accountService.findById(2));
    }

    @Test
    public void testFindAll() {
        System.out.println(accountService.findAll());
    }
}
