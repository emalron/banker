public class worker implements Runnable {
    public Bank bank;
    private int money;

    public worker(Bank b, int money) {
        this.bank = b;
        this.money = money;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++) {
            try {
                // int x = 1000 + this.money;
                int x = 0;
                Thread.sleep(x);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">>>>> " + Thread.currentThread().getName() + " " + this.bank.getMoney());
            if(this.money > 0) {
                this.bank.deposite(this.money);
                System.out.println(Thread.currentThread().getName() + " " + this.bank.getMoney() + " <<<<<");
            }
            else {
                if(this.bank.withdraw(-this.money)) {
                    System.out.println(Thread.currentThread().getName() + " " + this.bank.getMoney() + " <<<<<");
                }
                else {
                    System.out.println("[ERROR] no money for withdraw " + this.bank.withdrawCounter + " <<<<<");
                }
            }
            
        }
    }
}