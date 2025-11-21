public class CurrentAccount extends BankAccount{

    @Override
    public double deposit(double amount){

        System.out.printf("\n₹ %.2f is being Deposited to Current Account: ",amount);
        setBalance(getBalance() + amount);

        return getBalance();
    }

    @Override
    public double withdrawal(double amount){
        System.out.printf("\n₹ %.2f is being Withdrawn from Current Account: ",amount);

        if(amount > getBalance()){
            System.out.println("Savings are low, CANNOT Withdraw Money from Current Account. \nCurrent Balance: "+getBalance());
            return getBalance();
        }

        setBalance(getBalance() - amount);
        return getBalance();
    }
}