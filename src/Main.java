import java.util.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Integer> list = new HashMap<>();
        boolean done = true;
        while (done) {
            if (list.size() > 0) {
                System.out.println("=========== Menu ===========");
                System.out.println("1.Add");
                System.out.println("2.Insert");
                System.out.println("3.Delete");
                System.out.println("4.Update");
                System.out.println("5.Display");
                System.out.println("6.Sort");
                System.out.println("7.Exit");
                System.out.print("Please Choose:");
                int choose = sc.nextInt();
                switch(choose){
//                    add
                    case 1:{
                        System.out.print("Enter Number:");
                        int number = sc.nextInt();
                        while (list.containsValue(number)){
                            System.out.print("Enter Number again:");
                            number = sc.nextInt();
                        }

                        list.put(list.size()+1,number);
                    }break;
//                    Insert
                    case 2:{

                    }break;
//                    delete
                    case 3:{
                        for (Map.Entry<Integer,Integer> entry : list.entrySet()){
                            System.out.print(entry.getKey() + ":" + entry.getValue()+" ");
                        }
                        System.out.println();

                        System.out.println("Delete key number:");
                        int number = sc.nextInt();
                        while (!list.containsValue(number)){
                            System.out.print("Delete Number again:");
                            number = sc.nextInt();
                        }
                        list.remove(number);
                    }break;
//                    update
                    case 4:{
                        for (Map.Entry<Integer,Integer> entry : list.entrySet()){
                            System.out.print(entry.getKey() + ":" + entry.getValue()+" ");
                        }
                        System.out.println();
                        System.out.print("Enter Number Key:");
                        int key = sc.nextInt();
                        while (!list.containsKey(key)){
                            System.out.print("Enter Number again:");
                            key = sc.nextInt();
                        }

                        System.out.print("Enter Number:");
                        int number = sc.nextInt();
                        while (list.containsValue(number)){
                            System.out.print("Enter Number again:");
                            number = sc.nextInt();
                        }
                        list.put(key,number);

                    }break;
//                    display
                    case 5:{
                        for(Map.Entry<Integer,Integer> entry : list.entrySet()){
                            System.out.println(entry.getKey()+":"+entry.getValue());
                        }
                    }break;
//                    sort
                    case 6:{

                    }break;

                    case 7:{
                        done=false;
                    }break;

                }
            }else if (list.size() == 0){
                System.out.println("1.add");
                System.out.println("2.Exit");
                System.out.print("Please Choose:");
                int choose = sc.nextInt();
                if (choose == 1){

                    System.out.print("Number:");
                    list.put(list.size()+1,sc.nextInt());

                }else if (choose == 2){
                    done=false;
                }
            }
        }
    }
}