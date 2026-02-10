package Priveted;

public class Stdenttest extends Student {
//    private String kk;
//    private int ok;
//
//    private void Set(){
//        System.out.println(kk+ok);
//    }
    public static void main(String[] args) {
        Student s = new Student();


        // ❌ ERROR: cannot access private variables
        // System.out.println(s.id);
        // System.out.println(s.name);

        // ✅ OK: access through public method
//        s.display();
        s.Display();
    }
}
