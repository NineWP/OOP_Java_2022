import java.io.*;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Lab11_Pro1_64010761 extends Application{
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    private Button btClear = new Button("Clear");

    @Override
    public void start(Stage stage) throws Exception {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
        gridPane.add(tfAnnualInterestRate, 1, 0, 2, 1);
        gridPane.add(new Label("Number of Years:"), 0, 1);
        gridPane.add(tfNumberOfYears, 1, 1, 2, 1);
        gridPane.add(new Label("Loan Amount:"), 0, 2);
        gridPane.add(tfLoanAmount, 1, 2, 2, 1);
        gridPane.add(new Label("Monthly Payment:"), 0, 3);
        gridPane.add(tfMonthlyPayment, 1, 3, 2, 1);
        gridPane.add(new Label("Total Payment:"), 0, 4);
        gridPane.add(tfTotalPayment, 1, 4, 2, 1);
        gridPane.add(new Label(""), 0, 5);

        HBox hbox1 = new HBox(3);
        HBox hbox2 = new HBox(3);
        hbox1.getChildren().addAll(btSave, new Label("  "), btLoad);
        hbox2.getChildren().addAll(btClear, new Label("  "), btCalculate);
        hbox2.setAlignment(Pos.CENTER_RIGHT);
        gridPane.add(hbox2, 1, 6, 2, 1);
        gridPane.add(hbox1, 0, 6);

        gridPane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BASELINE_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(hbox2, HPos.RIGHT);

        btCalculate.setOnAction(e -> calculateLoanPayment());
        btSave.setOnAction(e -> {
            try {
                saveData();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        btLoad.setOnAction(e -> {
            try {
                loadData();
            } catch (ClassNotFoundException | IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
        });

        btClear.setOnAction(e -> clear());

        Scene scene = new Scene(gridPane, 400, 210);
        stage.setTitle("LoanCalculator");
        stage.setScene(scene);
        stage.show();
    }

    private void calculateLoanPayment(){
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(interest, year, loanAmount);
        
        tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
    }

    private void saveData() throws IOException{
        double interest = Double.parseDouble(tfAnnualInterestRate.getText());
        int year = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(interest, year, loanAmount);
        try ( // Create an output stream for the file Exercise17_06.dat
			ObjectOutputStream output = new ObjectOutputStream(new 
				BufferedOutputStream(new FileOutputStream("Lab11_64010761/loan.dat")));
		) {
			// Write five Loan objects to the file
			output.writeObject(loan);
		}
    }

    private void loadData() throws IOException, ClassNotFoundException{
        try ( // Create an input stream for file Exercise17.07.dat
			ObjectInputStream input = new ObjectInputStream(new 
				BufferedInputStream(new FileInputStream("Lab11_64010761/loan.dat")))
		) { // Read Loan objects from file and display the total loan amount
			while (true) {
				Loan loan = (Loan)input.readObject();
				System.out.println(loan);
                System.out.printf("Total monthly payment : $%.2f\n",
                    loan.getMonthlyPayment());
				System.out.printf("Total loan amount: $%.2f\n", 
					loan.getTotalPayment());
				System.out.println();
                tfAnnualInterestRate.setText(String.valueOf(loan.getAnnualInterestRate()));
                tfLoanAmount.setText(String.valueOf(loan.getLoanAmount()));
                tfNumberOfYears.setText(String.valueOf(loan.getNumberOfYears()));
			}
            
		}
		catch (EOFException ex) {
			// Use EOFExecption to end the loop
		}
    }

    private void clear(){
        tfAnnualInterestRate.setText("");
        tfNumberOfYears.setText("");
        tfLoanAmount.setText("");
        tfMonthlyPayment.setText("");
        tfTotalPayment.setText("");
    }

   public static void main(String[] args) {
       launch(args);
   }
}
