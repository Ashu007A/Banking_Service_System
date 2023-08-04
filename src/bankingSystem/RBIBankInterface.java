package bankingSystem;

public interface RBIBankInterface {

    public void depositMoney(int money);

    public void withdrawMoney(int money,String password);

    public void checkBalance(String password);

    public void calculateTotalInterest(int time);
}

