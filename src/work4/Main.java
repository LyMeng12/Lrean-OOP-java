package work4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        boolean quit = true;
        while (quit){
            System.out.println("=======Welcome=======");
            System.out.println("1.Register Student.");
            System.out.println("2.Pay.");
            System.out.println("3.Display Total students.");
            System.out.println("4.Diplay student info.");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            int choice = in.nextInt();
            switch(choice){
                case 1:{
                    System.out.print("Enter student name: ");
                    String name = in.next();
                    System.out.print("Enter Deposite amount: ");
                    double amount = in.nextDouble();
                    students.add(new Student(name, amount));
                }break;
                case 2:{
                    int id = 0;
                    String name;
                    for(Student student : students){
                        System.out.println("ID: "+id+"."+student.getName()+" ");
                        id++;
                    }
                    id=0;

                    System.out.println("Enter student ID: ");
                    int ID = in.nextInt();
                    for (Student student : students) {
                        if(ID==id){
                            System.out.println("Payment Money: ");
                            double pay = in.nextDouble();
                            student.deposit(pay);
                            break;
                        }
                        id++;
                    }
                }break;
                case 3:{
                    System.out.println("Display Total students");
                    System.out.print("Total Students:");
                    Student.getTotalStudents();
                }break;
                case 4:{
                    System.out.println("==========================");
                    for(Student student : students){
                        student.displayAccountinfor();
                    }
                }break;
                case 5:{
                    quit = false;
                }break;
                default:{
                    System.out.println("Invalid choice");
                }break;
            }
        }
        System.out.println("End of program!");

    }
}
