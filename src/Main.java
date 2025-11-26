public class Main {
    public static void main(String[] args) {
        Employees sa = new Manager("meng",2000,200);
        System.out.println(sa.name);
        System.out.println(sa.getTotalSalary());
    }
}