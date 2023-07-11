package bankingSystem;

public class         LotakBank implements RBIBankInterface {


    private String accountNo;

    private String password;

    private double balance;

    private double rateOfInterest = 7.5;

    public LotakBank(String accountNo,String password,double balance){

        this.accountNo = accountNo;
        this.password = password;
        this.balance = balance;
    }

    public String depositMoney(int money) {

        if(money>0){
            balance = balance + money;
            return "Money :"+money+" has been added to your account. Total " +
                    "balance is"+balance;
        }
        else{
            return "Money entered is negative";
        }
    }

    public String withdrawMoney(int money, String password) {

        if(password.equals(this.password)){
            if(balance>=money){
                balance = balance - money;
                return "Money :"+money+" has been withdrawn. Remaining balance is "+balance;

            }else{
                return "Inti Dhanrashi nhi hai Bank Account Mein";
            }

        }else{

            return "Wrong password entered";
        }
    }

    public String checkBalance(String password) {

        if(this.password.equals(password)){
            return "The balance is "+this.balance;
        }else{
            return "Wrong password entered";
        }
    }

    public Double calculateTotalInterest(int time) {

        Double simpleInterest = (balance*time*rateOfInterest)/100;

        return simpleInterest;

    }
}

