package Java_Advanced;

public class Generics {



//    Generic Method
    public static <T> void printData(T data) {
        System.out.println(data);
    }


    public static void main(String[] args) {

//        Generics = គឺជាវិធីសាស្ត្រដែលអនុញ្ញាតឲ្យយើងសរសេរ class, interface, និង method ដែលអាចធ្វើការជាមួយ data type ផ្សេងៗបាន
//                     ដោយមិនចាំបាច់សរសេរកូដដដែលៗ។


//       2. Generic Method

//       <T>=type parameter
//              |
        Box<String> box = new Box<>();
        box.setData("Hello");
        System.out.println(box.getData());  //Hello

//       <T>=type parameter
//              |
        Box<Integer> box2 = new Box<>();
        box2.setData(123);
        System.out.println(box2.getData()); //123

        printData("Java");
        printData(100);
        printData(5.5);
    }
}
