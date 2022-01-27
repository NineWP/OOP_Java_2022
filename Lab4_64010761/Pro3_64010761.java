public class Pro3_64010761 {
    public static void main(String[] args) {
        System.out.println("Creating a list containing 1000 elements,");
        StopWatch stopWatch = new StopWatch();
        double [] num = new double[1000];
        
        for(int i = 0 ; i < 1000 ; i++){
            num[i] = Math.random() * 999 + 1;
        }

        printNum(num);

        System.out.println("List created.\nSorting stopwatch starts . . .");
        stopWatch.start();

        // Sort with selection sort
        for(int i = 0 ; i < 999 ; i++){
            int minIndex = i;
            for(int j = i+1 ; j < 1000 ; j++){
                if(num[j] < num[minIndex]){
                    minIndex = j;
                }
            }
            double temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }

        stopWatch.stop();
        double elapsedTime = stopWatch.getElapsedTime();
        printNum(num);
        System.out.printf("Sorting stopwatch stoped.\nThe sort time is %.1f milliseconds\n", elapsedTime);
        System.out.println("------------------------------------------");
        System.out.println("The palindromPrime stopwatch starts...\nCreating 1000 PalindromPrime...");

        stopWatch.start();
        // Print prime number and palindrom
        int count = 0;
        for(int i = 2 ; count < 100 ; i++){
            if(checkPrime(i) && checkPal(i)){
                System.out.print(i + " ");
                count++;
                if(count % 10 == 0){
                    System.out.print("\n");   
                }
            }
        }

        stopWatch.stop();
        elapsedTime = stopWatch.getElapsedTime();
        System.out.println("PalindromePrime created.\nThe palindromPrime stopwatch stoped.");
        System.out.printf("The palindromPrime time is %.1f milliseconds.", elapsedTime);
    }

    // method to print number in array
    static void printNum(double [] num){
        for(int i = 0 ; i < 1000 ; i++){
            System.out.print("    ");
            String floatToString = Double.toString(num[i]);
            if(Character.compare(floatToString.charAt(2), '.') == 0){
                System.out.print(" ");
            }
            else if(Character.compare(floatToString.charAt(1), '.') == 0){
                System.out.print("  ");
            }
            System.out.printf("%.2f", num[i]);
            if((i+1) % 5 == 0){
                System.out.println();
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
