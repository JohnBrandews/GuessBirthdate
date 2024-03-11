
    import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuBarWithSubmenuExample extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX MenuBar with Submenu Example");

        // Create a menu bar
        MenuBar menuBar = new MenuBar();

        // Create the "File" menu
        Menu fileMenu = new Menu("File");

        // Create menu items
        MenuItem newItem = new MenuItem("New");
        MenuItem openItem = new MenuItem("Open");
        MenuItem saveItem = new MenuItem("Save");

        // Create submenu items
        RadioMenuItem trueItem = new RadioMenuItem("True");
        RadioMenuItem falseItem = new RadioMenuItem("False");
        ToggleGroup radioGroup = new ToggleGroup();
        trueItem.setToggleGroup(radioGroup);
        falseItem.setToggleGroup(radioGroup);

        // Create the "Save As" submenu
        Menu saveAsSubMenu = new Menu("Save As");
        saveAsSubMenu.getItems().addAll(trueItem, falseItem);

        // Add menu items and submenu to the "File" menu
        fileMenu.getItems().addAll(newItem, openItem, saveItem, saveAsSubMenu);

        // Add the "File" menu to the menu bar
        menuBar.getMenus().add(fileMenu);

        // Create a VBox to hold the menu bar
        VBox root = new VBox(menuBar);

        // Create a scene
        Scene scene = new Scene(root, 300, 200);

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}


