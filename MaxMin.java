public class MaxMin {
    public static void main(String[] args) {
        int [] number = {12, 2, 7, 4, 5, 10, 9, 20};
        int max = getMax(number);
        int min = getMin(number);
        System.out.println("Max = " + max + " Min = " + min);
    }

    static int getMax(int [] num){
        int max = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] > max){
                max = num[i];
            }
        }
        return max;
    }
    
    static int getMin(int [] num){
        int min = num[0];
        for(int i = 1; i < num.length; i++){
            if(num[i] < min){
                min = num[i];
            }
        }
        return min;
    }
}
