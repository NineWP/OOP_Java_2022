import java.util.Scanner;

public class Pro3_64010761 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between 0 and 1000 : ");
        int number = sc.nextInt();
        int sum = 0;

        while(number > 0){
            sum += number % 10;
            number /= 10;
        }

        System.out.println("sum of number = " + sum);
        sc.close();
    }
}
