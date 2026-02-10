package Work1;

public class Part extends Staff{
    private double hour;
    private double wage;

    public void setWork(double hour, double wage) {
        this.hour = hour;
        this.wage = wage;
    }
    public double getHour() {
        return hour;
    }
    public double getWage() {
        return wage;
    }

    public Part(int id,String name,String Sex,String Phone,double hour , double wage) {
        setUser(id,name,Sex,Phone);
        setWork(hour,wage);
    }

    public double getMoney(){
        double money;
        money = hour * wage;
        return money;
    }
    public void getPrint(){
        System.out.println("ID: "+getId()+" Name: "+getName()+" Sex: "+getSex()+" Phone: "+getPhone()+" Hour:"+getHour()+" Wage: "+getWage()+"$"+" Money: "+getMoney()+"$");
    }
}
