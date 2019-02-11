/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.derby.client.am.Connection;

/**
 *
 * @author jeromecoffin
 */
public class BDDMethods {
    
    private String bdd_IP;
    private String bdd_id;
    private String bdd_pwd;
    private Connection dbconn;
    private Statement st;
    private ResultSet rs;

    public String getBdd_IP() {
        return bdd_IP;
    }

    public void setBdd_IP(String bdd_IP) {
        this.bdd_IP = bdd_IP;
    }

    public String getBdd_id() {
        return bdd_id;
    }

    public void setBdd_id(String bdd_id) {
        this.bdd_id = bdd_id;
    }

    public String getBdd_pwd() {
        return bdd_pwd;
    }

    public void setBdd_pwd(String bdd_pwd) {
        this.bdd_pwd = bdd_pwd;
    }

    public BDDMethods(String bdd_IP, String bdd_id, String bdd_pwd) {
        this.bdd_IP = bdd_IP;
        this.bdd_id = bdd_id;
        this.bdd_pwd = bdd_pwd;
        
        java.sql.Connection dbConn = DriverManager.getConnection(bdd_IP,bdd_id,bdd_pwd);
        Statement stmnt = dbConn.createStatement();
    }

    public BDDMethods() {
        this.bdd_IP = "jdbc:derby://localhost:1527/RI_L3_JAVA";
        this.bdd_id = "adm";
        this.bdd_pwd = "adm";
        
        java.sql.Connection dbConn = DriverManager.getConnection(bdd_IP,bdd_id,bdd_pwd);
        Statement stmnt = dbConn.createStatement();
    }
    
    // Requete par ID
    public BDDRequestByID(Statement stmnt, int id){
        rs = stmnt.executeQuery("SELECT * FROM PROGRAMMEUR where id= $id");
        
        while(rs.next()){
            Programmeur prog = new Programmeur();
            prog.setNom(rs.getString("NOM"));
            prog.setPrenom(rs.getString("PRENOM"));
                
            System.out.println(prog.getNom());
            System.out.println(prog.getPrenom());
            
            
        }
    }
    
    // Requete par prenom
    
    // Requete avec plusieurs arguments
    
    
  
    
}
