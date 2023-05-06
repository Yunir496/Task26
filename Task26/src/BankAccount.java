public class BankAccount {
    private double balance;
    public BankAccount() {

    }
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public boolean send(BankAccount receiver, double amount) {
        if (take(amount)) {
            receiver.put(amount);
            return true;
        }
        return false;
    }

    public double getAmount() {
        return balance;
    }

    public boolean take(double a) {

        if ((balance >= a) && (a >= 0)) {

            balance = balance - a;
            return true;
        }
        return false;
    }

    public void put(double b) {
        if (b >= 0) {
            balance = b + balance;
        }
    }
}
