import java.time.LocalDate; // import the LocalDate class
import java.util.Scanner;

public class Main {
    private String name ;
    private int age ;
    public Main(String name, int age) {
        this.name = name;
        this.age = age ;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        Main student = new Main("Meng",12);
        student.setAge(20);
        student.setName("Meng");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.name);
        System.out.println(student.age);
    }
}