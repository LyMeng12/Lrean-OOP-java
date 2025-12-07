import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Company> list = new ArrayList<>();

        list.add(new Admin("Meng",12000));
        list.add(new Employ("Meng ly",12000));

        for (Company company : list) {
            if (company.getName().equals("Meng")) {
                System.out.println("Admin");
                System.out.println(company.getName() + " " + company.getSalary() );
            }else {
                System.out.println("Employ");
                System.out.println(company.getName() + " " + company.getSalary() );
            }


        }
    }
}