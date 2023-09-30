package ProxyPattern;

public class ATM implements Account{ //proxy to bankAccount

    @Override
    public void withdraw() {
        BankAccount bankAccount = new BankAccount();
        bankAccount.withdraw();
    }

    @Override
    public void getAccountNumber() {

    }
}
