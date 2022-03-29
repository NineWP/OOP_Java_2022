import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
public class Lab9_2_Pro3_64010761 extends Application{
    @Override
	public void start(Stage primaryStage) {
		// create clock with random and create label
		ClockPane clock = new ClockPane((int)(Math.random() * 12), ((int)(Math.random() * 2) == 1 ? 30 : 0), 0);
		String timeString = clock.getHour() + ":" + clock.getMinute()+ ":" + clock.getSecond();
		clock.setSecondHandVisible(false); // Hide the secondHand of clock
		Label time = new Label(timeString);

		// place a clock and label in border pan
		BorderPane pane = new BorderPane();
		pane.setCenter(clock); // set position to center
		pane.setBottom(time); // set time at the bottom of the pan
		BorderPane.setAlignment(time, Pos.TOP_CENTER);

		// out put
		Scene scene = new Scene(pane, 250, 250); 
		primaryStage.setTitle("Program 3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

    public static void main(String[] args) {
        launch(args);
    }
}
