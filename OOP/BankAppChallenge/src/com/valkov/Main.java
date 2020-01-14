package com.valkov;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
    Bank bank=new Bank("KTB");
    bank.addBranch("Sofia");
    bank.addCustomer("Sofia", "Rosen", 50.5);
    bank.addCustomer("Sofia", "Georgi", 60.8);
    bank.addCustomer("Sofia", "Loren", 62.8);

    bank.addBranch("Plovdiv");
    bank.addCustomer("Plovdiv", "Dimitar", 210.8);
    bank.addCustomerTransaction("Sofia", "Rosen", 442.9);
    bank.listCustomers("Sofia",false);
    bank.listCustomers("Plovdiv", true);
    if(!bank.addCustomer("Varna"," Gergana",2312.8)){
        System.out.println("Branch does not exist.");
    }
    if(!bank.addBranch("Sofia")){
        System.out.println("Branch already exists");
    }

    }
}