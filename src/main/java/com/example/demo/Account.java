package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//creating the database
@Entity //map this class to a table in my db
@Table(name = "bankAccounts")

public class Account {

    @Id //create an id tag on the table as a column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //other column keys "variables" for the table
    private String accountNumber;
    private Double accountBalance;
    private String currency;

    public Account(String accountNumber, Double accountBalance, String currency){
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.currency = currency;
    }
    //constructor for hibernate to create an instance of the class in ram
    public Account() {
    }

    //getters for all the parameters of the table for the db
    public Long getId(){
        return id;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public Double getAccountBalance(){
        return accountBalance;
    }
    public String getCurrency(){
        return currency;
    }

    //setters to post the entered amount from users
    public void setAccountBalance(Double accountBalance){
        this.accountBalance = accountBalance;
    }
}
