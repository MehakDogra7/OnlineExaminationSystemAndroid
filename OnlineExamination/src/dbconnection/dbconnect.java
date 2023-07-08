/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class dbconnect {
    
    static Connection con;
    public static Connection getConnection(){
    try
            {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql:///onlineexam","root","root");
            }
    catch(Exception e)
    {
        System.out.println(e);
    }
    return con;
}
}