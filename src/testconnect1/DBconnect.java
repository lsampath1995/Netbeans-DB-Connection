
/*Source codes of DBconnect.java*/

package testconnect1;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

public class DBconnect {
    
     public static Connection connect() throws ClassNotFoundException{ 

    Connection con =null; 
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

    String connectionURL="jdbc:sqlserver://localhost:1433;databaseName=DDR;user=sa;password=1102"; 

    try{

    con=DriverManager.getConnection(connectionURL);
    System.out.println("Connection is successfull");

    }

    catch(SQLException e){

     System.out.println(e);

    }
        return con;
    }
    
}







