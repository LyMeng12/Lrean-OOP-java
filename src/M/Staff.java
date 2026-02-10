package M;

class Staff implements School {
    double hour;

    @Override
    public void getRole(){
        String role = "Staff";

    }

    @Override
    public double getworkingHour() {
        double salary = hour * 5;
        salary += 300;
        return salary;
    }
    @Override
    public void calculatePayment() {
        System.out.println("Salary is $" + getworkingHour());
    }
}
