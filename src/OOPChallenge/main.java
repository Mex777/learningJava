package OOPChallenge;

import javax.swing.*;
import java.util.Scanner;

public class main {
    burger burger;
    String yes = new String("yes");
    boolean letuce, tomatoes, onions, carrots, ketchupSauce, mayonaisseSauce;
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Making a new object to be able to use the global variables
        main go = new main();
        //Getting the burger type
        Scanner input = new Scanner(System.in);
        System.out.print(" Hello, welcome to Bill's burgers, which burger would you like to buy?\n 1.Regular-Burger      2.Healthy-Burger      3.Deluxe-Burger\n Enter the number:");
        int burgerType = input.nextInt();
        // CHECKING if the burger number doesn't exist
        while (burgerType <1 || burgerType > 3 ) {
            System.out.print("Numar invalid, mai incearca odata: ");
            burgerType = input.nextInt();

        }
            //CHECKING what type of burgers do they want.
            if (burgerType == 1) {
                go.regularBurger();
            } else if (burgerType == 2) {
                go.healthyBurger();
            } else if (burgerType == 3) {
                go.deluxeBurger();

            }
        go.burger.getToppings();
        System.out.println("Your type of burger is: " + go.burger.getName() + "\nYour type of bread is: " + go.burger.getBreadType() + "\nYour type of meat is: " + go.burger.getMeatType());
        System.out.println("Your price is: $" + go.burger.getPrice());

    }
    public void regularBurger() {
        // Creating a new regular burger
        burger = new burger();
        System.out.print("Now tell me what type of meat would you like:");
        // Getting the meat type from the user
        String meat = input.nextLine();
        burger.setMeatType(meat);
        // Getting the bread type from the user
        System.out.print("Now tell me what type of bread would you like:");
        String bread = input.nextLine();
        burger.setBreadType(bread);

        System.out.print("Do you want lettuce on the burger?");
        String answer = new String(input.nextLine());
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            letuce = true;
        } else {
            letuce = false;
        }

        System.out.print("Do you want tomatoes on the burger?");
        answer = input.nextLine();
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            tomatoes = true;
        } else {
            tomatoes = false;
        }


        System.out.print("Do you want carrots on the burger?");
        answer = input.nextLine();
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            carrots = true;
        } else {
            carrots = false;
        }


        System.out.print("Do you want onions on the burger?");
        answer = input.nextLine();
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            onions = true;
        } else {
            onions = false;
        }
        //Adding the toppings
        burger.addTopings(letuce, tomatoes, carrots, onions, ketchupSauce, mayonaisseSauce);
    }
    public void healthyBurger() {
        // Making a new Healthy Burger
        burger = new healthyBurger();
        System.out.print("Now tell me what type of meat would you like:");
        // Getting the type of meat  from the user
        String meat = input.nextLine();
        burger.setMeatType(meat);


        System.out.print("Do you want lettuce on the burger?");
        String answer = new String(input.nextLine());
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            letuce = true;
        } else {
            letuce = false;
        }


        System.out.print("Do you want tomatoes on the burger?");
        answer = input.nextLine();
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            tomatoes = true;
        } else {
            tomatoes = false;
        }


        System.out.print("Do you want carrots on the burger?");
        answer = input.nextLine();
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            carrots = true;
        } else {
            carrots = false;
        }


        System.out.print("Do you want onions on the burger?");
        answer = input.nextLine();
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            onions = true;
        } else {
            onions = false;
        }


        System.out.print("Do you want ketchup sauce on the burger?");
        answer = input.nextLine();
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            ketchupSauce = true;
        } else {
            ketchupSauce = false;
        }


        System.out.print("Do you want mayonaisse sauce on the burger?");
        answer = input.nextLine();
        //Checking if the String is "yes"
        if (yes.equals(answer.toLowerCase())) {
            mayonaisseSauce = true;
        } else {
            mayonaisseSauce = false;
        }
        //Adding the toppings
        burger.addTopings(letuce, tomatoes, carrots, onions, ketchupSauce, mayonaisseSauce);
    }
    public void deluxeBurger() {
        // Adding a new Deluxe Burger
        burger = new deluxeBurger();
        System.out.print("Now tell me what type of meat would you like:");
        // Getting the meat type from the user
        String meat = input.nextLine();
        burger.setMeatType(meat);
        System.out.print("Now tell me what type of bread would you like:");
        // Getting the bread type from the user
        String bread = input.nextLine();
        burger.setBreadType(bread);
    }
}
