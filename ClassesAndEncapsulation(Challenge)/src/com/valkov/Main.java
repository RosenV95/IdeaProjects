package com.valkov;

public class Main {

    public static void main(String[] args) {
	BankAccount bankAccount=new BankAccount(2002,1000,"Lazlow","lazlow@gmail.com","0999232");

        System.out.println(bankAccount.getDepositAmount(200));
		System.out.println(bankAccount.getWithdrawalAmount(500));
		BankAccount rosenAcc=new BankAccount("Ross","ross@gmail.com","023232");
		System.out.println(rosenAcc.getAccNumber() + " name "+rosenAcc.getName());
    }
}
