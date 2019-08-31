package com.zephyr.chen.controller;

import com.zephyr.chen.domain.Account;
import com.zephyr.chen.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService iAccountService;

    @RequestMapping("/findAll")
    public String findAll(){
        System.out.println("AccountController.findAll()执行了。。。。");
        //调用service的方法
        List<Account> all = iAccountService.findAll();
        return "list";
    }

}