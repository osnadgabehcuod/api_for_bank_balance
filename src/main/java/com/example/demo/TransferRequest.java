package com.example.demo;

public class TransferRequest {
    private Long sourceAccountId;
    private Long targetAccountId;
    private Double amount;

    public TransferRequest(){

    }

    public TransferRequest(Long sourceAccountId, Long targetAccountId, Double amount){
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.amount = amount;
    }

    //getters
    public Long getSourceAccountId(){
        return sourceAccountId;
    }
    public Long getTargetAccountId(){
        return targetAccountId;
    }
    public Double getAmount(){
        return amount;
    }



}