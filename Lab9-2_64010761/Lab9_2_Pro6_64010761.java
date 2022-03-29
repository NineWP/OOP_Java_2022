import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
public class Lab9_2_Pro6_64010761 extends Application {
    @Override
	public void start(Stage primaryStage) {
        
		// create button
		Button btPause = new Button("Pause");
		Button btResume = new Button("Resume");
		Button btReverse = new Button("Reverse");

		// create hbox 
		HBox paneForButtons = new HBox(5);
		paneForButtons.setAlignment(Pos.CENTER);
		// add button to hbox
		paneForButtons.getChildren().addAll(btPause, btResume, btReverse);

		// create fanpan
		FanPane2 fan = new FanPane2();

		// create slider
		Slider slider = new Slider();
		slider.setMax(5);
		fan.rateProperty().bind(slider.valueProperty());

		// create a pan
		BorderPane pane = new BorderPane();
		pane.setTop(paneForButtons);
		pane.setCenter(fan);
		pane.setBottom(slider);

		// set action when click button
		btPause.setOnAction(e -> {
			fan.pause();
		});

		btResume.setOnAction(e -> {
			fan.play();
		});

		btReverse.setOnAction(e -> {
			fan.reverse();
		});

		// create scene
		Scene scene = new Scene(pane, 200, 200);
		primaryStage.setTitle("Program 6");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

    public static void main(String[] args) {
        launch(args);
    }
}
