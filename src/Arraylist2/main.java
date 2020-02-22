package Arraylist2;

public class main {
    public static void main(String[] args) {
        Bank bT = new Bank("Banca Transilvania");
        bT.addBranch("Dristor");
        bT.addCustomer("Dristor", "George", 600.15);
        bT.addTransaction("Dristor", "George", 14.22);
        bT.showTransactions("Dristor", "George");
        bT.showBranches();
        bT.showCustomers("Dristor");
    }
}
