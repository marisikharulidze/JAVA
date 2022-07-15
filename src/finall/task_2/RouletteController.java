package finall.task_2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import java.util.concurrent.ThreadLocalRandom;

//import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Node;

public class RouletteController {
    @FXML
    public TextArea textareaTxt;
    @FXML
    public TextField moneyTxt;
    @FXML
    public GridPane gridPane;

    public static int money = 100;

    public void buttonSpin(ActionEvent actionEvent) {
        int[][] arr = new int[5][4];
        int sum = 0;

        for(int i=0; i<5; i++){
            for(int j=0; j<4; j++){
                int rand = ThreadLocalRandom.current().nextInt(0, 9);
                arr[i][j] = rand;
                sum += rand;
//                gridPane.add(arr[i][j], i, j);
//                Object child = arr[i][j];
//                gridPane.add(Node child,i,j );
                textareaTxt.setText(String.valueOf(arr[i][j]));
                textareaTxt.setText("\t");
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
//            textareaTxt.setText("\t");
            System.out.println();
        }

        if(sum>100){
            money += 5;
        }
        else money -= 10;
        moneyTxt.setText(String.valueOf(money));
        System.out.println("----Money Left----"+money);
        System.out.println("====Sum===="+sum);

    }
}
