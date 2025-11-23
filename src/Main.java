import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Animal{
//    OOP Inheritance and Polymorphism


    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();


        animal.sound();
        animal.sound();
        dog.sound();
        System.out.println("++++++++++++++++++");
        cat.setname("KIKI");
        dog.setname("KCKC");
        animal.setname("BXBX");
        System.out.println(animal.getname());
        System.out.println(cat.getname());
        System.out.println(dog.getname());




    }
}