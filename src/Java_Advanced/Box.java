package Java_Advanced;

public class Box<T extends Number>{
    T num;

    public Box(T num) {
        this.num = num;
    }

    public void print() {
        System.out.println(num);
    }
}
