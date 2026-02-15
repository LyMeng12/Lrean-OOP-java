package work3;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            File students = new File("F:\\java\\OOP\\OOP\\src\\work3\\student.txt");
            if (!students.exists()) {
                students.createNewFile();
            }else {
                System.out.println("File already exists");
            }
            BufferedReader br = new BufferedReader(new FileReader(students));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



    }
}
