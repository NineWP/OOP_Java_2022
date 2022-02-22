public class SavingsAccount extends Account {
    SavingsAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    public double withdraw(double money){
        if(money > balance){
            System.out.println("Error Balance is not enough for withdraw");
        }
        else{
            balance -= money;
        }
        return money;
    }
}
