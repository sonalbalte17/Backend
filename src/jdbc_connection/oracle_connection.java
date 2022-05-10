package jdbc_connection;

import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;

public
class oracle_connection {
    public static
    void main (String[] args) throws Exception
            {
        Connection con=null;
        Statement stmt=null;
        ResultSet rs=null;
        try {
//step1 load the driver class
            Class.forName ("oracle.jdbc.driver.OracleDriver");
            System.out.println ("Driver loaded.");

//step2 create  the connection object
             con = DriverManager.getConnection (
                    "jdbc:oracle:thin:@localhost:1521:xe", "system", "sonal");
            System.out.println ("Connection established.");


//step3 create the statement object
            stmt = con.createStatement ();
            System.out.println ("Statement object loaded.");

//step4 execute query
            rs = stmt.executeQuery ("select * from emp");
            {
                while (rs.next ())
                    System.out.println (rs.getInt (1) + "  " + rs.getString (2) + "  " + rs.getString (3));
            }
        }
//step5 close the connection object

        catch(Exception e)
        {
            System.out.println ("Driver not loaded.");
        }
        finally {
            con.close();
            stmt.close();
            rs.close();
            System.out.println ("Connection closed.");

        }
    }
}

