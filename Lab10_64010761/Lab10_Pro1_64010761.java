import java.util.Scanner;

public class Lab10_Pro1_64010761 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i = 0; i < 100; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
		}

        System.out.print("Enter the index of the array :");
        int value = sc.nextInt();

        if(value < 100 && value > 0){
            System.out.println("The value of the index " + value + " is " + num[value]);
        }
        else{
            System.out.println("Array Index Out Of Bounds Exception");
        }
    }
}
