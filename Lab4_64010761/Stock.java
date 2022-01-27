public class Stock {

    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    
    Stock(String symbol , String name , double previousClosingPrice , double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getName(){
        return name;
    }

    public double getPrevPrice(){
        return previousClosingPrice;
    }

    public double getCurrentPrice(){
        return currentPrice;
    }

    public double getChangePercent(){
        return (this.currentPrice - this.previousClosingPrice)/this.previousClosingPrice * 100;
    }
}
