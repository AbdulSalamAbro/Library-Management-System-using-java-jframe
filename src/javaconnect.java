/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ABRO
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    
    Connection conn;
    
    public static Connection ConnectDB(){
        try{
          //  Class.forName("jdbc:derby://localhost:1527/libraryManagement [salam on SALAM]");
            //Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","12345");
            Connection conn=DriverManager.getConnection("jdbc:derby://localhost:1527/libraryManagement","salam","iba123");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
