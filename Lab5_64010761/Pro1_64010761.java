public class Pro1_64010761 {
    public static void main(String[] args) {
        Account account = new Account(1122, 20000.0);
        account.setAnnual(4.5);
        account.withdraw(2500.0);
        account.deposit(3000.0);
        System.out.println("Balance = " + account.getBalance());
        System.out.println("Monthly Interest = " + account.getMonthlyInterest());
        System.out.println("Date = " + account.getDateCreate());

    }
}
