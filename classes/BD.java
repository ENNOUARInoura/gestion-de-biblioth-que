/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package classes;

/**
 *
 * @author Mypc
 */
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BD {
    private static final String servername="localhost";
    private static final String username="root";
    private static final String dbname="gestion_biblio";
    private static final Integer port=3306;
    private static final String password="";
    public static Connection connect()
    {
        Connection con=null;
        MysqlDataSource datasrc=new MysqlDataSource();
        datasrc.setServerName(servername);
        datasrc.setUser(username);
        datasrc.setDatabaseName(dbname);
        datasrc.setPortNumber(port);
        datasrc.setPassword(password);
        try {
            con =datasrc.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    //Test the connection
    /*public static void main(String[] args){
        Connection con=BD.connect();
        if (con != null){
            System.out.println("Connected succesfuly");
        }else{
            System.out.println(" not connected");

        }
    }*/
    
}
