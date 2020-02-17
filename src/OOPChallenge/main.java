package OOPChallenge;

import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        burger burgar = new burger("Sesame roll", "beef" );
//        burgar.addTopings(true, true, true, true);
//        burgar.getToppings();
//        System.out.println("Price is: $" + burgar.getPrice());

        burger burger;
        Scanner input = new Scanner(System.in);
        System.out.print(" Hello, welcome to Bill's burgers, which burger would you like to buy?\n 1.Regular-Burger      2.Healthy-Burger      3.Deluxe-Burger\n Enter the number:");
        int burgerType = input.nextInt();
        //burgerType = burgerType.toLowerCase();
        
        boolean letuce;
        boolean tomatoes;
        boolean onions;
        boolean carrots;

            if (burgerType == 1) {
                burger = new burger();
                System.out.print("Now tell me what type of meat would you like:");
                String meat = input.nextLine();
                burger.setBreadType(meat);
                System.out.println();
                System.out.print("Now tell me what type of bread would you like:");
                String bread = input.nextLine();

                System.out.println();
                System.out.print("Do you want lettuce on the burger?");
                String answer = input.nextLine();
                if (answer.toLowerCase() == "yes") {
                     letuce = true;
                } else {
                     letuce = false;
                }

                System.out.println();
                System.out.print("Do you want tomatoes on the burger?");
                answer = input.nextLine();
                if (answer.toLowerCase() == "yes") {
                     tomatoes = true;
                } else {
                     tomatoes = false;
                }

                System.out.println();
                System.out.print("Do you want carrots on the burger?");
                 answer = input.nextLine();
                if (answer.toLowerCase() == "yes") {
                     carrots = true;
                } else {
                     carrots = false;
                }

                System.out.println();
                System.out.print("Do you want onions on the burger?");
                 answer = input.nextLine();
                if (answer.toLowerCase() == "yes") {
                     onions = true;
                } else {
                     onions = false;
                }
                burger.addTopings(letuce, tomatoes, carrots, onions);
                System.out.println("Your burger is: " +burger.getName() + "it has: " + burger.getBreadType() + " and " + burger.getMeatType());
                burger.getToppings();
                System.out.println("Price is: $" + burger.getPrice());
            }

    }
}
