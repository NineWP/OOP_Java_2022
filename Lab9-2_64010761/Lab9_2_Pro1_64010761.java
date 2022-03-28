import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
public class Lab9_2_Pro1_64010761 extends Application {
    public void start(Stage primaryStage){
        GridPane grid = new GridPane();

        ImageView image = new ImageView(new Image("pic.jpg"));
        //image.setPreserveRatio(false);
        image.setFitHeight(300);
        image.setFitWidth(500);
        grid.add(image,0,0);

        Scene scene = new Scene(grid,500,300);
        primaryStage.setTitle("Exercise_14_01");
		    primaryStage.setScene(scene);
		    primaryStage.show();
    }
  public static void main(String[] args) {
    launch(args);
  }
}
