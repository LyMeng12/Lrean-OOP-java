import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> lists = new HashMap<>();
        HashMap<Integer,Integer> test = new HashMap<>();
        boolean done = true;
        while (done) {
            if (lists.size() > 0) {
                System.out.println("=========== Menu ===========");
                System.out.println("1.Add");
                System.out.println("2.Delete");
                System.out.println("3.Update");
                System.out.println("4.Display");
                System.out.println("5.Sort");
                System.out.println("6.Exit");
                System.out.print("Please Choose:");
                int choose = sc.nextInt();
                switch(choose){
//                    add
                    case 1:{
                        System.out.print("Enter Number:");
                        int number = sc.nextInt();
                        while (lists.containsValue(number)){
                            System.out.print("Enter Number again:");
                            number = sc.nextInt();
                        }

                        lists.put(lists.size()+1,number);
                    }break;
//                    delete
                    case 2:{
                        for (Map.Entry<Integer,Integer> entry : lists.entrySet()){
                            System.out.print(entry.getKey() + ":" + entry.getValue()+" ");
                        }
                        System.out.println();

                        System.out.println("Delete key number:");
                        int number = sc.nextInt();
                        while (!lists.containsValue(number)){
                            System.out.print("Delete Number again:");
                            number = sc.nextInt();
                        }
                        lists.remove(number);
                    }break;
//                    update
                    case 3:{
                        for (Map.Entry<Integer,Integer> entry : lists.entrySet()){
                            System.out.print(entry.getKey() + ":" + entry.getValue()+" ");
                        }
                        System.out.println();
                        System.out.print("Enter Number Key:");
                        int key = sc.nextInt();
                        while (!lists.containsKey(key)){
                            System.out.print("Enter Number again:");
                            key = sc.nextInt();
                        }

                        System.out.print("Enter Number:");
                        int number = sc.nextInt();
                        while (lists.containsValue(number)){
                            System.out.print("Enter Number again:");
                            number = sc.nextInt();
                        }
                        lists.put(key,number);

                    }break;
//                    display
                    case 4:{
                        for(Map.Entry<Integer,Integer> entry : lists.entrySet()){
                            System.out.println(entry.getValue());
                        }
                    }break;
//                    sort
                    case 5:{
                        List<Map.Entry<Integer, Integer>> list =
                                new ArrayList<>(lists.entrySet());
                        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());
                        for (Map.Entry<Integer,Integer> entry : list){
                            System.out.println(entry.getValue());
                        }
                    }break;

                    case 6:{
                        done=false;
                    }break;

                }
            }else if (lists.size() == 0){
                System.out.println("1.add");
                System.out.println("2.Exit");
                System.out.print("Please Choose:");
                int choose = sc.nextInt();
                if (choose == 1){

                    System.out.print("Number:");
                    lists.put(lists.size()+1,sc.nextInt());

                }else if (choose == 2){
                    done=false;
                }
            }
        }
    }
}