import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> inint = new HashSet<>();
        HashSet<Integer> setin = new HashSet<>();
        HashSet<Integer> setout = new HashSet<>();
        int number =0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number: ");
            int num = sc.nextInt();
            if (setin.contains(num)) {
                setout.add(num);
            }

            setin.add(num);
        }
        setin.removeAll(setout);





        for (Integer num : setout) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (Integer num : setin) {
            System.out.print(num + " ");
        }
    }
}