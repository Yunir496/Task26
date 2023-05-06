public class CardAccount extends BankAccount{
    public CardAccount() {
    }

    public CardAccount(double balance) {
        super(balance);
    }

    @Override
    public boolean take(double a){
       return super.take(a+a*0.01);

    }

}
