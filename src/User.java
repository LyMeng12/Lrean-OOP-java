public class User {
//    static ==> name aeg
//    public int age = 10;
//    public String name = "John";
//
//   Behavior ==> Bark Eat  Sleep
//
//    public void Sleep() {
//        System.out.println("Lymeng");
//    }
    public String name;
    private String Email;
    protected int Age;
    String Gender;
    String Password;

    public void Register(String Username, String email, int age, String gender, String password) {
        name = Username;
        Email = email;
        Age = age;
        Gender = gender;
        Password = password;
    }
    public void Display() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + Email);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
        System.out.println("Password: " + Password);
    }


}
