public class Pro1_64010761 {
    public static void main(String[] args) {
        Stock ORCL = new Stock("ORCL" , "Oracle Coperation" , 34.5 , 34.35);
        System.out.println("Symbol : " + ORCL.getSymbol());
        System.out.println("Name : " + ORCL.getName());
        System.out.println("Previous Closing Price : " + ORCL.getPrevPrice());
        System.out.println("Current Price : " + ORCL.getCurrentPrice());
        System.out.println("Price Change : " + ORCL.getChangePercent() + " %");
    }
}
