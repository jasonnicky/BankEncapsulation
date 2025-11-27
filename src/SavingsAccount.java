public class SavingsAccount extends BankAccount {
    private int dailyWithdrawalCount = 0;
    private final int withdrawalLimit = 3;
    private final double minBalance = 1200.00d;

    @Override
    public double deposit(double amount){
        System.out.printf("\n₹ %.2f is being Deposited to Savings Account.",amount);
        setBalance(getBalance() + amount);
        System.out.print("\nCurrent Balance after depositing: ₹ "+getBalance());
        return getBalance();
    }

    @Override
    public double withdrawal(double amount){
        // Check 1: Ensure daily withdrawal limit is not exceeded
        if (dailyWithdrawalCount >= withdrawalLimit) {
            System.out.printf("\nTransaction failed. You have reached your daily withdrawal limit of %d.", withdrawalLimit);
            return getBalance();
        }

        // Check 2: Ensure withdrawal doesn't go below minimum balance
        if (getBalance() - amount < minBalance) {
            System.out.printf("\nTransaction failed. Withdrawing %.2f would bring the balance below the minimum of %.2f.", amount, minBalance);
            System.out.printf("\nCurrent Balance: ₹ %.2f", getBalance());
            return getBalance();
        }

        // All checks passed, proceed with withdrawal
        System.out.printf("\n₹ %.2f is being Withdrawn from Savings Account.", amount);
        setBalance(getBalance() - amount);
        dailyWithdrawalCount++;
        System.out.printf("\nCurrent Balance: ₹ %.2f", getBalance());
        System.out.printf("\nWithdrawals today: %d/%d", dailyWithdrawalCount, withdrawalLimit);
        return getBalance();
    }
}