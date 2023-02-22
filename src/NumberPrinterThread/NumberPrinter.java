package NumberPrinterThread;

public class NumberPrinter implements Runnable{
    private int Num;

    NumberPrinter(int Num){
        this.Num=Num;
    }

    public void run(){
        System.out.println("Printing "+this.Num+ " Printed by " +Thread.currentThread().getName());

    }


}
