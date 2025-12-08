import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("How Many");
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        for (int i =0 ;i<num;i++) {
            System.out.print((i+1)+"number:");
            list.add(sc.nextInt());
        }
        Collections.sort(list,Collections.reverseOrder());

        for (int i =0 ;i<num;i++) {
            System.out.print(list.get(i) + " ");
        }


    }
}