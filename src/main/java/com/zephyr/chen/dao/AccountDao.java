package com.zephyr.chen.dao;

import com.zephyr.chen.domain.Account;

import java.util.List;

public interface AccountDao {

    public List<Account> findAll();

    public void saveAccount(Account account);

}
