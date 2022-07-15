package homework_10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FxController implements Initializable {
    @FXML
    public TextField name;
    @FXML
    public Label example;

    public void clickButton(ActionEvent event) throws IOException {
        String n = name.getText();
        System.out.println(n);
        example.setText(n);

//        Parent parent = FXMLLoader.load(getClass().getResource("fx1.fxml"));
//        ((Button)event.getSource()).getParent().getScene().setRoot(parent);
//        System.out.println(((Button)event.getSource()).getParent().getScene());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        System.out.println("Object created");
    }
}
