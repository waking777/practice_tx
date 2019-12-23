package com.itheima.service.impl;

import com.itheima.dao.IAccountDao2;
import com.itheima.dao.IAccountDao3;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService2;
import com.itheima.service.IAccountService3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("accountService3")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AccountServiceImpl3 implements IAccountService3 {

    @Autowired
    private IAccountDao3 accountDao;


    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)

    public void tranfer(String sourceName, String targetName, float money) {

        Account source = accountDao.findAccountByName(sourceName);
        Account target = accountDao.findAccountByName(targetName);

        source.setMoney(source.getMoney() - money);
        target.setMoney(target.getMoney() + money);

//        int i = 1/0;
        System.out.println("transfer....");
        accountDao.updateAccount(source);
        accountDao.updateAccount(target);

    }
}
