import java.util.Scanner;

public class Lab3_Pro3_64010761 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the size for the matrix : ");
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        int count = 0;

        // generate matrix
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                matrix[i][j] = (int)(Math.random()*2);
            }
        }

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }

        // check row
        for(int i = 0 ; i<n ; i++){
            int defult = matrix[i][0];
            //System.out.println("defult - " + defult);
            for(int j = 0 ; j<n ; j++){
                //System.out.println("matrix - " + matrix[i][j] );
                if(defult != matrix[i][j]){
                    count++;
                    //System.out.println("count - " + count);
                    break;
                }
                else if(j == n-1){
                    System.out.println("All " + defult + "s on row " + (i+1));
                }   
            }
            if(count == n){
                System.out.println("No same number on a row");
                count = 0;
            }
        }
        count = 0;
        // check colum
        for(int i = 0 ; i<n ; i++){
            int defult = matrix[0][i];
            //System.out.println("defult - " + defult);
            for(int j = 0 ; j<n ; j++){
                //System.out.println("matrix - " + matrix[j][i] );
                if(defult != matrix[j][i]){
                    count++;
                    //System.out.println("count - " + count);
                    break;
                }
                else if(j == n-1){
                    System.out.println("All " + defult + "s on colum " + (i+1));
                }   
            }
            if(count == n){
                System.out.println("No same number on a colum");
                count = 0;
            }
        }

        // check superdiagonal
        int defult;
        for(int i = 0; i < n; i++){
            if(n == 1){
                System.out.println("No same number on the superdiagonal");
                break;
            }
            else{
                defult = matrix[0][1];
            }
            for(int j = i+1; j<n; j++){
                if(defult != matrix[i][j]){
                    System.out.println("No same number on the superdiagonal");
                    i = n;
                    j = n;
                }
                else if(j == n-1 && i == n-2){
                    System.out.println("All " + defult + "s on the superdiagonal");
                }
            }
        }

        // check diagonal
        defult = matrix[0][0];
        for(int i = 0; i<n; i++){
            int j = i;
            if(defult != matrix[i][j]){
                System.out.println("No same number on the diagonal");
                break;
            }
            else if(i == n-1){
                System.out.println("All " + defult +"s on the diagonal");
            }
        }
        
        // check subdiagonal
        for(int i = 0; i<n; i++){
            if(n == 1){
                System.out.println("No same number on the subdiagonal");
                break;
            }
            else{
                defult = matrix[0][1];
            }
            for(int j = i+1; j<n; j++){
                if(defult != matrix[j][i]){
                    System.out.println("No same number on the subdiagonal");
                    i = n;
                    j = n;
                }
                else if(j == n-1 && i == n-2){
                    System.out.println("All " + defult + "s on the subdiagonal");
                }
            }
        }
    }

}
