package Default.test;

public class Main {
    public static void main(String[] args) {
        Clas p = new Clas();

        // ✅ allowed (same package)
        System.out.println(p.name);
        p.showName();
    }
}
