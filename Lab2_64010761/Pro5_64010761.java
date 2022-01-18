import java.util.Scanner;

public class Pro5_64010761 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of line : ");
        int n = sc.nextInt();
        while(n < 1){
            System.out.print("ERROR try again : ");
            n = sc.nextInt();
        }
        int space = 0;

        if(n>9){
            space = n-9;
        }

        for(int i = 1 ; i <= n ; i++){
            if(n>9 && i < 10){
                for(int s = space; s > 0 ; s--){
                    System.out.print(" ");
                }
            }
            else if(n>9 && i >= 10){
                space --;
                for(int s = space; s > 0 ; s--){
                    System.out.print(" ");
                }
            }
            for(int j = n ; j > 0 ; j--){

                if(i >= j)
                    System.out.print(" " + j);
                else    
                    System.out.print("  ");
            }
            for(int j = 2 ; j <= n ; j++ ){
                if(i >= j)
                    System.out.print(" " + j);
                else    
                    System.out.print("  ");
            }
            System.out.print("\n");
        }

        sc.close();

    }
}
