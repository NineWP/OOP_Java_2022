public class Lab7_Pro1_64010761 {
    public static void main(String[] args) {
        Account account1 = new Account(1122, 20000.0);
        System.out.println("\nObject of Account");
        System.out.println("Balance is : " + account1.getBalance());
        System.out.println("Withdraw : " + account1.withdraw(5000));
        System.out.println("Balance is : " + account1.getBalance());
        System.out.println("Deposit : " + account1.deposit(50000));
        System.out.println("Balance is : " + account1.getBalance());
        System.out.println("This account was created at " + account1.getDateCreate());

        CheckingAccount account = new CheckingAccount(112, 5000.0);
        System.out.println("\nChecking Account");
        System.out.println("Overdraft limit : " + account.getOverDraftLimit());
        System.out.println("Balance is : " + account.getBalance());
        System.out.println("Withdraw : " + account.withdraw(10000));
        System.out.println("Balance is : " + account.getBalance());
        System.out.println("Overdraft limit : " + account.getOverDraftLimit());
        System.out.println("Withdraw : " + account.withdraw(10000));
        System.out.println("This account was created at " + account.getDateCreate());
        
        SavingsAccount saveAccount = new SavingsAccount(256, 2000);
        System.out.println("\nSavings Account");
        System.out.println("Balance is : " + saveAccount.getBalance());
        System.out.println("Withdraw : " + saveAccount.withdraw(1000));
        System.out.println("Balance is : " + saveAccount.getBalance());
        System.out.println("Withdraw : " + saveAccount.withdraw(2000));
        System.out.println("This account was created at " + saveAccount.getDateCreate() + "\n");
    }
}
