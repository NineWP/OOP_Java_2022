public class Pro1_64010761 {
    public static void main(String[] args) {
        final long secondIn1Year = 31536000;
        long birth, death, immigrant, population;
        

        for(long year = 1; year <= 5; year++){
            birth = (secondIn1Year * year) / 7;
            death = (secondIn1Year * year) / 13;
            immigrant = (secondIn1Year * year) / 45;
            population = birth + immigrant - death;
            System.out.println(year + " Year Population = " + (population + 312032486));
        }
        
    }
}
