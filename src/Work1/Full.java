package Work1;

public class Full extends Staff{
    double salary;
    double ot;
    double wage;

    public Full(int id,String name,String Sex,String Phone,double salary, double ot, double wage) {
        super(id,name,Sex,Phone);
        this.salary = salary;
        this.ot = ot;
        this.wage = wage;
    }

    public void getSalary() {
        salary += ot * wage;

        System.out.println("ID: "+id+" Name: "+name+" Sex: "+" Phone: "+Phone+" Salary: "+salary+"$"+" OT: "+ot+" Wage: "+wage+"$");
    }
}
