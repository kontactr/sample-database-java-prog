/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sony
 */
public class Database_1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
         // TODO code application logic here
        System.out.println("hello world");
  //      DriverManager.registerDriver(new com.mysql.jdbc.Driver());
       Class.forName("com.mysql.jdbc.Driver");  
        try ( // oracle.jdbc.OracleDriver dco = new oracle.jdbc.OracleDriver();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","")) {
            Statement stmt=con.createStatement();
            
            ResultSet rs = stmt.executeQuery("select * from hello");
            while(rs.next())
                System.out.println(rs.getInt(1));
//int result=stmt.executeUpdate("update emp765 set name='Vimal',salary=10000 where id=33");
//int result=stmt.executeUpdate("delete from emp765 where id=33");
System.out.println(" records affected");
        }  
    }

    
    
    }
   
