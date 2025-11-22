public class User {
//    fiel/variable
    private int Id;
    private String Lastname;
    private String Firstname;
    private int salary;
//    method
//    constructor
    public User(int id, String lastname , String firstname , int salary){
        this.Id = id;
        this.Lastname = lastname;
        this.Firstname = firstname;
        this.salary = salary;
    }
    public int getId() {
        return this.Id;
    }
    public String getLastname() {
        return this.Lastname;
    }
    public String getFirstname() {
        return this.Firstname;
    }
    public String getName() {
        return this.Firstname+" "+this.Lastname;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary(){
        return this.salary * 12;
    }
    public int raiseSalary(int percent){
        return (salary*percent)/100 + salary;
    }
    public String toString(){
        return "Employees [id= "+this.Id +" , name=" +this.getName() +" , salary= "+this.getSalary() +"]";
    }





































//    static ==> name aeg
//    public int age = 10;
//    public String name = "John";
//
//   Behavior ==> Bark Eat  Sleep
//
//    public void Sleep() {
//        System.out.println("Lymeng");
//    }
//    public String name;
//    private String Email;
//    protected int Age;
//    String Gender;
//    String Password;
//
//    public void Register(String Username, String email, int age, String gender, String password) {
//        name = Username;
//        Email = email;
//        Age = age;
//        Gender = gender;
//        Password = password;
//    }
//    public void Display() {
//        System.out.println("Name: " + name);
//        System.out.println("Email: " + Email);
//        System.out.println("Age: " + Age);
//        System.out.println("Gender: " + Gender);
//        System.out.println("Password: " + Password);
//    }




}
