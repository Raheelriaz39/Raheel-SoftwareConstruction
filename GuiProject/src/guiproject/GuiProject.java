 
package guiproject;


import javax.swing.JFrame;
import java.sql.*;
public class GuiProject extends JFrame {
    
    public static void main(String[] args) {
        try
        {
        //Class.forName("con.mysql.jdbc.Driver");
        
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood donation system","root","");
        Statement s=conn.createStatement();
        //ResultSet rs=s.executeQuery("select * from donor ");
        /*while(rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getInt(2)+" "+rs.getString(3)+" "+rs.getString(4));
        }
         conn.close();
        */ 
        System.out.println("connected");
        conn.close();
        }
        catch(Exception e)
        {
        System.out.println(e);
        }
        LoginP lgn;
        lgn = new LoginP();
        lgn.setVisible(true);
        lgn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           
    }
      
}
