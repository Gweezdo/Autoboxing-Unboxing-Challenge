package com.zjaktheron;

import java.util.ArrayList;

public class Branch {

    private String branchName;
    private ArrayList<Customer> customerArrayList;

    public Branch(String name) {
        this.branchName = name;
        this.customerArrayList = new ArrayList<>();
    }

    public void addCustomer(Customer customer){
        if(customerArrayList.contains(customer)){
            System.out.println(customer.getName() + "is already a customer at "
                                + Bank.getBankName() + "'s" + this.branchName + "branch");
        }else{
            customerArrayList.add(customer);
            System.out.println("Customer + " + customer.getName() + " added.");
        }
    }

    public void deposit(Customer customer, double value){
        
    }

}
