package Work1;

public class Part extends Staff{
    double hour;
    double wage;

    public Part(int id,String name,String Sex,String Phone,double hour , double wage) {
        super(id,name,Sex,Phone);
        this.wage = wage;
        this.hour = hour;
    }

    void Money(){
        double money;
        money = hour * wage;
        System.out.println("ID: "+id+" Name: "+name+" Sex: "+Sex+" Phone: "+Phone+" Hour:"+hour+" Wage: "+wage+"$"+" Money: "+money+"$");
    }
}
