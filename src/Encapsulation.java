import java.util.Scanner;

public class Encapsulation {
    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        if (age < 0){
            System.out.println("Age cannot be negative");
            return 0;
        }else if (age >0){

        }return age;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encapsulation em = new Encapsulation();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        em.setAge(age);
        System.out.println(em.getAge());
    }
}
