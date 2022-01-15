import java.util.Scanner;

class Method {
    public static void main(String[] args) {
        display();
        plus();
        message("kimi no toriko", 777);

        int sum = summary(50,50);
        System.out.println(sum);
        System.out.println(summary(75, -60));
        System.out.println(getIp());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int salary = sc.nextInt();
        
        int bonus = getBonus(salary);
        System.out.println("Your bonus : " + bonus);
        sc.close();

        int []numberA = {10, 20, 30, 40, 50};
        displayArray(numberA);
    }    
    
    // void method 

    static void display(){ // display is name of method
        System.out.println("Hello world");
    }
    static void plus(){
        int a = 20;
        int b = 49;
        System.out.println("sum = " +(a+b));
    }

    // method with parameter
    static void message(String msg, int num){
        System.out.println(msg+ " " +num);
    }

    // method with 'return'
    static int summary(int a, int b){
        int sum = a + b;
        return sum;
    }

    static String getIp(){
        return "192.168.200.1";
    }

    static int getBonus(int x){
        x = x * 2;
        return x;
    }

    // method with array 
    static void displayArray(int []arr){
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println("array[" +i+ "] = " +arr[i]);
        }
    }
}
