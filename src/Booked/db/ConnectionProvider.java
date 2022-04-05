/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Booked.db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class ConnectionProvider {
    public static Connection getCon()
    {try
     {
       Class.forName("com.mysql.cj.jdbc.Driver"); 
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms?useSSL=true","root","system");
       //JOptionPane.showMessageDialog(null,"Connection Opened Successfully ");
       return conn;
     }
    catch(Exception ex)
    {
        System.out.println(ex);
        return null;
    }
    }
}
