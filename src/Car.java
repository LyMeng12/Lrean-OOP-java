public class Car {
    String brand ;
    int year ;

    public void drive(){
        System.out.println("Car is drive");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.brand="Toyota";
        car.year=2015;
        car.drive();
        System.out.print("Brand car: "+car.brand+" " );
        System.out.println(car.year);


    }
}
