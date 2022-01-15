import java.util.Scanner;

class Input {
    public static void main(String[] args) {
        System.out.print("Enter your name : ");
        Scanner sc = new Scanner(System.in); // System.in mean input from keyboard
        String myName = sc.nextLine(); // nextLine getstring from keyboard. if use 'next' instead of 'nextLine' it won't allow space bar
        System.out.println("Hello " + myName);

        System.out.print("Enter your age : ");
        int year = sc.nextInt(); // nexFloat for float, nextDouble for double  
        System.out.println(year);
        
        sc.close();
    }    
}
