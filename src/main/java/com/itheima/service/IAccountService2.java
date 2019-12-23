package com.itheima.service;

import com.itheima.domain.Account;

/**
 * 账户的业务层接口
 */

public interface IAccountService2 {

    /**
     * 根据用户id来查账户信息
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);


    /**
     * 转账
     * @param sourceName
     * @param targetName
     * @param money
     */
    void transfer(String sourceName,String targetName,Float money);

}
