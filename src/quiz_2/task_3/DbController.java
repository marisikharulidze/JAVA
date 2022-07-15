package quiz_2.task_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class DbController {
    @FXML
    public TextField nameTextarea;
    @FXML
    public TextField lectorNumTextarea;
    @FXML
    public TextField studentNumTextarea;
    @FXML
    public TextField locationTextarea;

    public void buttonClick(ActionEvent event){
        String name = nameTextarea.getText();
        String location = locationTextarea.getText();
        String studentNum = studentNumTextarea.getText();
        String lectorNum = lectorNumTextarea.getText();

        String url = "jdbc:mysql://localhost:3306/db?useUnicode=true&characterEncoding=utf-8";
        try {
            Connection conn = DriverManager.getConnection(url,"root","");

            String sql = " INSERT INTO uni(Name,Location,NumberOfStudents,NumberOfLectors)" + " values (?, ?, ?, ?)";
            PreparedStatement prepSt = conn.prepareStatement(sql);
            prepSt.setString (1, name);
            prepSt.setString (2, location);
            prepSt.setInt   (3, Integer.parseInt(studentNum));
            prepSt.setInt(4, Integer.parseInt(lectorNum));
            prepSt.execute();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void delClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent parent = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
    public void viewClick(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent parent = FXMLLoader.load(getClass().getResource("view.fxml"));
        Scene scene = new Scene(parent);
        stage.setScene(scene);
        stage.show();
    }
}



