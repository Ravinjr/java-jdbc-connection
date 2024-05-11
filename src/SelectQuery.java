package src;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectQuery {
    public void selectStudent(){
        try{
            MyConnection myConnection=new MyConnection();
            Connection firstConnection=myConnection.getConnection();

            Statement statement= firstConnection.createStatement();
            ResultSet rs= statement.executeQuery("select * from t_student ts ");

            while(rs.next()){
                System.out.println(rs.getString("FIRST_NAME"));

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
