package com.itheima.test;

import com.itheima.service.IAccountService;
import com.itheima.service.IAccountService2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:bean2.xml")
public class AccountServiceTest2 {

    @Autowired
    private IAccountService2 as;

    @Test
    public void testTransfer(){
        as.transfer("abc","周冬雨",100f);
    }
}
