import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.control.TextField;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.geometry.Insets;
public class Lab9_2_Pro2_64010761 extends Application{
    @Override
    public void start(Stage primaryStage){
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20,20,20,20));
        // set horizontol and vertical of space between grid
        grid.setHgap(5);
        grid.setVgap(5);

        // create text field and random number in the grid
        for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				TextField text = new TextField(); 
				text.setPrefColumnCount(1);
				text.setText(String.valueOf((int)(Math.random() * 2)));
				grid.add(text, i, j);
				GridPane.setHalignment(text, HPos.CENTER);
				GridPane.setValignment(text, VPos.CENTER);
			}
		}

        // Create and display the stage
        Scene scene = new Scene(grid);
        primaryStage.setTitle("Program 2");
		primaryStage.setScene(scene);
		primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
      }
}
