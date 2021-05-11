import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.imageio.IIOException;
import java.io.IOException;


public class Controller {
    @FXML
    private TextField Id;
    @FXML
    private TextField Password;
    AccManagement accManagement = new AccManagement();

    /*
    //change Scene
    public void changeSceneMenu(ActionEvent event) throws IIOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("menu.fxml"));
        Parent parent = loader.load();
        Scene scene = new Scene(parent);
        stage.setScene(scene);
    }
    */
    //login
    public void Login (ActionEvent event){
        int id = 0;
        int password = 0;
        try {
            id = Integer.parseInt(Id.getText());
            password = Integer.parseInt(Password.getText());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (accManagement.searchPass(id) != password) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Sai ID hoac mat khau");
            alert.show();
        }
        else {
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("menu.fxml"));
            Parent parent = null;
            try {
                parent = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scene scene = new Scene(parent);
            stage.setScene(scene);

        }
    }
}
