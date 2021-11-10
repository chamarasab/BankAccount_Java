public class SavingAccount extends BankAccount {

    private double annualInterestRate;

    public void depositMonthlyInterest(){

    }
    public void withdrawal(double amount){
        super.balance -= amount; 
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void getAccountDetails(){
        System.out.println("Saving Account\n");
        System.out.println("Name : " + getOwner());
        System.out.println("Balance : " + getBalance());
        System.out.println("Ineterest rate : " + getAnnualInterestRate() + " %");
    }
    
}
