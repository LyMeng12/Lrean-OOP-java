package work3;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try{
            File note = new File("note.txt");
            if(note.exists()){
                System.out.println("Already exists");
            }else {
                note.createNewFile();
            }
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
