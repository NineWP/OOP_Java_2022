import java.util.Scanner;

public class Pro1_64010761 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's day : ");
        int num = sc.nextInt();
        System.out.print("Enter the number of day elapsed since today : ");
        int future = sc.nextInt();

        String day;
        String futureDay;

        day = checkDay(num);
        num += future;
        num %= 7;
        futureDay = checkDay(num);

        System.out.print("To day is " +day+ " and the future day is " +futureDay);
        sc.close();

    }

    static String checkDay(int num){

        String day = null;

        switch(num){
            case 0 :
                day = "Sunday";
                break;
            case 1 :
                day = "Monday";
                break;
            case 2 :
                day = "Tuesday";
                break;
            case 3 :
                day = "Wednesday";
                break;
            case 4 :
                day = "Thursday";
                break;
            case 5 :
                day = "Friday";
                break;
            case 6 :
                day = "Saturday";
                break;
        }
        return day;
    }
}
