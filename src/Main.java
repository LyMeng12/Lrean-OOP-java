import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Dag("Dog", 12));
        list.add(new Cat("Cat", 5));
        for(Animal a : list){
            a.Sound();
        }
    }
}