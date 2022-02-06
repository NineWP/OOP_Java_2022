import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private double annualInterestRate = 0;
    private Date dateCreate;

    Account(int id , double balance, double annual){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annual / 100;
        dateCreate = new Date();    
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
        return balance * getAnnualInterestRate();
    }

    public void withdraw(double money){
        this.balance -= money;
    }

    public void deposit(double money){
        this.balance += money;
    }

}
