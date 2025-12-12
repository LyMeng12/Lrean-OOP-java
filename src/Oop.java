import java.util.ArrayList;
import java.util.Scanner;

public class Oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        boolean flag = true;
        double fee=780;
        while (flag) {
            System.out.print("Enter student id: ");
            int id = sc.nextInt();

            System.out.print("Enter student name: ");
            String name = sc.next();

            System.out.print("Enter student gender: ");
            String gender = sc.next();
            while (!gender.equals("male") && !gender.equals("female")) {
                System.out.print("Enter student gender again: ");
                gender = sc.next();
            }

            System.out.print("Enter student Sa: ");
            double sa = sc.nextDouble();
            while (sa<0 || sa>100) {
                System.out.print("Enter student Sa again: ");
                sa = sc.nextDouble();
            }

            System.out.print("Enter student Java: ");
            double java = sc.nextDouble();
            while (java<0 || java>100) {
                System.out.print("Enter student Java again: ");
                java = sc.nextDouble();
            }

            System.out.print("Enter student O: ");
            double o = sc.nextDouble();
            while (o<0 || o>100) {
                System.out.print("Enter student O again: ");
                o = sc.nextDouble();
            }

            list.add(new Student( id, name, gender ,sa ,java ,o,fee));
            System.out.print("Your want to add student more (y/n):");
            String answer = sc.next();
            while (!answer.equals("y") && !answer.equals("n")) {
                System.out.print("Enter again: ");
            }
            if (answer.equals("y")) {
                flag = true;

            }else if (answer.equals("n")) {
                flag = false;
            }

        }
        if(list.size()==0) {
            for (Student student : list) {
                student.diplay();
            }
        } else if (list.size()>0) {
            System.out.println("1.Student data");
            System.out.println("2.Student ReExam");
            System.out.println("choose :");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:{
                    for (Student student : list) {
                        if (student.getFee()==780){
                            student.diplay();
                        }
                    }
                }break;
                case 2:{
                    for (Student student : list) {
                        if (student.getFee()>780){
                            student.diplay();
                        }
                    }break;
                }
            }
        }


    }
}
