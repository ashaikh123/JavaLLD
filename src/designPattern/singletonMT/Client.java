package designPattern.singletonMT;

public class Client implements Runnable{

    public void run()
    {
        System.out.println("Thread 1 is running...");
        DBCon db1= DBCon.getDbObj();
    }
    public static void main(String[] args){
        Client r1=new Client();
        Thread thread1 =new Thread(r1);
        thread1.start();
        Thread thread2 =new Thread(r1);
        thread2.start();


    }
}
