package work3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            File note = new File("note.txt");
            if(note.delete()) {
                System.out.println("delete failed");
            }else {
                System.out.println("not delete exists");
            }

//


        }catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
