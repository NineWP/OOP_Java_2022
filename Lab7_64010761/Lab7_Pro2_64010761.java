public class Lab7_Pro2_64010761 {
    public static void main(String[] args) {
        AccountPro2 account = new AccountPro2(1122, 1000, "George");

        System.out.println("Name : " + account.getName());
        System.out.println("Account ID : " + account.getId());
        account.setAnnual(1.5);
        System.out.println("Annual interest rate : " + account.getAnnualInterestRate());

        account.deposit(30);
		account.deposit(40);
		account.deposit(50);

		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);

        System.out.println("Balance : " + account.getBalance());
        System.out.println("Date\t\t\t\tType\t\tAmount\t\tBalance");

        for (int i = 0; i < account.getTransactions().size(); i++) {
			System.out.print((account.getTransactions()).get(i).getDate());
            System.out.print("\t" + (account.getTransactions()).get(i).getType());
            System.out.print("\t\t" + (account.getTransactions()).get(i).getAmount());
            System.out.println("\t\t" + (account.getTransactions()).get(i).getBalance());
		}
    }
}
