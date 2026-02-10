package Work1;

public class Full extends Staff{
    private double salary;
    private double ot;
    private double wage;

    public void setWork(double wage, double salary, double ot) {
        this.wage = wage;
        this.salary = salary;
        this.ot = ot;
    }
    public double getOt() {
        return ot;
    }
    public double getWage() {
        return wage;
    }
    public double getSSalary(){
        return salary += ot * wage;
    }

    public Full(int id,String name,String Sex,String Phone,double salary, double ot, double wage) {
        setUser(id,name,Sex,Phone);
        setWork(salary,ot,wage);
    }

    public void getSalary() {
        System.out.println("ID: "+getId()+" Name: "+getName()+" Sex: "+" Phone: "+getPhone()+" Salary: "+getSSalary()+"$"+" OT: "+getOt()+" Wage: "+getWage()+"$");
    }
}
