package Work5;

//class A extends Thread {
//    public void run() {
//        for(int i=1;i<=5;i++) {
//            System.out.println("Thread A: " + i);
//        }
//    }
//}
//
//class B extends Thread {
//    public void run() {
//        for(int i=1;i<=5;i++) {
//            System.out.println("Thread B: " + i);
//        }
//    }
//}
//
//public class Mdd {
//
//    public static void main(String[] args) throws InterruptedException {
//
//        A t1 = new A();
//        B t2 = new B();
//
//        t1.start();
//        Thread.sleep(10);
//        t2.start();
//
//    }
//}

class MyThread implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {

        MyThread obj = new MyThread();
        Thread t1 = new Thread(obj);

        t1.start();
    }
}
