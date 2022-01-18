import java.util.Scanner;

public class Lab2_Pro4_64010761 {
    public static void main(String[] args) {
        String [] name = new String[3];
        String temp;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first city : ");
        name[0] = sc.nextLine();
        System.out.print("Enter second city : ");
        name[1] = sc.nextLine();
        System.out.print("Enter third city : ");
        name[2] = sc.nextLine();

        // Sort String
        for(int i=0; i<3; i++)
        {
            for(int j=1; j<3; j++)
            {
                if(name[j-1].compareTo(name[j])>0)
                {
                    temp=name[j-1];
                    name[j-1]=name[j];
                    name[j]=temp;
                }
            }
        }

        System.out.println("The three cities in alphabetical order are " + name[0] + " " + name[1] + " " + name[2]);


        sc.close();
    }
}
