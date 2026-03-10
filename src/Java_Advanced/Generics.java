package Java_Advanced;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

//        Generics = គឺជាវិធីសាស្ត្រដែលអនុញ្ញាតឲ្យយើងសរសេរ class, interface, និង method ដែលអាចធ្វើការជាមួយ data type ផ្សេងៗបាន
//                     ដោយមិនចាំបាច់សរសេរកូដដដែលៗ។

        Box<Integer> n1 = new Box<>(10);
        Box<Double> n2 = new Box<>(10.3);
        Box<Float> n3 = new Box<>(10.3f);

        n1.print();
        n2.print();
        n3.print();

    }
}
