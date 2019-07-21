public class Bank {
    private String account;
    private int money;

    public Bank(String account, int money) {
        this.account = account;
        this.money = money;
    }

    public void deposite(int money) {
        this.money += money;
    }

    public boolean withdraw(int money) {
        if(this.money >= money) {
            this.money -= money;

            return money;
        }
        else {
            return false;
        }
    }

    public String getAccount() {
        return this.account;
    }
}