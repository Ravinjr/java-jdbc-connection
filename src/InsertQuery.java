package src;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class InsertQuery {
    public void insertStudent(String firstName,String lastName,String district){
        try{
            MyConnection myConnection=new MyConnection();
            Connection conn= myConnection.getConnection();//call getConnection inside MyConnection class
            //getConnection returns Connection,so assign it to conn
//            PreparedStatement preparedStatement =conn.prepareStatement("INSERT INTO devdatabase1.t_student\n" +
//                    "(FIRST_NAME, LAST_NAME, DISTRICT)\n" +
//                    "VALUES('Saman', 'athauda', 'Gampola');");                     //prepare statement and assign it to preparedStatement
          PreparedStatement preparedStatement =conn.prepareStatement("INSERT INTO devdatabase1.t_student\n" +
                    "( FIRST_NAME, LAST_NAME, DISTRICT)\n" +
                    "VALUES(?,?,?);");

          preparedStatement.setString(1,firstName);
          preparedStatement.setString(2,lastName);
          preparedStatement.setString(3,district);
            preparedStatement.executeUpdate();// execute preparedStatement
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
