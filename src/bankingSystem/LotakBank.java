package bankingSystem;

public class LotakBank implements RBIBankInterface {

    private String accountNo;

    private String password;

    private double balance;

    private double rateOfInterest = 7.5;

    public LotakBank(String accountNo, String password, double balance) {

        this.accountNo = accountNo;
        this.password = password;
        this.balance = balance;

        System.out.println("Account created successfully!");
        System.out.println("Account no. - " + this.accountNo + "\nBalance - " + this.balance + "/- \n");
    }

    public void depositMoney(int money) {

        if (money > 0) {
            balance = balance + money;
            System.out.println("Amount of " + money + "/- has been added to your account. \nTotal balance is " + balance + "/- \n");
        }
        else {
            System.out.println("Money entered is negative \n");
        }
    }

    public void withdrawMoney(int money, String password) {

        if (password.equals(this.password)) {
            if(balance >= money){
                balance = balance - money;
                System.out.println("Amount of " + money + "/- has been withdrawn. \nRemaining balance is " + balance + "/- \n");;

            }
            else {
                System.out.println("You don't have enough balance to withdraw entered amount! \n");;
            }

        }
        else {
            System.out.println("Wrong password entered \n");;
        }
    }

    public void checkBalance(String password) {

        if (this.password.equals(password)) {
            System.out.println("The balance is " + this.balance + "/- \n");;
        }
        else {
            System.out.println("Wrong password entered \n");;
        }
    }

    public void calculateTotalInterest(int time) {

        Double simpleInterest = (Double) ((balance * time * rateOfInterest) / 100);

        System.out.println("You'll get interest of - " + simpleInterest + "/- \n");
    }
}

