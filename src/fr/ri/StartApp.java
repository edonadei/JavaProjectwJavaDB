/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

import java.sql.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Emrick-PC-Portable
 */
public class StartApp {
    
    public static void main(String[] args) {
        try {
            Connection dbConn = DriverManager.getConnection("jdbc:derby://localhost:1527/DB_PROGRAMMEURS_RI","adminRI","admin");
            Statement stmnt = dbConn.createStatement();
            ResultSet rt = stmnt.executeQuery("SELECT NOM,PRENOM,PSEUDO from PROGRAMMEUR");
            System.out.println(rt.getString("NOM"));
            System.out.println(rt.getString("PRENOM"));
            System.out.println(rt.getString("PSEUDO"));
            
        } catch (SQLException ex) {
            System.out.println("ERREUR SQL");
            Logger.getLogger(StartApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
