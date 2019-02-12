/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        
        try {
            this.dbconn = (Connection) DriverManager.getConnection(bdd_IP,bdd_id,bdd_pwd); 
        this.st = dbconn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(BDDMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BDDMethods() {
        this.bdd_IP = "jdbc:derby://localhost:1527/RI_L3_JAVA";
        this.bdd_id = "adm";
        this.bdd_pwd = "adm";
        
        try {
            this.dbconn = (Connection) DriverManager.getConnection(bdd_IP,bdd_id,bdd_pwd); 
        this.st = dbconn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(BDDMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // Requete par ID
    public Programmeur BDDRequestByID(int id){
        /*
        * Function to query in database by id
        * Template query "SELECT * FROM PROGRAMMEUR where id= $id"
        */
        
        String query = "SELECT * FROM PROGRAMMEUR where id= $" + id;
        Programmeur prog = BDDQuery(query);
        return prog;
    }
    
    public Programmeur BDDQuery(String query)
    {
        /*
        * We use a generic function for create queries to the database, and return the programmeur
        */
        Programmeur prog = new Programmeur();
        try {
        rs = st.executeQuery(query);
            while(rs.next()){
                prog.setNom(rs.getString("NOM"));
                prog.setPrenom(rs.getString("PRENOM"));
                prog.setAdresse(rs.getString("ADRESSE"));
                prog.setAnnNaissance(Integer.parseInt(rs.getString("ANNAISSANCE")));
                prog.setHobby(rs.getString("HOBBY"));
                prog.setPrime(Integer.parseInt(rs.getString("PRIME")));
                prog.setPrime(Integer.parseInt(rs.getString("SALAIRE")));
                prog.setPseudo(rs.getString("PSEUDO"));
                prog.setResponsable(rs.getString("RESPONSABLE"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(BDDMethods.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prog;
    }
    
    // Requete par prenom
    
    // Requete avec plusieurs arguments
    
    
  
    
}
