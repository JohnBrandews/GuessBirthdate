
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class PaneExample extends Application{
    @Override
    public void start(Stage primaryStage){
        Pane pane = new Pane();
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        VBox vBox = new VBox(20,btn1,btn2);
        pane.getChildren().addAll(btn1, btn2);
        Scene scene = new Scene(pane, 300,200);
        primaryStage.setTitle("pane example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
