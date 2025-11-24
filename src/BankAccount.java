public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    // getter methods
    public int getAccountNumber(){ return accountNumber;}
    public double getBalance(){ return balance;}
    public String getAccountHolderName(){ return accountHolderName;}

    // setter methods
    public void setAccountNumber(int accountNumber){ this.accountNumber = accountNumber;}

    // protected, so that only classes which are extended can modify setBalance() method
    protected void setBalance(double balance){ this.balance = balance;}
    public void setAccountHolderName(String accountHolderName){ this.accountHolderName = accountHolderName;}

    public double deposit(double amount){ balance += amount; return balance;}

    public double withdrawal(double amount){
        if(amount > balance) {
            System.out.println("\nCANNOT Withdraw, Balance is 'LOW'.");
            return balance;
        }

        balance -= amount;
        return balance;
    }
}