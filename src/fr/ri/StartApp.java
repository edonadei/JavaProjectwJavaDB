/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emrick-PC-Portable
 */
public class StartApp {
    
    public static void main(String[] args) {
        try {
            Connection dbConn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB_PROGRAMMEURS_RI");
        } catch (SQLException ex) {
            Logger.getLogger(StartApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
