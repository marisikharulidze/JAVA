package classwork_10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {
    @FXML
    private Label example;
    @FXML
    private TextField name;
    @FXML
    private TextArea text;

    public void clickButton(ActionEvent event) throws IOException {
        String n = name.getText();
        System.out.println(n);
        example.setText(n);
        Parent parent = FXMLLoader.load(getClass().getResource("view1.fxml"));
        ((Button)event.getSource()).getParent().getScene().setRoot(parent);
        System.out.println(((Button)event.getSource()).getParent().getScene());

//        Stage stage = new Stage();
//        Parent parent = FXMLLoader.load(getClass().getResource("view1.fxml"));
//        Scene scene = new Scene(parent);
//        stage.setScene(scene);
//        stage.setTitle("Java Fx Application!!!");
//        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Object created");
    }
}
