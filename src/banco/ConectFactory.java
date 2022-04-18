/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author edema
 */
public class ConectFactory {
     public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://localhost", "root", "");
           
        } catch (Exception e) {
            System.out.println("Erro no banco! \n" + e);
        }
        finally{
            return conn;
        }   
    }  
    
}
