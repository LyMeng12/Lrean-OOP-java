package work3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File students = new File("F:\\java\\OOP\\OOP\\src\\work3\\students.txt");
        try {
            if (!students.exists()) {
                students.createNewFile();
                System.out.println("File does not exist");
            }else{
                System.out.println("File exists");
                System.out.println("=============================");
                FileOutputStream fos = new FileOutputStream(students);
                do{
                    System.out.print("Enter student name:");
                    String line = in.nextLine();
                    if (line.equals("stop")){
                        break;
                    }
                    fos.write(line.getBytes());
                    fos.write("\n".getBytes());

                }while (true);
                fos.close();
                System.out.println("===================================");
                FileInputStream fis = new FileInputStream(students);
                int i;
                System.out.println(fis.read());
                while ((i = fis.read()) != -1) {
                    System.out.print((char) i);
                }


            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
