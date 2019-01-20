package day4.testFXML;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

public class MainController {
    @FXML
    public CheckBox checkboxId;

    public void doIt(ActionEvent actionEvent) {

        System.out.println("MainController.doIt");
        checkboxId.setText("Changed text");
    }
}
