package Java_Advanced;

import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

//        Generics = គឺជាវិធីសាស្ត្រដែលអនុញ្ញាតឲ្យយើងសរសេរ class, interface, និង method ដែលអាចធ្វើការជាមួយ data type ផ្សេងៗបាន
//                     ដោយមិនចាំបាច់សរសេរកូដដដែលៗ។

//        Multiple Type Parameters<T,U>
//                |
        Box<String,Integer> nsj = new Box<>("meng",120);
        System.out.println(nsj.getT()+" "+nsj.getU());

    }
}
