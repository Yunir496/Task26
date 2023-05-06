import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.put(100.0);
        bankAccount.take(50.0);
        bankAccount.take(100.0);
        System.out.println(bankAccount.getAmount());
        CardAccount cardAccount = new CardAccount(100);
        cardAccount.take(50);
        System.out.println(cardAccount.getAmount());
        DepositAccount depositAccount = new DepositAccount(100);
        depositAccount.take(10);
        depositAccount.put(10);
        depositAccount.take(10);
        System.out.println(depositAccount.getAmount());
    }
}
