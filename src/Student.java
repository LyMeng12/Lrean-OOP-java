public class Student {
    int id;
    String name;
    String gender;
    double Sa;
    double Java;
    double O;
    double fee;


    public Student(int id, String name, String gender, double Sa, double Java, double O, double fee) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.Sa = Sa;
        this.Java = Java;
        this.O = O;
        this.fee = fee;
    }
    public double getFee() {
        return fee;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public double getSa() {
        return Sa;
    }
    public double getJava() {
        return Java;
    }
    public double getO() {
        return O;
    }
    public void diplay() {
        double reExam = 40;
        double total = 0;
        double total2 ;

            if (Sa < 50) {
                total += 1;
            }
            if (Java < 50) {
                total += 1;
            }
            if (O < 50) {
                total += 1;
            }
            total2 = total * reExam;


            System.out.println(getId() + " " + getName() + " " + getGender() + " " + getSa() + " " + getJava() + " " + getO() + " " + getFee());

    }

}
