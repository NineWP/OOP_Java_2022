import java.util.Scanner;

public class Lab2_Pro3_64010761 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: (e.g., 2012) : ");
        int year = sc.nextInt();
        
        System.out.print("Enter month: 1-12: ");
        int m = sc.nextInt();
        if(m < 3){
            m += 12;
            year -= 1;
        }

        System.out.print("Enter the day of the month: 1-31: ");
        int q = sc.nextInt();

        int j = year / 100;
        int k = year % 100;

        int h = (q + (26*(m+1))/10 + k/4 + j/4 + 5*j + k ) % 7;

        String day = null;

        switch(h){
            case 0 :
                day = "Saturday";
                break;
            case 1 :
                day = "Sunday";
                break;
            case 2 :
                day = "Monday";
                break;
            case 3 :
                day = "Tuesday";
                break;
            case 4 :
                day = "Wednesday";
                break;
            case 5 :
                day = "Thursday";
                break;
            case 6 :
                day = "Friday";
                break;
           
        }

        System.out.println("The name of the day of the week is : " + day);
        sc.close();
    }   
}
