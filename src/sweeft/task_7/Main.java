package sweeft.task_7;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/uni?useUnicode=true&characterEncoding=utf-8";

        try{
            Connection conn = DriverManager.getConnection(url,"root","");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM teacher");
            while (rs.next()){
//              String name = rs.getString("name");
                System.out.println(rs.getString("name"));
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
