public class BankAccount {
    private String accountName;
    private double balance;
    private String accountHolderName;

    // getter methods
    public String getAccountName(){ return accountName;}
    public double getBalance(){ return balance;}
    public String getAccountHolderName(){ return accountHolderName;}

    // setter methods
    public void setAccountName(String accountName){ this.accountName = accountName;}
    public void setBalance(double balance){ this.balance = balance;}
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