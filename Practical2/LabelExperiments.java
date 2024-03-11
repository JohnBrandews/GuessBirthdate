import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import java.io.FileInputStream;
public class LabelExperiments extends Application{
    public static void main(String[] args) {
        launch(args);
    }
    public  void  start(Stage primaryStage) throws FileNotFoundException{
        primaryStage.setTitle("experiment");
        FileInputStream input = new FileInputStream("resources/images/iconmmonstr-home.png");
        
        Image image = new Image(input);
        ImageView imageView = new ImageView(image);
        Label label = new Label("my label", imageView);
        Scene scene = new Scene(label,200,100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
