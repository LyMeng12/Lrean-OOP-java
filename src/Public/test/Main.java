package Public.test;

import Public.Test;
import Public.test2.Test1;

public class Main {
    public static void main(String[] args) {
        Test p = new Test();
        Test1 p1 = new Test1();

        // ✅ public variable
        System.out.println(p.name);

        // ✅ public method
        p.showName();
        System.out.println(p1.age);
        p1.showAge();

            // ✅ accessible anywhere


    }
}
