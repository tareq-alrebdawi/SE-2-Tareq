
package almdina;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Connect 
{
  public static  Connection connect()
    {
        try {
            Class .forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/almdina","root","");
            Statement stmt = con.createStatement();
        
          
            ///System.out.println("LLLLL");
            
                    JOptionPane.showMessageDialog(null, "connected");

                    return con;
        } catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "cont connected");
        }
        return null;
    } 
   public static void main(String[] args) {
        Connect.connect();
    }

}

