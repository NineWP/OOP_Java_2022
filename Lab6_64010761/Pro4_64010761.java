import java.util.Scanner;

public class Pro4_64010761 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int status;
        double taxable;
        double [] rate = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int [][] brackets = {
            {8350, 33950, 82250, 171550, 372950},  // Single filer
            {16700, 67900, 137050, 20885, 372950}, // Married jointly
            {8350, 33950, 68525, 104425, 186475},  // Married separately
            {11950, 45500, 117450, 190200, 372950} // Head of household
        };
        System.out.println("Filing Status\n" +
                            "[0]-Single filer\n" +
                            "[1]-Married jointly or qualifying widow(er)\n" +
                            "[2]-Married separately\n" +
                            "[3]-Head of household\n");

        System.out.print("Enter the filing status : ");
        status = sc.nextInt();
        System.out.print("Enter the taxable income : ");
        taxable = sc.nextDouble();

        Tax tax = new Tax(status, brackets, rate, taxable);

        System.out.println("Tax is " + tax.getTax());
    }
}
