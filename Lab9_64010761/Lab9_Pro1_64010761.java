import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;

public class Lab9_Pro1_64010761 extends Application {
	private TextField loanAmount = new TextField();
	private TextField numberOfYears = new TextField();
	private TextArea textArea = new TextArea();

	@Override
	public void start(Stage primaryStage) {
		numberOfYears.setPrefColumnCount(5);
		loanAmount.setPrefColumnCount(5);
		textArea.setPrefColumnCount(40);

		Button showTable = new Button("Show Table");

		HBox paneForControls = new HBox(10);
		paneForControls.setAlignment(Pos.CENTER);
		paneForControls.getChildren().addAll(new Label("Loan Amount"), loanAmount,
			new Label("Number of Years"), numberOfYears, showTable);

		BorderPane pane = new BorderPane();
		pane.setTop(paneForControls);
		pane.setCenter(textArea);

		showTable.setOnAction(e -> {
			print();
		});

		Scene scene = new Scene(pane);
		primaryStage.setTitle("loan GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void print() {

		String output = "";
		double monthlyInterestRate;
		double monthlyPayment;

		if(Double.parseDouble(loanAmount.getText()) <= 0 || Double.parseDouble(numberOfYears.getText()) <= 0){
			output = "ERROR The value must be positive value";
		}
		else{
			output += "Interest Rate       Monthly Payment          Total Payment\n";
		
			for (double i = 5.0; i <= 8; i += 0.125) {
				monthlyInterestRate = i / 1200;
				monthlyPayment = Double.parseDouble(loanAmount.getText()) * 
					monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,
					Double.parseDouble(numberOfYears.getText()) * 12));

				output += String.format("%-24.3f%-34.2f%-8.2f\n", i, 
					monthlyPayment, (monthlyPayment * 12) * 
					Double.parseDouble(numberOfYears.getText()));
			}
		}
		
		textArea.setText(output);
	}

	public static void main(String[] args) {
		launch(args);
	}
}