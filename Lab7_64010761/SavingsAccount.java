public class SavingsAccount extends Account {
    SavingsAccount(int id, double balance){
        this.id = id;
        this.balance = balance;
    }
    
    public String withdraw(double money){
        if(money > balance){
            System.out.println("Withdraw : " + money);
            System.out.print("Error Balance is not enough for withdraw ; ");
            return "Error";
        }
        else{
            balance -= money;
        }
        return Double.toString(money);
    }
}
