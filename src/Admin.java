public class Admin extends Company{
    public Admin(String name, int salary) {
        super(name,salary);
    }
    @Override
    public void settername(String name){
        this.name=name;
    }
    @Override
    public void settersalary(int salary){
        this.salary=salary;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getSalary() {
        return salary+1200;
    }
}
