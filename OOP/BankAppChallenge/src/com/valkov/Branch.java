package com.valkov;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> myCustomer;

    public Branch(String name) {
        this.name=name;
        this.myCustomer = new ArrayList<Customer>();
    }

    public boolean addNewCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName)==null){
            this.myCustomer.add(new Customer(customerName,initialAmount));
            return true;
        }
        return false;

    }

    private int findCustomer(Customer customer) {
        return this.myCustomer.indexOf(customer);
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.myCustomer.size(); i++) {
            Customer customer = this.myCustomer.get(i);
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
    public boolean addNewTransaction(String customerName, double amount){
        Customer existingCustomer=findCustomer(customerName);
        if(existingCustomer!=null){
        existingCustomer.addTransaction(amount);
        return true;

        }
        return false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getMyCustomer() {
        return myCustomer;
    }
}