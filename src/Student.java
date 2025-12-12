public class Student {
    int id ;
    String name ;
    String Sex;
    double Sa;
    double Java;
    double O;
    double fee;

    public Student(int id , String name,String Sex,double Sa,double Java,double O,double fee) {
        this.id = id;
        this.name = name;
        this.Sex=Sex;
        this.Sa=Sa;
        this.Java=Java;
        this.O=O;
        this.fee=fee;
    }
    public double getFee() {
        double reExam = 40;
        double totalre=0;
        if(Sa<50){
            totalre+=1;
        }
        if(Java<50){
            totalre+=1;
        }
        if(O<50){
            totalre+=1;
        }
        fee +=totalre*reExam;
        return fee;
    }

    public void Payment(){
        System.out.println(id+"    "+name+"         "+Sex +"  "+Sa+"  "+Java+"  "+O+"    "+getFee());
    }
}
