import java.util.Scanner;

public class Pro5_64010761 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int status;
        double taxable;
        System.out.println("Filing Status\n" +
                            "[0]-Single filer\n" +
                            "[1]-Married jointly or qualifying widow(er)\n" +
                            "[2]-Married separately\n" +
                            "[3]-Head of household\n");

        System.out.print("Enter the filing status : ");
        status = sc.nextInt();
        System.out.print("Enter the taxable income : ");
        taxable = sc.nextDouble();

        ComputeTax comtax = new ComputeTax(status, taxable);

        System.out.println("Tax is " + comtax.getTax());
    }
}
