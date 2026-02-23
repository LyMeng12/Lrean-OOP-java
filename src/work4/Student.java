package work4;

public class Student {



    private String name;
    static int totalStudents;
    final int accountNumber;
    private double balance;
    public Student(String name,double balance) {
        this.accountNumber =(int)(Math.random() * 9000) + 1000;
        setName(name);
        setBalance(balance);
    }
    public void setName(String name) {
        totalStudents++;
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public static void getTotalStudents() {
        System.out.println(totalStudents);
    }
    public void deposit(double amount) {
        balance-= amount;
    }
    public final void displayAccountinfor() {
        System.out.println("Account number: " + accountNumber + " Balance: " + getBalance()+"$");
    }
}
