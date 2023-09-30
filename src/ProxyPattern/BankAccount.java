package ProxyPattern;

public class BankAccount implements Account{
    @Override
    public void withdraw() {
        System.out.println("Withdrawing Rs. 30");
    }

    @Override
    public void getAccountNumber() {
        System.out.println(1000011);
    }
}
