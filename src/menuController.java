import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class menuController implements Initializable {

    private AccManagement accManagement = new AccManagement();
    @FXML
    private TableView<Account> table;

    @FXML
    private TableColumn<Account,Integer> idCol;

    @FXML
    private TableColumn<Account,String> nameCol;

    @FXML
    private TableColumn<Account,Integer> ageCol;

    @FXML
    private TableColumn<Account,String> posCol;

    @FXML
    private TextField idTxt;

    @FXML
    private TextField nameTxt;

    @FXML
    private TextField ageTxt;

    @FXML
    private TextField posTxt;

    @FXML
    private TextField passTxt;

    private ObservableList<Account> accounts;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //khoi tao gia tri cac cot thuoc tinh tuong ung
        accounts = FXCollections.observableArrayList(
                accManagement.accList.accounts
        );
        idCol.setCellValueFactory(new PropertyValueFactory<Account,Integer>("ID"));
        nameCol.setCellValueFactory(new PropertyValueFactory<Account,String>("name"));
        ageCol.setCellValueFactory(new PropertyValueFactory<Account,Integer>("age"));
        posCol.setCellValueFactory(new PropertyValueFactory<Account,String>("position"));
        table.setItems(accounts);
    }

    public void add(ActionEvent event) {
        Account account = new Account();
        account.setID(Integer.parseInt(idTxt.getText()));
        account.setName(nameTxt.getText());
        account.setAge(Integer.parseInt(ageTxt.getText()));
        account.setPosition(posTxt.getText());
        account.setPassword(Integer.parseInt(passTxt.getText()));
        accounts.add(account);
    }

    public void delete(ActionEvent event) {
        Account a = table.getSelectionModel().getSelectedItem();
        accounts.remove(a);
    }

    public void update(ActionEvent event) {
        try {
            FileWriter writer = new FileWriter("acc.txt");
            for (int i = 0; i < accounts.size(); i++) {
                writer.write(accounts.get(i).to_String());
            }
            writer.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
