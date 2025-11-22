import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        create object user
        User user1 = new User();

//        used method set() from add data

        user1.setId(1);
        user1.setUsername("Meng");
        user1.setPassword("123456");
        user1.setEmail("Meng@gmail.com");

        System.out.println("ID: " + user1.getId());
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Password: " + user1.getPassword());
        System.out.println("Email: " + user1.getEmail());

    }
}