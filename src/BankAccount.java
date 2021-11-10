public class BankAccount {
    protected String owner;
    protected double balance;

    public BankAccount() {
        owner = "";
        balance = 0.00;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
    public void withdrawal(double amount){
        this.balance -= amount; 
    }

    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    
}
