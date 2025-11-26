public class Main {
    public static void main(String[] args) {
        Vehicle[] sar = {new Car(), new Motorcycle()};
        for (Vehicle v : sar ){
            v.start();
        }
    }
}