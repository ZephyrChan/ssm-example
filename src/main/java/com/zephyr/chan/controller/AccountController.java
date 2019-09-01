package com.zephyr.chan.controller;

import com.zephyr.chan.domain.Account;
import com.zephyr.chan.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private IAccountService iAccountService;

    @RequestMapping("/findAll")
    public String findAll(Model model){
        System.out.println("AccountController.findAll()执行了。。。。");
        //调用service的方法
        List<Account> all = iAccountService.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        model.addAttribute("list",all);
        return "list";
    }

}
