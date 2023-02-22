package simpleThread;

public class ThreadPrinter implements Runnable{
    public void run(){
        System.out.println(("Printed by "+Thread.currentThread().getName()));
        doSomething();
    }

    public void doSomething(){
        System.out.println(("Function - Printed by "+Thread.currentThread().getName()));

    }
}
