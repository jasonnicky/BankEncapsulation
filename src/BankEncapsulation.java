import java.util.Scanner;

public class BankEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // SavingsAccount details
        SavingsAccount sa = new SavingsAccount();

        System.out.println("Hello, Welcome to SBI Bank!");
        System.out.print("\nPlease Enter your bank details in the portal:");

        int option;
        do {
            System.out.println("\nOptions" +
                    "\n 1. To check Savings Account: " +
                    "\n 2. To check Current Account: " +
                    "\n 3. To exit the program."
            );
            System.out.print("Enter a number and I will treat it as an option to perform bank transactions: ");

            option = sc.nextInt();

            switch (option){
                case 1:
                    System.out.println("\nSavings Account: ");
                    /*sa.setAccountName("Rob-B01");*/

                    System.out.print("\nPlease Enter AccountNumber in the portal:");
                    int sa_AccountNumber = sc.nextInt();
                    sa.setAccountNumber(sa_AccountNumber);

                    sc.nextLine();

                    /*sa.setAccountHolderName("Robert");*/
                    System.out.print("\nPlease Enter AccountHolderName in the portal:");
                    String sa_AccountHolderName = sc.nextLine();
                    sa.setAccountHolderName(sa_AccountHolderName);

                    /*sa.deposit(15000.00);
                    sa.withdrawal(5000.00);*/
                    System.out.print("Enter the amount you want to deposit initially into your Savings Account: ");
                    double sa_deposit = sc.nextDouble();
                    sa.deposit(sa_deposit);

                    System.out.println();
                    System.out.print("\nEnter the amount you want to withdraw from your Savings Account: ");
                    double sa_withdrawal = sc.nextDouble();
                    sa.withdrawal(sa_withdrawal);

                    System.out.printf("\nFinal Balance in Savings Account: ₹ " + sa.getBalance());

                    break;

                case 2:
                    // CurrentAccount details
                    CurrentAccount ca = new CurrentAccount();
                    System.out.println();
                    System.out.print("\nCurrent Account:");

                    /*ca.setAccountName("Bob-B02");*/

                    System.out.print("\nPlease Enter AccountNumber in the portal:");
                    int ca_AccountNumber = sc.nextInt();
                    ca.setAccountNumber(ca_AccountNumber);

                    sc.nextLine();
                    /*ca.setAccountHolderName("Bobby");*/
                    System.out.print("\nPlease Enter AccountHolderName in the portal:");
                    String ca_AccountHolderName = sc.nextLine();
                    ca.setAccountHolderName(ca_AccountHolderName);
                    /*ca.deposit(25000.00);
                    ca.withdrawal(5000.00);*/

                    System.out.println();
                    System.out.print("\nEnter the amount you want to deposit initially into your Current Account: ");
                    double ca_deposit = sc.nextDouble();
                    ca.deposit(ca_deposit);

                    System.out.println();
                    System.out.print("\nEnter the amount you want to withdraw from your Current Account: ");
                    double ca_withdrawal = sc.nextDouble();
                    ca.withdrawal(ca_withdrawal);

                    System.out.println("\nFinal Balance in Current Account: ₹ " + ca.getBalance());
                    break;

                case 3:
                    System.out.println("Thank you for using SBI Bank, please visit again!");
                    break;
            }
        }while(option != 3);
    }
}