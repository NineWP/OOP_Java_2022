public class Lab3_Pro1_64010761 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2 ; i<1000 ; i++){
            if(checkPrime(i) && checkPal(i)){
                System.out.print(i + " ");
                count++;
                if(count == 10){
                    System.out.print("\n");   
                }
            }
        }
    }

    static boolean checkPrime(int num){
        int b = 0;
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                b++;
            }
        }
        if(b == 2)
            return true;
        else    
            return false;
    }

    static boolean checkPal(int num){
        int r, sum = 0, temp = num;
        while(num>0){
            r =  num % 10;
            sum = sum*10 + r;
            num = num / 10;
        }

        if(temp == sum)
            return true;
        else
            return false;
    }
}
