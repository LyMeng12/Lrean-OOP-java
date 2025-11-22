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
//        User user1 = new User();
//        User user2 = new User();
//        user1.Register("Lymeng","Meng@gamil.com",20,"Male","123");
//        user2.Register("Lymeng","Meng@gamil.com",20,"Male","123");
//        user1.Display();
//        System.out.println("====================");
//        user2.Display();

        User emp = new User(1,"Meng","Ly",200);
        System.out.println(emp.toString());
        System.out.println("ID: "+emp.getId());
        System.out.println("First-Name: "+emp.getFirstname());
        System.out.println("Last-Name: "+emp.getLastname());
        System.out.println("Full-Name: "+emp.getName());
        System.out.println("Salary: "+emp.getSalary()+"$");
        System.out.println("Annual: "+emp.getAnnualSalary()+"$");
        System.out.println("Raise Salary: "+emp.raiseSalary(10)+"$");
        System.out.println("=============================================");
        User emp1 = new User(1,"Sa","Ly",1000);
        System.out.println(emp1.toString());
        System.out.println("ID: "+emp1.getId());
        System.out.println("First-Name: "+emp1.getFirstname());
        System.out.println("Last-Name: "+emp1.getLastname());
        System.out.println("Full-Name: "+emp1.getName());
        System.out.println("Salary: "+emp1.getSalary()+"$");
        System.out.println("Annual: "+emp1.getAnnualSalary()+"$");
        System.out.println("Raise Salary: "+emp1.raiseSalary(10)+"$");

    }
}