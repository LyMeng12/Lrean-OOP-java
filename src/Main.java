import java.time.LocalDate; // import the LocalDate class
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Animal[] animals ={new Cat(),new Dog()};
            for(Animal a:animals){
                System.out.println(a.sound());
            }

    }
}