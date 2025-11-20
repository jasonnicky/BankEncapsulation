public class CurrentAccount extends BankAccount{

    @Override
    public double deposit(double amount){
        System.out.println(" Money is being Deposited to Current Account: ");
        setBalance(getBalance() + amount);

        return getBalance();
    }

    @Override
    public double withdrawal(double amount){
        System.out.println("Money is being Withdrawn from Current Account: ");

        if(amount > getBalance()){
            System.out.println("Savings are low, CANNOT Withdraw Money from Current Account."+getBalance());
            return getBalance();
        }

        setBalance(getBalance() - amount);
        return getBalance();
    }
}