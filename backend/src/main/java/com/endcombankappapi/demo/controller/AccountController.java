package com.endcombankappapi.demo.controller;

import com.endcombankappapi.demo.AccountService;
import com.endcombankappapi.demo.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/create-account/")
@CrossOrigin
public class AccountController {
    private final AccountService accountService;
    @Autowired

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }//constructor

    @GetMapping
    public List <Account> getAllAccount(){
        return accountService.getAllAccount();
    }//get all Account

    @PostMapping
    public void addAccount(@RequestBody Account account){
        accountService.addAccount(account);
    }//add Account

    @PutMapping(path = "{id}")
    public void updateAccount(@PathVariable("id") Long id,
                              @RequestParam(required = false) String account,
                              @RequestParam(required = false) Float balance)
    {
        accountService.updateAccount(id, account, balance);
    }//updateUser
}//class
