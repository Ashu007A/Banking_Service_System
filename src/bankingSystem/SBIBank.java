package bankingSystem;

public class SBIBank implements RBIBankInterface {

    private String accNo;

    private String passCode;

    private Double balance;

    private double rateOfInterest = 6;

    private Integer minimumBalance = (Integer) 500;

    public SBIBank(String accNo, String passCode, double balance) {
        this.accNo = accNo;
        this.passCode = passCode;
        this.balance = balance;

        System.out.println("Account created successfully!");
        System.out.println("Account no. - " + this.accNo + "\nBalance - " + this.balance + "/- \n");
    }

    public void depositMoney(int money) {

        if(money > 0){
            balance = (Double) (balance + money);
            System.out.println("Amount of " + money + "/- has been added to your account. Total balance is " + balance + "/- \n");;
        }
        else {
            System.out.println("Money entered is negative \n");;
        }
    }

    public void withdrawMoney(int money, String password) {

        if (password.equals(this.passCode)) {
            if (balance-minimumBalance >= money) {
                balance = balance - money;
                System.out.println("Amount of " + money + "/- has been withdrawn. Remaining balance is " + balance + "/- \n");;

            }
            else {
                System.out.println("Insufficient Balance. Min Balance that needs to supported is " + minimumBalance + "/- \n");;
            }

        }else{
            System.out.println("Wrong password entered \n");;
        }

    }

    public void checkBalance(String password) {
        if (this.passCode.equals(password)) {
            System.out.println("The balance is " + this.balance + "/- \n");;
        }
        else {
            System.out.println("Wrong password entered \n");;
        }
    }

    public void calculateTotalInterest(int time) {
        Double simpleInterest = (balance * time * rateOfInterest) / 100;
        System.out.println("Intrest you'll get - " + simpleInterest + "/- \n");
    }
}
