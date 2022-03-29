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
        grid.setHgap(5);
        grid.setVgap(5);

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

        Scene scene = new Scene(grid);
        primaryStage.setTitle("Exercise 14.7");
		primaryStage.setScene(scene);
		primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
      }
}
