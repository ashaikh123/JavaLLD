package NumberPrinterThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ClientExecuter {
    public static void main(String[] args){
        ExecutorService executer = Executors.newFixedThreadPool( 10);
        for (int i=1;i<=100;i++) {
            if (i==5 || i==10 || i==20)
            {
                System.out.println("Hello");

            }

            NumberPrinter obj1 = new NumberPrinter(i);
            executer.execute(obj1);

        }
        executer.shutdown();
    }
}
