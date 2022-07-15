package quiz_2.task_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.IOException;

public class StringController {
    @FXML
    public TextArea output;
    @FXML
    public TextField sstring;
    @FXML
    public Button button;

    public void clickButton(ActionEvent event) throws IOException {
        String input = sstring.getText();

        input = input.replace(" ","");
        String parsedInteger = "";
        String operator = "";

        int num = 0;
        for (int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                parsedInteger += c;
            }
            if (!Character.isDigit(c) || i == input.length()-1){
                int parsed = Integer.parseInt(parsedInteger);
                if (operator == "") {
                    num = parsed;
                }
                else {
                    if (operator.equals("+"))
                        num += parsed;
                    else if (operator.equals("-"))
                        num -= parsed;
                    else if (operator.equals("*"))
                        num *= parsed;
                    else if (operator.equals("/"))
                        num /= parsed;
                }
                parsedInteger ="";
                operator = ""+c;
            }
        }
        output.setText(String.valueOf(num));
    }
}






