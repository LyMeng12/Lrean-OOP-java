package work3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        File note = new File("note.txt");
        try(Scanner sc = new Scanner(note)) {

            if(!note.exists()) {
                System.out.println("create note file");
                note.createNewFile();
            }else {
                System.out.println("Already exists");
            }

            FileWriter fw = new FileWriter(note,true);
            String noteText="";
            do {
                System.out.print("Enter note text/Shop: ");
                noteText = in.nextLine();
                if (!noteText.equals("shop")) {
                    fw.write(noteText+"\n");
                }
            }while (!noteText.equals("shop"));
            fw.close();

            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if(!line.equals("")) {
                    System.out.println("Name: "+line);
                }
            }


        }catch (Exception e) {
            System.out.println("File not found");
        }
    }
}
