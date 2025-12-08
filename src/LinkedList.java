import java.util.ArrayList;

public class LinkedList {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
        java.util.LinkedList<Integer> list = new java.util.LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);

        list.addLast(0);
        list.addFirst(4);

//        list.removeLast();
//        list.removeFirst();
        for (int i = 0; i < list.size(); i++) {
            if(list.contains(i)) {
                System.out.println("This Have");
            }
            else{
                System.out.println("This not Have");
            }
        }




    }
}
