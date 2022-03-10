import java.util.Scanner;

public class Pro6_64010761 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Set id
        Account [] account = new Account[10];
        for(int i = 0 ; i < 10 ; i++){
            account[i] = new Account(i);
        }

        System.out.print("Enter an id : ");
        int id = sc.nextInt();
        while(id > 9 || id < 0){
            System.out.print("Error try again : ");
            id = sc.nextInt();
        }

        int choice = 0;
        double amount ;

        //main loop
        while(true){
            while(choice != 4){
                choice = getInput();
                switch(choice){
                    case 1 :
                        System.out.println("The balance is : " + account[id].getBalance());
                        break;
                    case 2 :
                        System.out.print("Enter an amount to withdraw : ");
                        amount = sc.nextDouble();
                        while(amount < 0 || amount > account[id].getBalance()){
                            System.out.print("Error try again : ");
                            amount = sc.nextDouble();
                        }
                        account[id].withdraw(amount);
                        break;
                    case 3 :
                        System.out.print("Enter an amount to deposit : ");
                        amount = sc.nextDouble();
                        while(amount < 0){
                            System.out.print("Error try again : ");
                            amount = sc.nextDouble();
                        }
                        account[id].deposit(amount);
                        break;
                }
            }
        System.out.print("Enter an id : ");
        id = sc.nextInt();
            while(id > 9 || id < 0){
                System.out.print("Error try again : ");
                id = sc.nextInt();
            }
        choice = 0;
        }
        
    }

    public static int getInput(){
        System.out.print("Main menu\n" +
                         "1: check balance\n" +
                         "2: withdraw\n" + 
                         "3: deposit\n" +
                         "4: exit\n" +
                         "Enter a choice : ");
        int choice = sc.nextInt();
        while(choice > 4 || choice < 1){
            System.out.print("Error Try again :");
            choice = sc.nextInt();
        }
        return choice;
    }
}
