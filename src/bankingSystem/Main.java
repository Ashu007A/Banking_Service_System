package bankingSystem;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Banking Services!");
        System.out.println("Choose Bank to open account with -");
        System.out.println("1. Lotak Bank \n2. SBI Bank \nEnter bank option number:");

        int option = sc.nextInt();

        System.out.println("Create password to secure your account:");
        String password = sc.next();

        System.out.println("Enter intial amount to deposit:");
        Integer initialBalance = (Integer) sc.nextInt();

        long account = 10000000000L + (long) (Math.random() * (99999999999L - 10000000000L));
        String stringVersion = String.valueOf(account);

        RBIBankInterface bankAccount;

        if (option == 1) {
            System.out.println("Welcome to Lotak Bank!");

            bankAccount = new LotakBank(stringVersion, password, initialBalance);

            while (true) {
                System.out.println("Choose option from below: \n1. Add Money \n2. Withdraw Money \n3. Check Balance \n4. Calculate Interest \n5. Exit \nEnter the option number below:");
                Integer choose = (Integer) sc.nextInt();

                if (choose == 1) {
                    System.out.println("Enter amount to deposit:");
                    Integer amount = sc.nextInt();
                    bankAccount.depositMoney(amount);
                }
                else if (choose == 2) {
                    System.out.println("Enter amount to withdraw:");
                    Integer amount = (Integer) sc.nextInt();
                    System.out.println("Enter password:");
                    String pw = sc.next();
                    bankAccount.withdrawMoney(amount, pw);
                }
                else if (choose == 3) {
                    System.out.println("Enter password:");
                    String pw = sc.next();
                    bankAccount.checkBalance(pw);
                }
                else if (choose == 4) {
                    System.out.println("Enter tenure years:");
                    Integer tenure = (Integer) sc.nextInt();
                    bankAccount.calculateTotalInterest(tenure);
                }
                else if (choose == 5){
                    System.out.println("Thank you for using our service!");
                    System.exit(0);
                }
                else {
                    System.out.println("Invalid option. Please choose a valid option!");
                }
            }
        }
        else if (option == 2) {
            System.out.println("Welcome to SBI Bank!");
            
            bankAccount = new SBIBank(stringVersion, password, (double) initialBalance);

            while (true) {
                System.out.println("Choose option from below: \n1. Add Money \n2. Withdraw Money \n3. Check Balance \n4. Calculate Interest \n5. Exit \nEnter the option number below:");
                Integer choose = (Integer) sc.nextInt();

                if (choose == 1) {
                    System.out.println("Enter amount to deposit:");
                    Integer amount = sc.nextInt();
                    bankAccount.depositMoney(amount);
                } else if (choose == 2) {
                    System.out.println("Enter amount to withdraw:");
                    Integer amount = (Integer) sc.nextInt();
                    System.out.println("Enter password:");
                    String pw = sc.next();
                    bankAccount.withdrawMoney(amount, pw);
                } else if (choose == 3) {
                    System.out.println("Enter password:");
                    String pw = sc.next();
                    bankAccount.checkBalance(pw);
                } else if (choose == 4) {
                    System.out.println("Enter tenure years:");
                    Integer tenure = (Integer) sc.nextInt();
                    bankAccount.calculateTotalInterest(tenure);
                } else if (choose == 5) {
                    System.out.println("Thank you for using our service!");
                    System.exit(0);
                } else {
                    System.out.println("Invalid option. Please choose a valid option!");
                }
            }
        }
    }
}