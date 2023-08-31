package com.java_spring_boot.controller;

import com.java_spring_boot.model.Account;
import com.java_spring_boot.service.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@CrossOrigin("*")
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    AccountServiceImpl accountService;
    @GetMapping
    public List<Account> getAll(){
        return accountService.getAll();
    }
}