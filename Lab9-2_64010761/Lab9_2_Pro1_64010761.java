import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class Lab9_2_Pro1_64010761 extends Application {
    public void start(Stage primaryStage){
        GridPane pane = new GridPane();
        ImageView image1 = new ImageView(new Image("image/uk.png"));
        ImageView image2 = new ImageView(new Image("image/ca.png"));
        ImageView image3 = new ImageView(new Image("image/canada.png"));
        ImageView image4 = new ImageView(new Image("image/usa.png"));

        image1.setFitHeight(100);
        image1.setFitWidth(200);
        image2.setFitHeight(100);
        image2.setFitWidth(200);
        image3.setFitHeight(100);
        image3.setFitWidth(200);
        image4.setFitHeight(100);
        image4.setFitWidth(200);

        pane.add(image1, 0, 0);
		    pane.add(image2, 1, 0);
		    pane.add(image3, 0, 1);
		    pane.add(image4, 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Program 1");
		    primaryStage.setScene(scene);
		    primaryStage.show();
    }
  public static void main(String[] args) {
    launch(args);
  }
}
