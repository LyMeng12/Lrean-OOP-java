public class Company {
    protected String name;
    protected int salary;

    public Company(String name, int salary) {
        settername(name);
        settersalary(salary);

    }
    public void settername(String name){
        this.name=name;
    }
    public void settersalary(int salary){
        this.salary=salary;
    }
    public String getName() {
        return name;
    }
    public int getSalary() {
        return salary;
    }
}
