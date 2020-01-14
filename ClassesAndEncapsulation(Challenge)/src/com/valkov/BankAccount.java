package com.valkov;

public class BankAccount {
    private int accNumber;
    private double accountBalance;
    private String name;
    private String email;
    private String phoneNumber;
    public BankAccount(){
        this(0,0,"null","null","0");
    }
    public BankAccount(int accNumber, double accountBalance, String name, String email, String phoneNumber){
        this.accNumber=accNumber;
        this.accountBalance=accountBalance;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this(500,500,name,email,phoneNumber);
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;

    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;

    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public double getWithdrawalAmount(double withdrawal) {
        accountBalance = accountBalance - withdrawal;
        if (accountBalance - withdrawal < 0) {
            return 0;
        } else {
            return accountBalance;
        }
    }
    public double getDepositAmount(double deposit){
        accountBalance=accountBalance+deposit;
        return accountBalance;
    }
}