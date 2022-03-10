public class Tax {
    private int filingStatus;

	public static final String STATUS[] = {
		"SINGLE_FILER",
		"MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER)",
		"MARRIED_SEPARATELY",
		"HEAD_OF_HOUSEHOLD"
	};

	private int brackets[][];
	private double rate[];
	private double taxable;

    Tax(){

    }

    Tax(int filingStatus, int [][] brackets, double [] rates, double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rate = rates;
        this.taxable = taxableIncome;
    }

    public void setFilingStatus(int filingStatus){
		this.filingStatus = filingStatus;
	}

	public void setBrackets(int [][] brackets){
		this.brackets = brackets;
	}

	public void setRates(double [] rate){
		this.rate = rate;
	}

	public void setTaxableIncome(int taxable){
		this.taxable = taxable;
	}

    public int getFilingStatus(){
		return filingStatus;
	}

	public int [][] getBrackets(){
		return brackets;
	}

	public double [] getRates(){
		return rate;
	}

	public double getTaxableIncome(){
		return taxable;
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
