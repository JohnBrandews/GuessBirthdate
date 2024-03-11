import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class HyperlinkExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX");

        // Create a Hyperlink with the desired text and URL
        Hyperlink link = new Hyperlink("Click me to visit Bing!");
        link.setOnAction(e -> openWebpage("https://www.bing.com/"));

        VBox vbox = new VBox(link);
        Scene scene = new Scene(vbox, 960, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Object openWebpage(String string) {
        throw new UnsupportedOperationException("Unimplemented method 'openWebpage'");
    }
}