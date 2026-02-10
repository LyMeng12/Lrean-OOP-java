package Work1;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Staff {
    private int id ;
    private String name ;
    private String Sex;
    private String Phone;


    public void setUser(int id,String name,String sex ,String phone ){
        this.id = id;
        this.name = name;
        this.Sex=sex;
        this.Phone=phone;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSex(){
        return Sex;
    }
    public String getPhone(){
        return Phone;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Full> fullList = new ArrayList<>();
        ArrayList<Part> partList = new ArrayList<>();
        boolean run = true;
        do {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("1.Input Staff");
            System.out.println("2.display");
            System.out.println("3.Exit");
            System.out.print("Please Choose Your Option: ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:{
                    System.out.println("a.Full time 🐢");
                    System.out.println("b.Part time 🦥");
                    System.out.print("Choose: ");
                    String choice = sc.next();
                    while (!choice.equals("a") && !choice.equals("b")) {
                        System.out.println("Please Choose Your Option: ");
                        choice = sc.next();
                    }
                    if (choice.equals("a")) {
//                        FUll
                        boolean userfull=true;
                        int id=1;
                        do {
                            System.out.print("Enter full name: ");
                            String name = sc.next();
                            System.out.print("Enter Sex: ");
                            String sex = sc.next().toLowerCase();
                            while (!sex.equals("male") && !sex.equals("female")) {
                                System.out.print("Please enter Male or Female: ");
                                sex = sc.next().toLowerCase();
                            }
                            System.out.print("Enter Phone number: ");
                            String phone = sc.next();
                            System.out.print("Enter Salary$: ");
                            double salary = sc.nextDouble();
                            System.out.print("Enter OT: ");
                            double OT = sc.nextDouble();
                            System.out.print("Enter Wage$: ");
                            double Wage = sc.nextDouble();
                            fullList.add(new Full(id,name,sex,phone,salary,OT,Wage));
                            id++;
                            System.out.print("Add more(y/n): ");
                            String choice2 = sc.next();
                            if (choice2.equals("y")) {
                                userfull=true;
                            } else if (choice2.equals("n")) {
                                userfull=false;
                            }
                        }while (userfull);

                    } else if (choice.equals("b")) {
//                        Part
                        boolean userpart=true;
                        int id=1;
                        do {
                            System.out.print("Enter full name: ");
                            String name = sc.next();
                            System.out.print("Enter Sex: ");
                            String sex = sc.next().toLowerCase();
                            while (!sex.equals("male") && !sex.equals("female")) {
                                System.out.print("Please enter Male or Female: ");
                                sex = sc.next().toLowerCase();
                            }
                            System.out.println("Enter Phone number: ");
                            String phone = sc.next();
                            System.out.print("Enter Hour: ");
                            double hour = sc.nextDouble();
                            System.out.print("Enter Wage$: ");
                            double Wage = sc.nextDouble();
                            partList.add(new Part(id,name,sex,phone,hour,Wage));
                            id++;
                            System.out.print("Add more(y/n): ");
                            String choice2 = sc.next();
                            if (choice2.equals("y")) {
                                userpart=true;
                            } else if (choice2.equals("n")) {
                                userpart=false;
                            }

                        }while (userpart);

                    }
                }break;
                case 2:{
                    System.out.println("a.ALL");
                    System.out.println("b.Full time 🐢");
                    System.out.println("c.Part time 🦥");
                    System.out.println("Choose: ");
                    String choice = sc.next();
                    while (!choice.equals("a") && !choice.equals("b") && !choice.equals("c")) {
                        System.out.println("Please Choose Your Option: ");
                        choice = sc.next();
                    }
                    switch (choice) {
                        case "a":{
                            System.out.println("Display all Employees");
                            System.out.println("Full time 🐢");
                            for (Full full : fullList) {
                                full.getSalary();
                            }
                            System.out.println("Part time 🦥");
                            for (Part part : partList) {
                                part.getPrint();
                            }
                        }break;
                        case "b":{
                            System.out.println("Full time 🐢");
                            for (Full full : fullList) {
                                full.getSalary();
                            }
                        }break;
                        case "c":{
                            System.out.println("Part time 🦥");
                            for (Part part : partList) {
                                part.getPrint();
                            }
                        }break;
                    }
                }break;
                case 3:{
                    run = false;
                }break;
            }
        }while (run);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("System is Over!🦦");
    }
}
