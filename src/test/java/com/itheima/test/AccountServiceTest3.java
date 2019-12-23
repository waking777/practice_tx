package com.itheima.test;


import com.itheima.service.IAccountService3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = config.SpringConfiguration.class)
public class AccountServiceTest3 {

    @Autowired
    private IAccountService3 as;

    @Test
    public void testTransfer(){
        as.tranfer("abc","周冬雨",100f);
    }
}
