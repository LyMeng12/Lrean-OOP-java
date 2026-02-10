package Protect.Back2;

public class Test3 {
    public static void main(String[] args) {
        Test1 s = new Test1();
        s.display();

//        Person p = new Person();
//        System.out.println(p.age);

        // ❌ NOT allowed (no inheritance access)
        // System.out.println(s.age);
    }
}
