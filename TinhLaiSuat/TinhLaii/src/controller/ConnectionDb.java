/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tranq
 */
public class ConnectionDb {
    String URL;
    String USER;
    String PASSWORD;
    Connection conn = null;
   
    public Connection connectDb() {
        try {
            URL = "jdbc:mysql://localhost:3306/qlstk_test?autoReconnect=true&useSSL=false";
            USER = "root";
            PASSWORD = "130198";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    
    public void closeConnect(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionDb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
