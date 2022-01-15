public class Var_arg {
    public static void main(String[] args) {
        summation(10, 20, 30);
        summation(10, 20);
        summation(10, 15, 62, 70);
    }

    public static void summation(int...number){
        int sum = 0;
        for(int i = 0; i<number.length; i++){
            sum+=number[i];
        }
        if(sum > 100){
            System.out.println("return = get out of method");
            return;
        }
        System.out.println(sum);

        
    }
}
