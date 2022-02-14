public class ComputeTax {
    private int filingStatus;
    private double taxable;
    
    private double [] rate = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

    private int [][] brackets = {
        {8350, 33950, 82250, 171550, 372950},  // Single filer
        {16700, 67900, 137050, 20885, 372950}, // Married jointly
        {8350, 33950, 68525, 104425, 186475},  // Married separately
        {11950, 45500, 117450, 190200, 372950} // Head of household
    };

    ComputeTax(int filingStatus, double taxable){
        this.filingStatus = filingStatus;
        this.taxable = taxable;
    }

    public double getTax(){
        double pre_backet = 0;
        double tax = 0;
        for(int i = 0 ; i < 6 ; i++){
            if(taxable > brackets[filingStatus][4] && i == 5){
                tax += (taxable - pre_backet) * rate[i];
            }
            else if(taxable > brackets[filingStatus][i]){
                tax += (brackets[filingStatus][i] - pre_backet) * rate[i];
                pre_backet = brackets[filingStatus][i];
            }      
            else if(taxable < brackets[filingStatus][i]){
                tax += (taxable - pre_backet) * rate[i];
                break;
            } 
        }
        return tax;
    }   
}
