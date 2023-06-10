package main.java.learn.date.June2023.th9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Test01 {
    public static final String URL = "jdbc:mysql://localhost:3306/c11njxx";
    public static final String USER = "root";
    public static final String PASSWORD = "";
    

    public static void main(String[] args) throws Exception{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL,USER,PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT name from stu");
            while(rs.next()) {
                System.out.println(rs.getString("name"));
            }
        }catch (Exception e ) {
            e.printStackTrace();
        }
        }
}
