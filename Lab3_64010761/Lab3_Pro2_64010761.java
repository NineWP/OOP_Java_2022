import java.util.Scanner;

public class Lab3_Pro2_64010761 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.print("Enter list1 : ");
        String list1 = sc.nextLine();
        System.out.print("Enter list2 : ");
        String list2 = sc.nextLine();

        String [] list1Num = list1.split(" ");
        String [] list2Num = list2.split(" ");

        int length1 = list1Num.length;
        int length2 = list2Num.length;
        int [] intList1 = new int[length1];
        int [] intList2 = new int[length2];

        for(int i = 0 ; i < length1 ; i++){
            intList1[i] = Integer.parseInt(list1Num[i]);
        }
        for(int i = 0 ; i < length2 ; i++){
            intList2[i] = Integer.parseInt(list2Num[i]);
        }
        
        int [] result = merge(intList1, intList2);
        result = sortArray(result);

        System.out.print("The merged list is");
        for(int i = 0 ; i < result.length ; i++){
            System.out.print(" " + result[i]);
        }

    }   

    public static int[] merge(int[] list1, int[] list2){
        int length1 = list1.length;
        int length2 = list2.length;
        int [] result = new int[length1 + length2];
        System.arraycopy(list1, 0, result, 0, length1);
        System.arraycopy(list2, 0, result, length1, length2);
        return result;

    }

    public static int[] sortArray(int [] result){
        int temp;
        for (int i = 0; i <result.length; i++) {     
            for (int j = i+1; j <result.length; j++) {     
                if(result[i] >result[j]) {      //swap elements if not in order
                   temp = result[i];    
                   result[i] = result[j];    
                   result[j] = temp;    
                 }     
              }     
        }    
            return result;
    }
}
