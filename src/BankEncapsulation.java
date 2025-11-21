import java.util.Scanner;

public class BankEncapsulation {
    public static void main(String[] args) {

        // SavingsAccount details
        SavingsAccount sa = new SavingsAccount();

        sa.setAccountName("Rob-B01");
        sa.setAccountHolderName("Robert");
        sa.deposit(15000.00);
        sa.withdrawal(5000.00);
        System.out.println("\nFinal Balance in Savings Account: "+sa.getBalance());

        // CurrentAccount details
        CurrentAccount ca = new CurrentAccount();

        ca.setAccountName("Bob-B02");
        ca.setAccountHolderName("Bobby");
        ca.deposit(25000.00);
        ca.withdrawal(5000.00);
        System.out.println("\nFinal Balance in Current Account: "+ca.getBalance());
    }
}