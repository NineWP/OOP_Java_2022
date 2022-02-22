public class CheckingAccount extends Account {
    private double overdraftLimit;

    CheckingAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
        overdraftLimit = 5000;
    }

    public double getOverDraftLimit(){
        return overdraftLimit;
    }

    public double withdraw(double money){
        balance -= money;
        if(balance < 0){
            if(overdraftLimit + balance < 0){
                System.out.println("Overdraft has reach the limit");
            }
            else{
                overdraftLimit += balance;
            }
        }
        return money;
    }
}
