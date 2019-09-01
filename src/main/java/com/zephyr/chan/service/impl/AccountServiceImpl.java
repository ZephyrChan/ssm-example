package com.zephyr.chan.service.impl;

import com.zephyr.chan.domain.Account;
import com.zephyr.chan.service.IAccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements IAccountService {
    @Override
    public List<Account> findAll() {
        System.out.println("AccountServiceImpl.findAll()执行了。。。。");
        return null;
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("AccountServiceImpl.saveAccount()执行了。。。。");
    }
}
