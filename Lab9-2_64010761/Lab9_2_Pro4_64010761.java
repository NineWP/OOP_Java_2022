import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCode;
public class Lab9_2_Pro4_64010761 extends Application{
    @Override
	public void start(Stage primaryStage) {
		// create a new car with CarPane class 
		CarPane pane = new CarPane();

		pane.setOnMousePressed(e -> pane.pause());
		pane.setOnMouseReleased(e -> pane.play());

		pane.setOnKeyPressed(e -> { // set up the keypressed to control speed of car
			if (e.getCode() == KeyCode.UP) { 
				pane.increaseSpeed();
			}
			else if (e.getCode() == KeyCode.DOWN) {
				pane.decreaseSpeed();
			}
		});

		// create scene
		Scene scene = new Scene(pane, 600, 100);
		primaryStage.setTitle("Program 4");
		primaryStage.setScene(scene);
		primaryStage.show();

		pane.requestFocus();
	}

    public static void main(String[] args) {
        launch(args);
    }
}
