public class Lab8_Pro4_64010761 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon oct = new Octagon(5,"Blue",true);
        System.out.println("\n" + oct.toString());

        Octagon oct2 = (Octagon)oct.clone();

        if(oct.compareTo(oct2) == -1){
            System.out.println("Octagon(copy) is equal Octagon");
        }
        else{
            System.out.println("Octagon(copy) is not equal Octagon");
        }
    }
}
