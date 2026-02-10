package Protect.Back2;

import Protect.Back.Test;

public class Test1 extends Test {
    public void display() {
        // ✅ allowed because of inheritance
        System.out.println(age);
        showAge();
    }
}
