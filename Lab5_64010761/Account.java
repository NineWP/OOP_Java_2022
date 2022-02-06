import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;

    Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreate = new Date();
    }

    public Account(int id , double balance, double annual){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annual / 100;
        this.dateCreate = new Date();    
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

    public void withdraw(double money){
        this.balance -= money;
    }

    public void deposit(double money){
        this.balance += money;
    }

}
