public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Bank\n");

        SavingAccount savingAccount = new SavingAccount();

        //creating new saving account
        savingAccount.setOwner("Chamara Ekanayake");
        savingAccount.setBalance(1500);
        savingAccount.setAnnualInterestRate(9);

        savingAccount.getAccountDetails(); // display account details

        //deposit
        System.out.println("\nDeposit : 5000");
        savingAccount.deposit(5000);
        System.out.println("Balance : " + savingAccount.getBalance());

        //withdraw
        System.out.println("\nWithdraw : 2550");
        savingAccount.withdrawal(2550);
        System.out.println("Balance : " + savingAccount.getBalance());
    }
}
