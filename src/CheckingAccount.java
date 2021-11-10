public class CheckingAccount extends BankAccount{
    
    private double insufficientFundFee;
    
    public void processCheck(String checkToProcess){

    }
    public void withdrawal(double amount){

    }
    public double getInsufficientFundFee() {
        return insufficientFundFee;
    }
    public void setInsufficientFundFee(double insufficientFundFee) {
        this.insufficientFundFee = insufficientFundFee;
    }
    
}
