import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)  {
        try {
            Parent root = FXMLLoader.load(this.getClass().getResource("sample.fxml"));
            primaryStage.setTitle("Demo SE Team 14");
            Scene scene = new Scene(root, 500, 500);
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
