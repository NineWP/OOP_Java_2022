import java.util.Scanner;

public class Pro2_64010761 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2) : ");
        int num = sc.nextInt();
        while(num < 0 || num > 2){
            System.out.print("Error try again : ");
            num = sc.nextInt();
        }
        int random = (int)(Math.random()*3);
        String result;

        String [] hand = {"scissor", "rock", "paper"};

        if((num == 2 && random == 1) || 
            (num == 1 && random == 0) ||
            (num == 0 && random == 2)){
            result = ". You won";
        }
        else if((num == 2 && random == 0) ||
                (num == 1 && random == 2) ||
                (num == 0 && random == 1)){
            result = ". You lose";
        }
        else{
            result = " too. It is a draw";
        }

        System.out.print("The computer is " +hand[random]+ ". You are " +hand[num] + result );
        sc.close();
    }
}
