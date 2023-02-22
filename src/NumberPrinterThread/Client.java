package NumberPrinterThread;

public class Client {
    public static void main(String[] args){

        for (int i=0;i<=100;i++) {
            NumberPrinter obj1 = new NumberPrinter(i);
            Thread t1 = new Thread(obj1);
            t1.start();

        }

    }
}
