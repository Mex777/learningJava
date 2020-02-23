package ArrayLists;

import java.util.Scanner;

public class main {
    private static Scanner input = new Scanner(System.in);
    private static cellphone phone = new cellphone();
    public static void main(String[] args) {

        getInfo();
        int number = input.nextInt();
        input.nextLine();
        while (number!=0) {
            switch (number) {
                case 1:
                    getInfo();
                    break;
                case 2:
                    phone.printContacts();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    modifyContact();
                    break;
                case 5:
                    removeContact();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Invalid number, try again");
                    break;
            }
            number = input.nextInt();
            input.nextLine();
        }
    }
    public static void getInfo() {
        System.out.println("Choose the number of the information\n" +
                "1.Show informations\n" +
                "2.Show my contacts\n" +
                "3.Add a new contact\n" +
                "4.Modify a contact\n" +
                "5.Remove a contact\n" +
                "0.Exit");
    }
    public static void addContact() {
        System.out.print("To add a new contact you should type the name of the Contact and his phone number\n" +
                "Name: ");
        String name = input.nextLine();
        System.out.print("Phone number: +40");
        long phoneNum = input.nextLong();
        input.nextLine();
        phone.addContact(name, phoneNum);
    }
    public static void removeContact() {
        System.out.print("In order to remove a contact you should type the name of the contact\n" +
                "Name:");
        String name = input.nextLine();
        phone.removeContact(name);

    }
    public static void modifyContact() {
        System.out.print("To modify the name you should type the old name of the contact\n" +
                "Name:");
        String name = input.nextLine();

        System.out.print("Now you should type the new name:");
        String newName = input.nextLine();
        phone.modifyName(name, newName);
    }
}
