package Priveted;

public class Student {
    private int id = 101;
    private String name = "Meng";

    // public method to access private data
    private void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    void Display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }


}
