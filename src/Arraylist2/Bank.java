package Arraylist2;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }
    public void addBranch(String name) {
        if (checkName(name) < 0) {
            Branch newBranch = new Branch(name);
            branches.add(newBranch);
        }
        else {
            System.out.println("Branch already exists");
        }
    }
    private int checkName(String name) {
        for (int i=0; i<branches.size(); i++) {
            if(branches.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }
    public void addCustomer(String branchName, String customer, double initialTransaction) {
        if (checkName(branchName) >= 0) {
            branches.get(checkName(branchName)).addCustomer(customer, initialTransaction);
        }
        else
            System.out.println("Branch is invalid");
    }

    public void addTransaction(String branchName,String customerName, double transaction) {
        if (checkName(branchName) >= 0) {
            branches.get(checkName(branchName)).addTransaction(customerName, transaction);
        }
    }
    public void showCustomers(String branchName) {
        if (checkName(branchName) >= 0) {
            branches.get(checkName(branchName)).showCustomers();
        }

    }
    public void showTransactions(String branchName, String customer) {
        if (checkName(branchName) >= 0) {
            branches.get(checkName(branchName)).showTransactions(customer);
        }
    }
    public void showBranches() {
        System.out.println("Branches are: ");
        for (int i=0; i<branches.size(); i++) {
            System.out.println((i+1)+ ". " + branches.get(i).getName());
        }
    }
}
