public class Main {
    public static void main(String[] args) {
        Phone ip = new iPhone();
        Phone sam = new Samsung();

        ip.call();
        ip.sms();

        System.out.println("==============");
        sam.call();
        sam.sms();
    }
}