import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    private TextField Id;
    @FXML
    private TextField Password;
    AccManagement accManagement = new AccManagement();

    public void Login (ActionEvent event){
        int id = Integer.parseInt(Id.getText());
        int password = Integer.parseInt(Password.getText());
        if (accManagement.searchPass(id) != password) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Sai ID hoac mat khau");
            alert.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Congrat");
            alert.show();
        }
    }
}
