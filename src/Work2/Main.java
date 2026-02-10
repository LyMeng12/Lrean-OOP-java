package Work2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Card> card = new ArrayList<>();
        ArrayList<Cash> cash = new ArrayList<>();
        Peyment peyment = new Peyment();
        ArrayList<Mobile> mobiles = new ArrayList<>();
        boolean flag;
        int i=1;
        do {
            System.out.println("==============================================");
            System.out.println("\t\t\t\tCustomer"+i);
            System.out.println("==============================================");
            System.out.print("Enter Price: ");
            int price = sc.nextInt();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            peyment.setPayment(price, quantity);
            System.out.println("Amount to pay: $"+peyment.Peyment());

            System.out.println("Payment:");
            System.out.println("1. Cash");
            System.out.println("2. Card");
            System.out.println("3. Mobile");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            while (choice <0 || choice > 3) {
                System.out.println("Invalid Choice");
                System.out.print("Enter Choice Again: ");
                choice = sc.nextInt();
            }
            switch (choice) {
                case 1:{
                    System.out.print("Product Paid By Cash: $");
                    int Cash = sc.nextInt();
                    while (Cash != peyment.Peyment()) {
                        System.out.println("Cash does not exist");
                        System.out.print("Product Paid By Cash again: ");
                        Cash = sc.nextInt();
                    }
                    cash.add(new Cash(Cash));
                }break;
                case 2:{
                    System.out.print("Product Paid By Card: $");
                    int Card = sc.nextInt();
                    while (Card != peyment.Peyment()) {
                        System.out.println("Card does not exist");
                        System.out.print("Product Paid By Card again: ");
                        Card = sc.nextInt();
                    }
                    card.add(new Card(Card));
                }break;
                case 3:{
                    System.out.print("Product Paid By Mobile: ");
                    int Mobile = sc.nextInt();
                    while (Mobile != peyment.Peyment()) {
                        System.out.println("Mobile does not exist");
                        System.out.print("Product Paid By Mobile again: ");
                        Mobile = sc.nextInt();
                    }
                    mobiles.add(new Mobile(Mobile));
                }break;
            }
            System.out.print("One more customer(y/n): ");
            String customerName = sc.next();
            while (!customerName.equals("y") && !customerName.equals("n")) {
                System.out.print("Again(y/n): ");
                customerName = sc.next();
            }
            if (customerName.equals("y")) {
                flag = true;
            }else {
                flag = false;
            }
            i++;
        }while (flag);
        int Card=0;
        int Mobile=0;
        int Cash=0;
        for (Card c : card) {
            Card +=c.Peyment();
        }
        for (Mobile m : mobiles) {
            Mobile += m.Peyment();
        }
        for (Cash c : cash) {
            Cash += c.Peyment();
        }
        System.out.println("===================================================");
        System.out.println("Total Income: $"+(Card+Mobile+Cash));
        System.out.println("Total Income by Cash: $"+Cash);
        System.out.println("Total Income by Mobile: $"+Mobile);
        System.out.println("Total Income by Card: $"+Card);


    }
}
