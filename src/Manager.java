class Manager extends Employees{
    int bonus;

    Manager( String name, int salary , int bonus ) {
        super(name,salary);
        this.bonus = bonus;
    }

    @Override
    public int getTotalSalary() {
        return salary + bonus;
    }
}
