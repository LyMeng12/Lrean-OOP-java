//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        User user1 = new User();
//
//        user1.Sleep();
//
//        System.out.println("Age:"+user1.age);
//        System.out.println("Name:"+user1.name);
        User user1 = new User();
        User user2 = new User();
        user1.Register("Lymeng","Meng@gamil.com",20,"Male","123");
        user2.Register("Lymeng","Meng@gamil.com",20,"Male","123");
        user1.Display();
        System.out.println("====================");
        user2.Display();

    }
}