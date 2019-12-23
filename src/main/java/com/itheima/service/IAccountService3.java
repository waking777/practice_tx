package com.itheima.service;

import com.itheima.domain.Account;
import org.springframework.stereotype.Repository;

/**
 * 账户的业务层接口
 */
public interface IAccountService3 {

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
    void tranfer(String sourceName, String targetName, float money);
}
