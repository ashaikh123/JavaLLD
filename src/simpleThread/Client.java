package simpleThread;

public class Client {
    public static void main(String[] args){
        System.out.println("Printed by "+ Thread.currentThread().getName());

        ThreadPrinter obj1=new ThreadPrinter();

        Thread t1 = new Thread(obj1);
        t1.start();

        Thread t2 = new Thread(obj1);
        t2.start();
    }
}
