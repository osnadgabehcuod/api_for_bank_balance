package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {
    //create a holder for the connection AccountRepository
    private final AccountRepository accountRepository;

    //bring an instance of the accountRepository connection alive
    public AccountController(AccountRepository accountRepository){
        //save that connection into this.accountRepository
        this.accountRepository = accountRepository;
    }
    //fetch all accounts in the db
    @GetMapping("/balance")
    public List<Account> getAllAccounts(){
        return accountRepository.findAll();
    }
    //from postman, get all entries from the user and post them into the db
    @PostMapping
    public Account createAccount(@RequestBody Account newAccount){
        return accountRepository.save(newAccount);
    }
}
