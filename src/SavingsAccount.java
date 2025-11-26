public class SavingsAccount extends BankAccount {
    private int dailyWithdrawalCount = 0;
    private int withdrawalLimit = 3;
    private double minBalance = 1200.00d;

    @Override
    public double deposit(double amount){
        System.out.printf("\n₹ %.2f is being Deposited to Savings Account.",amount);
        setBalance(getBalance() + amount);
        System.out.print("\nCurrent Balance after depositing: ₹ "+getBalance());
        return getBalance();
    }

    @Override
    public double withdrawal(double amount){

        if((getBalance() - minBalance )> amount){
            System.out.printf("\nTransaction failed.\nNote: Minimum Balance: ₹ %.2f \nAvailable Balance: ₹ %.2f",minBalance,getBalance());
        }else{
            if(withdrawalLimit >= dailyWithdrawalCount){
                System.out.printf("\nMaximum Withdrawal Limit ");
            }else{
                if(amount > getBalance()){
                    System.out.print("\nSavings are low, CANNOT Withdraw Money from Savings Account. \nCurrent Balance: ₹ "+getBalance());
                    return getBalance();
                }
                dailyWithdrawalCount++;
            }
        }

        System.out.printf("\n₹ %.2f is being Withdrawn from Savings Account.",amount);

        setBalance(getBalance() - amount);
        return getBalance();
    }
}