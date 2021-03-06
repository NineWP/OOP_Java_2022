import java.util.Date;

public class Account {
    int id;
    double balance;
    double annualInterestRate;
    Date dateCreate;

    public Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreate = new Date();
    }

    public Account(int id , double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreate = new Date();    
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setAnnual(double annual){
        this.annualInterestRate = annual / 100;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreate(){
        return dateCreate;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public String withdraw(double money){
        this.balance -= money;
        return Double.toString(money);
    }

    public String deposit(double money){
        this.balance += money;
        return Double.toString(money);
    }

}
