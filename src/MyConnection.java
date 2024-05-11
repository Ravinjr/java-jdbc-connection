package src;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
    public Connection getConnection(){
        try {
            String url="jdbc:mysql://localhost/devdatabase1";
            String userName="root";
            String password="";
            String driver="com.mysql.cj.jdbc.Driver";

            Class.forName(driver);

            Connection conn= DriverManager.getConnection(url,userName,password);

            return conn;

        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
