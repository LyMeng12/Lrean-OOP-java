import java.util.ArrayList;
import java.util.Scanner;

public class Oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        ArrayList<Student> studentReExam = new ArrayList<>();
        boolean run = true;
        int id=1;
        double fee=780;
        do{
            System.out.print("Enter Student name:");
            String name = sc.next();
            System.out.print("Enter Student Sex:");
            String Sex = sc.next();
            while(!Sex.equals("male") && !Sex.equals("female")){
                System.out.print("Please enter male or Female  again:");
                Sex = sc.next();
            }
            System.out.print("Enter Point SA:");
            double sa = sc.nextDouble();
            while (sa <0 || sa>100){
                System.out.print("Please enter a number between 0 and 100:");
                sa = sc.nextDouble();
            }
            System.out.print("Enter Point JAVA:");
            double java = sc.nextDouble();
            while (java <0 || java>100){
                System.out.print("Please enter a number between 0 and 100:");
                java = sc.nextDouble();
            }
            System.out.print("Enter Point O:");
            double o = sc.nextDouble();
            while (o <0 || o>100){
                System.out.print("Please enter a number between 0 and 100:");
                o = sc.nextDouble();
            }
            list.add(new Student(id,name,Sex,sa,java,o,fee));
            id++;
            System.out.print("More Student (y/n):");
            String answer = sc.next().toLowerCase();
            if(answer.equals("y")){
                run = true;
            } else if (answer.equals("n")) {
                run = false;
            }

        }while (run);
        for (Student student : list){
            if(student.getFee()>fee){
                studentReExam.add(student);
            }
        }
        boolean diplay = true;
        do{
            if(studentReExam.size()<0){
                System.out.println("**********************************************");
                System.out.println("ID  Student-Name  Gender  SA   JAVA   O    Payment");
                for(Student lists : list){
                    lists.Payment();
                }
                diplay = false;
            } else if (studentReExam.size() >= 0) {
                System.out.println("========================================");
                System.out.println("1.Student Data.");
                System.out.println("2.Student Exam.");
                System.out.println("3.Exit");
                System.out.print("Choose an option: ");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:{
                        System.out.println("1.Student Data.");
                        System.out.println("**********************************************");
                        System.out.println("ID  Student-Name  Gender  SA   JAVA   O    Payment");
                        for(Student lists : list){
                            lists.Payment();
                        }
                    }break;
                    case 2:{
                        System.out.println("2.Student Exam.");
                        System.out.println("**********************************************");
                        System.out.println("ID  Student-Name  Gender  SA   JAVA   O    Payment");
                        for(Student lists : studentReExam){
                            lists.Payment();
                        }
                    }break;
                    case 3:{
                        diplay = false;
                    }break;
                }
            }
        }while (diplay);
    }
}
