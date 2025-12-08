import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        boolean add = true;
        while (add){
            System.out.println("How many words do you want to add?");
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            while(num < 0){
                System.out.print("Enter number again: ");
                num = sc.nextInt();
            }
            System.out.println("Add auto :@gmail.com");
            for (int i = 0; i < num; i++){
                System.out.print("Enter Name Email:");
               String name = sc.next();
               String email = "@gmail.com";
               set.add(name+email);
            }
            for(String s : set){
                System.out.println(s);
            }
            System.out.print("you need more orr not(y/n):");
            String answer = sc.next().toLowerCase();
            while (!answer.equals("y") && !answer.equals("n")){
                System.out.print("Choose again(y/n):");
                answer = sc.next().toLowerCase();
            }
            if (answer.equals("y")){
                add = true;
            }else if (answer.equals("n")){
                add = false;
            }
        }
        System.out.println("all done");
        for(String s : set){
            System.out.println(s);
        }



    }
}