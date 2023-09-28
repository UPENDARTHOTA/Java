 
package library.management.system;

import java.sql.*;
public class Jdbc {
 java.sql.Connection  C;
    Statement s;
    
    public Jdbc(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            C=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
          
            s=C.createStatement();
            
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }
        
    

        
        //
        
        //
        
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

