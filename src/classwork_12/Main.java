package classwork_12;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/persons?useUnicode=true&characterEncoding=utf-8";
        try {
            Connection conn = DriverManager.getConnection(url,"root","");
            Statement st = conn.createStatement();
            st.executeUpdate("INSERT INTO person(name) VALUES ('mmari')");

            ResultSet rs = st.executeQuery("SELECT * FROM person");
            while (rs.next()){
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
