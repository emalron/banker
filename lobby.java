import java.awt.List;

public class lobby {
    public static void main(String[] args) {
        Bank j = new Bank("Jes", 1000);
        worker r1 = new worker(j, 100);
        worker r2 = new worker(j, -100);

        Thread t1 = new Thread(r1, "Deposite");
        Thread t2 = new Thread(r2, "Withdraw");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(j.getMoney());
    }
}