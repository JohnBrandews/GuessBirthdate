
    import javafx.application.Application;
    import javafx.scene.Scene;
    import javafx.scene.control.Menu;
    import javafx.scene.control.MenuBar;
    import javafx.scene.control.MenuItem;
    import javafx.scene.layout.VBox;
    import javafx.stage.Stage;
    
    public class MenuBarExample extends Application {
        public static void main(String[] args) {
            launch(args);
        }
    
        @Override
        public void start(Stage primaryStage) {
            primaryStage.setTitle("JavaFX MenuBar Example");
    
            // Create a menu bar
            MenuBar menuBar = new MenuBar();
    
            // Create a menu
            Menu fileMenu = new Menu("File");
    
            // Create menu items
            MenuItem newItem = new MenuItem("New");
            MenuItem openItem = new MenuItem("Open");
            MenuItem saveItem = new MenuItem("Save");
    
            // Add menu items to the menu
            fileMenu.getItems().addAll(newItem, openItem, saveItem);
    
            // Add the menu to the menu bar
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
    
    

