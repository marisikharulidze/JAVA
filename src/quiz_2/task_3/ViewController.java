package quiz_2.task_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.sql.*;

public class ViewController {
    @FXML
    public TextArea output;

    public void viewButton(ActionEvent event) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/db?useUnicode=true&characterEncoding=utf-8";
        Connection conn = DriverManager.getConnection(url,"root","");
        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM uni");
        while (rs.next()){
            System.out.println(rs.getString("Id"));
            System.out.println(rs.getString("Name"));
            System.out.println(rs.getString("Location"));
            System.out.println(rs.getString("NumberOfStudents"));
            System.out.println(rs.getString("NumberOfLectors"));
            output.setText(rs.getString("Id")+" "+rs.getString("Name")+" "+rs.getString("Location")+" "+rs.getString("NumberOfStudents"));

        }

    }

}
