package work3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File note = new File("note.txt");
            if(!note.exists()) {
                System.out.println("create note file");
                note.createNewFile();
            }else {
                System.out.println("Already exists");
            }
            FileWriter fw = new FileWriter(note,true);
            fw.write("Hello World");
            fw.close();

            System.out.println("Name: " + note.getName());
            System.out.println("Path: " + note.getAbsolutePath());
            System.out.println("Readable: " + note.canRead());
            System.out.println("Writable: " + note.canWrite());
            System.out.println("Size: " + note.length() + " bytes");
        }catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
