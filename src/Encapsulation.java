public class Encapsulation {
    private double balance;

    public void deposit(double balance){
        this.balance += balance;
    }

    public void withdraw(double balance){
        this.balance -= balance;
    }


    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.deposit(3000);
        encapsulation.withdraw(2000);

        System.out.println(encapsulation.getBalance());
    }
}
