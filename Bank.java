public class Bank {
    private String account;
    private int money;
    public synchronized void setMoney(int i) {
        this.money += i;
    }
    public int withdrawCounter = 0;

    public Bank(String account, int money) {
        this.account = account;
        this.money = money;
    }

    public void deposite(int money) {
        // synchronized(this) {
            System.out.println("-- " + Thread.currentThread().getName() + " " + this.money + " --");
            // setMoney(money);
            this.money += money;
        // }
    }

    public boolean withdraw(int money) {
        // synchronized(this) {
            if(this.money >= money) {
                System.out.println("-- " + Thread.currentThread().getName() + " " + this.money + " --");
                // setMoney(-money);
                this.money -= money;
                
                return true;
            }
            else {
                this.withdrawCounter++;
                
                return false;
            }
        // }
    }

    public String getAccount() {
        return this.account;
    }

    public int getMoney() {
        return this.money;
    }
}