import java.text.DecimalFormat;
import java.util.Scanner;

public class Pro4_64010761 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0000");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in pounds : ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in inches : ");
        double height = sc.nextDouble();
        double bmi ;

        weight *= 0.45359237;
        height *= 0.0254;

        bmi = weight / (height * height);
        System.out.print("BMI is " + df.format(bmi)); // 
        sc.close();
    }
}
