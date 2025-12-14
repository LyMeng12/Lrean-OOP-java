import java.util.ArrayList;
import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> book = new ArrayList<>();
        ArrayList<Book> book1 = new ArrayList<>();
        boolean done = true;
        int id = 1;
        do{
            System.out.print("Enter the book title:");
            String title = in.next();
            System.out.print("Price:");
            double price = in.nextDouble();
            book.add(new Book(id, title, price));
            System.out.print("Add Book More ?(y/n):");
            String answer = in.next().toLowerCase();
            id++;
            while(!answer.equals("y") && !answer.equals("n")){
                System.out.print("Choose again:");
                answer = in.next();
            }
            if(answer.equals("y")){
                done = true;
            }else if(answer.equals("n")){
                done = false;
            }
        }while (done);

        for (Book b : book){
            if (b.getPrice() >20){
                book1.add(b);
            }
        }

        if (book1.size() == 0){
            System.out.println("*************************");
            System.out.println("This book price 10-20");
            for (Book b : book){
                b.display();
            }
        } else if (book1.size() >0) {
            System.out.println("*************************");
            System.out.println("This book price 10-20");
            for (Book b : book){
                b.display();
            }
            System.out.println("*************************");
            System.out.println("This book price 20->");
            for (Book b : book1){
                b.display();
            }
        }

    }
}
