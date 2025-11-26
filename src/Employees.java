abstract class Employees {
    String name;
    int salary;

    Employees(String name , int salary ) {
        this.name = name;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    abstract int getTotalSalary();
}
