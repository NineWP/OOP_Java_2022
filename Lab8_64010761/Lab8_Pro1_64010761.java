import java.util.Scanner;

public class Lab8_Pro1_64010761 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the side1 of triangle : ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the side2 of triangle : ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the side3 of triangle : ");
        double side3 = sc.nextDouble();

        System.out.print("Enter the color : ");
        String color = sc.next();

        System.out.print("Enter if the Triangle filled or not? (true / false) : ");
        boolean filled = sc.nextBoolean();

        Triangle tri = new Triangle(side1, side2, side3, color, filled);

        System.out.println(tri.toString());
    }
}
