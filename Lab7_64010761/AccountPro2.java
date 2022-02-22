import java.util.ArrayList;
import java.util.Date;

public class AccountPro2 {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreate;
    private String name;
    private ArrayList<Transactions> transactions;

    public AccountPro2(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreate = new Date();
        this.name = "";
        transactions = new ArrayList<Transactions>();
    }

    public AccountPro2(int id , double balance){
        this.id = id;
        this.balance = balance;
        this.dateCreate = new Date();
        this.name = "";    
        transactions = new ArrayList<Transactions>();
    }

    public AccountPro2(int id , double balance , String name){
        this.id = id;
        this.balance = balance;
        this.dateCreate = new Date();
        this.name = name;   
        transactions = new ArrayList<Transactions>();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
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
        return annualInterestRate * 100;
    }

    public Date getDateCreate(){
        return dateCreate;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Transactions> getTransactions(){
        return transactions;
    }

    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double money){
        this.balance -= money;
        transactions.add(new Transactions('W', money, balance, "Withdraw from account"));
    }

    public void deposit(double money){
        this.balance += money;
        transactions.add(new Transactions('D', money, balance, "Deposit to account"));
    }

}
