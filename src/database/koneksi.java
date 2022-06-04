/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class koneksi {
    private static java.sql.Connection koneksi;
     
      public static java.sql.Connection getKoneksi(){
        if(koneksi == null){
          try{
              String url = "jdbc:mysql://localhost:3306/warehouseproject";
              String user = "root";
              String password = "";
              
              DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
              
              koneksi = (Connection) DriverManager.getConnection(url, user, password);
           
          }catch(SQLException t){
              System.out.println("Error Membuat Koneksi");
          }  
        }
        return koneksi;
    }
}
