import java.util.Scanner;

public class Pro1_64010761 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your weight in pounds : ");
        double w = sc.nextDouble();
        System.out.print("Enter your height in feet : "); // 1 feet = 12 inches
        double hf = sc.nextDouble();
        System.out.print("Enter your height in inches : ");
        double hi = sc.nextDouble();
        
        BMI bmi = new BMI(name, age, w, hf, hi);
        System.out.println("Your BMI is " + bmi.getBMI());
        System.out.println("You are " + bmi.getInterpretation() + ".");
    }
}
