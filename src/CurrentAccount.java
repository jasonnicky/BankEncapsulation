public class CurrentAccount extends BankAccount{
    private double overdraftLimit = 5000.00d;

    @Override
    public double deposit(double amount){
        System.out.printf("\n₹ %.2f is being Deposited to Current Account.",amount);
        setBalance(getBalance() + amount);
        System.out.print("\nCurrent Balance after depositing: ₹ "+getBalance());
        return getBalance();
    }

    @Override
    public double withdrawal(double amount){
        if(amount >= (getBalance()+overdraftLimit)){
            System.out.printf("\nOverdraft Max Limit has been reached.\nRemaining Balance in Current Account: ₹ %.2f",getBalance());
            return getBalance();
        }

        System.out.printf("\n₹ %.2f is being Withdrawn from Current Account.",amount);
        setBalance(getBalance() - amount);
        return getBalance();
    }
}