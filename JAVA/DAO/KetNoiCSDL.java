/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DOAN.JAVA.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TPC
 */
public class KetNoiCSDL {
        public static Connection openConnection() throws Exception{
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    System.out.println("load...");
    
    String url ="jdbc:sqlserver://localhost:1433;databaseName=QLBANTRANGSUC;encrypt=false";
    String user="sa";
    String pass="123";
    
    Connection con = DriverManager.getConnection(url, user, pass);
    System.out.println("Connection...");              
    return con;      
    } 
}
