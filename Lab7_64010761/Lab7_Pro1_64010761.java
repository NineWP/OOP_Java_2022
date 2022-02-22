public class Lab7_Pro1_64010761 {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount(112, 5000.0);
        System.out.println("Checking Account");
        System.out.println("Overdraft limit : " + account.getOverDraftLimit());
        System.out.println("Balance is : " + account.getBalance());
        System.out.println("Withdraw : " + account.withdraw(10000));
        System.out.println("Balance is : " + account.getBalance());
        System.out.println("This account was created at " + account.getDateCreate());
        
    }
}
