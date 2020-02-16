package Encapsulation;

public class main {
    public static void main(String[] args) {
        Printer myPrinter = new Printer("HP-energyStar", "HP", true);
        System.out.println(myPrinter.getTonerLevel() + "%");
        myPrinter.print(25);
        System.out.println(myPrinter.getTonerLevel() + "%");
        myPrinter.print(112);
        System.out.println(myPrinter.getTonerLevel() + "%");
        myPrinter.print(100);
        myPrinter.fillToner();
        System.out.println(myPrinter.getTonerLevel() + "%");
    }
}
