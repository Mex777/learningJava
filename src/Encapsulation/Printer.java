package Encapsulation;

public class Printer {
    private String model;
    private String manufacturerer;
    private int numOfPagesPrinted = 0;
    private int tonerLevel = 100;
    private boolean duplexPrinter;

    public Printer(String model, String manufacturerer, boolean duplexPrinter) {
        this.model = model;
        this.manufacturerer = manufacturerer;
        this.duplexPrinter = duplexPrinter;
    }
    public void print(int numOfPagesPrinted) {
        if (tonerLevel > 0) {
            if (duplexPrinter) {
                this.numOfPagesPrinted += numOfPagesPrinted / 2;
                System.out.println("Printed " + numOfPagesPrinted/2 + " pages" );
            }
            else {
                this.numOfPagesPrinted += numOfPagesPrinted;
                System.out.println("Printed " + numOfPagesPrinted + " pages" );
            }
            if (numOfPagesPrinted < 10 && numOfPagesPrinted > 0) {
                if(tonerLevel - 1 >= 0)
                    tonerLevel -=1;
                else
                    System.out.println("You need to refill the toner");
            } else if (numOfPagesPrinted > 10 && numOfPagesPrinted < 50) {
                if(tonerLevel - 15 >= 0)
                    tonerLevel -= 15;
                else
                    System.out.println("You need to refill the toner");
            } else if (numOfPagesPrinted > 50 && numOfPagesPrinted < 100) {
                if (tonerLevel - 25 >=0)
                    tonerLevel -= 25;
                else
                    System.out.println("You need to refill the toner");
            } else if (numOfPagesPrinted >= 100) {
                if (tonerLevel - 50 >=0)
                    tonerLevel -= 50;
                else
                    System.out.println("You need to refill the toner");
            }
        }

    }
    public void fillToner() {
        System.out.println("Toner refilled");
        this.tonerLevel = 100;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }
}
