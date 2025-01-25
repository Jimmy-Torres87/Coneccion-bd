/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectionsiape;

/**
 *
 * @author Jimmyto
 */

import java.sql.*;
public class dbConnection {
    static String url="jdbc:mysql://localhost:/bbddsiape";
    static String user = "root";
    static String pass = "";
    
    public static Connection conectar(){
        Connection con=null;
        try
        {
           con=DriverManager.getConnection(url,user,pass);
           System.out.println("Conexion exitosa");
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        return con;
    }
            
    
}
