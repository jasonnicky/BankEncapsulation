import java.util.Scanner;

public class BankEncapsulation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // SavingsAccount details
        SavingsAccount sa = new SavingsAccount();

        sa.setAccountName("Rob-B01");
        sa.setAccountHolderName("Robert");
        /*sa.deposit(15000.00);
        sa.withdrawal(5000.00);*/

        System.out.print("Enter the amount you want to deposit initially into your Savings Account: ");
        double sa_deposit = sc.nextDouble();
        sa.deposit(sa_deposit);

        System.out.println();
        System.out.print("\nEnter the amount you want to withdraw from your Savings Account: ");
        double sa_withdrawal = sc.nextDouble();
        sa.withdrawal(sa_withdrawal);

        System.out.printf("\nFinal Balance in Savings Account: ₹ "+sa.getBalance());

        // CurrentAccount details
        CurrentAccount ca = new CurrentAccount();

        ca.setAccountName("Bob-B02");
        ca.setAccountHolderName("Bobby");
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

        System.out.println("\nFinal Balance in Current Account: ₹ "+ca.getBalance());
    }
}