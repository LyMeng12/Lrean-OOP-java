public class Main {
    String name;
    int age;
    double score;

    public Main(String name, int age , double score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
    public void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);

    }


    public static void main(String[] args) {
        Main main = new Main("John Smith", 20, 90);
        main.display();

    }
}