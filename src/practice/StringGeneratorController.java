package practice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

public class StringGeneratorController implements Initializable {
    @FXML
    public TextField chars;
    @FXML
    public TextField words;
    @FXML
    public TextField charNum;
    @FXML
    public TextArea output;
    @FXML
    public Button button;

    public void clickButton(ActionEvent event) throws IOException {

        String alphabet = chars.getText();
        int wordsNum = Integer.parseInt(words.getText());
        int charsNum = Integer.parseInt(charNum.getText());
        String result = "";

        for(int i=0; i<wordsNum; i++){
            for(int j=0; j<charsNum; j++){
                int rand = ThreadLocalRandom.current().nextInt(0,charsNum+1);
                result += String.valueOf(alphabet.charAt(rand));
            }
            result += " ";
        }
        output.setText(result);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}







