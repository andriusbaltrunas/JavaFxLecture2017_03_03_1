package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField userName;

    @FXML
    private TextField surname;

    @FXML
    private Label response;

    public void submitAccount(ActionEvent event){
        //response.setText("Hi " + userName.getText() + " "+ surname.getText());
        String message = "Hi " + userName.getText() + " "+ surname.getText();
        Alert.AlertType alert = Alert.AlertType.INFORMATION;

        if (userName.getLength() < 5 || surname.getLength() < 5){
            message = "Please insert correct credentials";
            alert = Alert.AlertType.WARNING;
        }
        createAlert(alert, message);
    }

    private void createAlert(Alert.AlertType type, String message){
        Alert alert = new Alert(type);
        alert.setContentText(message);
        alert.show();
    }
}
