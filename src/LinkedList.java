public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        list.addLast("T");
        list.addFirst("AA");

        list.removeLast();
        list.removeFirst();
        for(String s : list ){
            System.out.print(s+" ");
        }
    }
}
