package com.zephyr.chan.service;

import com.zephyr.chan.domain.Account;

import java.util.List;

public interface IAccountService {

    public List<Account> findAll();

    public void saveAccount(Account account);
}
