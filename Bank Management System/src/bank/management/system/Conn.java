
package bank.management.system;
import java.sql.*;
 
public class Conn {
    Connection  C;
    Statement s;
    
    public Conn(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            C=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","");
          
            s=C.createStatement();
            
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
    

        
        //
        
        //
        
    }}

