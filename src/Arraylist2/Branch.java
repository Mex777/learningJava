package Arraylist2;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customers>  customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customers>();
 }
    public void addCustomer (String name, double initialTransaction) {
        if (searchName(name) < 0) {
            Customers  newCustomer = new Customers(name);
            newCustomer.addTransaction(initialTransaction);
            customers.add(newCustomer);
        }
        else
            System.out.println("This customer already exists");
    }
    public void showCustomers() {
        System.out.println("Customers are:");
        for (int i=0; i<customers.size(); i++)
            System.out.println((i+1) + ". " + customers.get(i).getName());
    }
    public int searchName(String name) {
        for (int i=0; i<customers.size(); i++) {
            if (customers.get(i).getName().equals(name))
                return i;
        }
        return -1;
    }
    public boolean checkValidity(String name) {
        for (int i=0; i<customers.size(); i++) {
            if(customers.get(i).getName().equals(name))
                return true;
        }
        return false;
    }
    public void addTransaction(String name,double sum) {
        if (searchName(name) >= 0)
            customers.get(searchName(name)).addTransaction(sum);
        else
            System.out.println("Name not found.");
    }

    public String getName() {
        return name;
    }
    public void showTransactions(String name) {
        System.out.println(name + "'s transactions are: ");
        if (searchName(name) >= 0) {
            customers.get(searchName(name)).showTransactions();
        }
    }
}
