package Arraylist2;

import java.util.ArrayList;

public class Customers {
    private String name;
    private ArrayList<Double> transactions;

    public Customers(String name) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
    }
    public void addTransaction(double sum) {
        transactions.add(sum);
    }
    public void showTransactions() {
        for (int i=0; i<transactions.size(); i++)
            System.out.println("$" + transactions.get(i));
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
