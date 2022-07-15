package finall.task_4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.*;
import java.time.format.DateTimeFormatter;

public class FxController {
    @FXML
    public TextField nameTextarea;
    @FXML
    public TextField costTextarea;
    @FXML
    public TextField authorTextarea;
    @FXML
    public DatePicker datePicker;

    public void buttonClick(ActionEvent actionEvent) {
        String name = nameTextarea.getText();
        String author = authorTextarea.getText();
        String date = String.valueOf(datePicker.getValue());
        String cost = costTextarea.getText();

        String url = "jdbc:mysql://localhost:3306/store?useUnicode=true&characterEncoding=utf-8";
        try {
            Connection conn = DriverManager.getConnection(url,"root","");

            String sql = " INSERT INTO book(Name,author,date,cost)" + " values (?, ?, ?, ?)";
            PreparedStatement prepSt = conn.prepareStatement(sql);
            prepSt.setString (1, name);
            prepSt.setString (2, author);
            prepSt.setDate   (3, Date.valueOf(date));
            prepSt.setInt(4, Integer.parseInt(cost));
            prepSt.execute();
            conn.close();
            System.out.println("Inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
