import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    private LocalDate lastIncome;

    public DepositAccount() {
    }

    public DepositAccount(double balance) {
        super(balance);
    }

    @Override
    public boolean take(double a) {
        if (lastIncome == null || lastIncome.isBefore(LocalDate.now().minusDays(30))) {
            return super.take(a);
        } else {
            System.out.println("Время ограничения не вышло");
            return false;
        }
    }

    @Override
    public void put(double b) {
        lastIncome = LocalDate.now();
        super.put(b);
    }
}
