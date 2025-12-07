public class Main {
    private String name;
    private int age ;
    private double score;

    public Main(String name, int age, double score) {
        setName(name);
        setAge(age);
        setScore(score);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        }else {
            this.age = age;
        }
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        if (score < 0) {
            System.out.println("Invalid Score");
        }
        else {
            this.score = score;
        }
    }


    public static void main(String[] args) {
        Main main = new Main("kaka",-1,-1);
        System.out.println(main.getName() + " " + main.getAge() + " " + main.getScore());
    }
}