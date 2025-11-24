import java.time.LocalDate; // import the LocalDate class

public class Main {
    String Brand = "Toyota";
    int year = 2020;

    public static void driv(){
        System.out.println("car is drive!");
    }
    public static void main(String[] args) {
        Main car = new Main();
        System.out.println(car.Brand);
        System.out.println(car.year);
        car.driv();
    }
}