import java.util.Date;

public class Transactions {
    private char type;
    private double amount;
    private double balance;
    private String description;
    private Date date;

    public Transactions(char type , double amount , double balance , String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    public char getType(){
        return type;
    }

    public double getAmount(){
        return amount;
    }

    public double getBalance(){
        return balance;
    }

    public String getDescription(){
        return description;
    }

    public String getDate(){
        return date.toString();
    }
}
