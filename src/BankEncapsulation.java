import java.util.Scanner;

public class BankEncapsulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create account objects once, outside the loop
        SavingsAccount savingsAccount = new SavingsAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        System.out.println("Hello, Welcome to SBI Bank!");

        // Setup Savings Account
        System.out.print("\nPlease set up your Savings Account.");
        System.out.print("\nEnter Account Number: ");
        savingsAccount.setAccountNumber(sc.nextInt());
        sc.nextLine(); // Consume newline
        System.out.print("Enter Account Holder Name: ");
        savingsAccount.setAccountHolderName(sc.nextLine());

        // Setup Current Account
        System.out.print("\nPlease set up your Current Account.");
        System.out.print("\nEnter Account Number: ");
        currentAccount.setAccountNumber(sc.nextInt());
        sc.nextLine(); // Consume newline
        System.out.print("Enter Account Holder Name: ");
        currentAccount.setAccountHolderName(sc.nextLine());

        BankAccount selectedAccount = null;
        int option;

        do {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Select Savings Account");
            System.out.println("2. Select Current Account");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    selectedAccount = savingsAccount;
                    System.out.println("\nSavings Account selected.");
                    break;
                case 2:
                    selectedAccount = currentAccount;
                    System.out.println("\nCurrent Account selected.");
                    break;
                case 3:
                    System.out.println("\nThank you for using SBI Bank, please visit again!");
                    continue; // Skip to next loop iteration to exit
                default:
                    System.out.println("\nInvalid option. Please try again.");
                    selectedAccount = null;
                    break;
            }

            if (selectedAccount != null) {
                int transactionChoice;
                do {
                    System.out.println("\n--- Account Menu ---");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Check Balance");
                    System.out.println("4. Back to Main Menu");
                    System.out.print("Choose an action: ");
                    transactionChoice = sc.nextInt();

                    switch (transactionChoice) {
                        case 1:
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = sc.nextDouble();
                            selectedAccount.deposit(depositAmount);
                            break;
                        case 2:
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawalAmount = sc.nextDouble();
                            selectedAccount.withdrawal(withdrawalAmount);
                            break;
                        case 3:
                            System.out.printf("\nCurrent Balance: ₹ %.2f", selectedAccount.getBalance());
                            break;
                        case 4:
                            System.out.println("\nReturning to Main Menu...");
                            break;
                        default:
                            System.out.println("\nInvalid action. Please try again.");
                            break;
                    }
                } while (transactionChoice != 4);
            }
        } while (option != 3);

        sc.close();
    }
}