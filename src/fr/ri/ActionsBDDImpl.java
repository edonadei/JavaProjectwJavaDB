package fr.ri;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.client.am.Connection;

public class ActionsBDDImpl implements ActionsBDD{
    
    private String bdd_IP;
    private String bdd_id;
    private String bdd_pwd;
    private Connection dbconn;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;

    @Override
    public String getBdd_IP() {
        return bdd_IP;
    }

    @Override
    public void setBdd_IP(String bdd_IP) {
        this.bdd_IP = bdd_IP;
    }

    @Override
    public String getBdd_id() {
        return bdd_id;
    }

    @Override
    public void setBdd_id(String bdd_id) {
        this.bdd_id = bdd_id;
    }

    @Override
    public String getBdd_pwd() {
        return bdd_pwd;
    }

    @Override
    public void setBdd_pwd(String bdd_pwd) {
        this.bdd_pwd = bdd_pwd;
    }

    /**
     * Specific constructor to connect to a specific database
     * @param bdd_IP
     * @param bdd_id
     * @param bdd_pwd 
     */
    public ActionsBDDImpl(String bdd_IP, String bdd_id, String bdd_pwd) {
        this.bdd_IP = bdd_IP;
        this.bdd_id = bdd_id;
        this.bdd_pwd = bdd_pwd;
        
        try {
            this.dbconn = (Connection) DriverManager.getConnection(bdd_IP,bdd_id,bdd_pwd); 
            this.st = dbconn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ActionsBDDImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Constructeur par défaut, avec l'IP locale de JDBC
     */
    public ActionsBDDImpl() {
        this.bdd_IP = "jdbc:derby://localhost:1527/RI_L3_JAVA";
        this.bdd_id = "adm";
        this.bdd_pwd = "adm";
        
        try {
            this.dbconn = (Connection) DriverManager.getConnection(bdd_IP,bdd_id,bdd_pwd); 
        this.st = dbconn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(ActionsBDDImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Query in JDBC with an ID, and return the programmeur
     * @param id
     * @return Programmeur
     */
    
    /**
     * Generic query to the database, do not return anything, useful for pushing something
     * @param query 
     */
    @Override
    public void BDDQuery(String query)
    {
        try {
        rs = st.executeQuery(query);
        } catch (SQLException ex) {
            Logger.getLogger(ActionsBDDImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Generic query to the database, will return the programmer from a dataSet
     * @param query
     * @return ProgrammeurBean
     */
    @Override
    public ArrayList<ProgrammeurBean> BDDQueryAndReturnProgrammer(String query)
    {
        ArrayList<ProgrammeurBean> listOfProgrammeurs = new ArrayList<>();
        try {
        rs = st.executeQuery(query);
            while(rs.next()){
                ProgrammeurBean prog = new ProgrammeurBean();
                prog.setNom(rs.getString("NOM"));
                prog.setPrenom(rs.getString("PRENOM"));
                prog.setAdresse(rs.getString("ADRESSE"));
                prog.setAnnNaissance(Integer.parseInt(rs.getString("ANNAISSANCE")));
                prog.setHobby(rs.getString("HOBBY"));
                prog.setPrime(Float.parseFloat(rs.getString("PRIME")));
                prog.setSalaire(Float.parseFloat(rs.getString("SALAIRE")));
                prog.setPseudo(rs.getString("PSEUDO"));
                prog.setResponsable(rs.getString("RESPONSABLE"));
                listOfProgrammeurs.add(prog);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ActionsBDDImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listOfProgrammeurs;
    }
    
        @Override
    public ArrayList<ProgrammeurBean> BDDQueryByID(int id){
        /*
        * Function to query in database by id
        * Template query "SELECT * FROM PROGRAMMEUR where id= $id"
        */
        
        String query = "SELECT * FROM PROGRAMMEUR where ID = " + id;
        ArrayList<ProgrammeurBean> listOfProgrammeurs = BDDQueryAndReturnProgrammer(query);
        return listOfProgrammeurs;
    }
    
    @Override
    public ArrayList<ProgrammeurBean> BDDQueryAll(){
        /*
        * Function to query in database by id
        * Template query "SELECT * FROM PROGRAMMEUR where id= $id"
        */
        
        String query = "SELECT * FROM PROGRAMMEUR";
        ArrayList<ProgrammeurBean> listOfProgrammeurs = BDDQueryAndReturnProgrammer(query);
        return listOfProgrammeurs;
    }
    
    /**
     * Ajout d'un programmeur dans la base de données
     * @param prog 
     */
    @Override
    public void BDDAddProgrammeur(ProgrammeurBean prog)
    {
        /*
        * TEMPLATE
        * INSERT INTO PROGRAMMEUR(NOM,PRENOM,ADRESSE,PSEUDO,RESPONSABLE,HOBBY,ANNAISSANCE,SALAIRE,PRIME) VALUES
        * ('Torvalds','Linus','2 avenue Linux Git','linuxroot','Didier Achvar','Salsa','1969','2170','50')
        */
        
        String query = "INSERT INTO PROGRAMMEUR(NOM,PRENOM,ADRESSE,PSEUDO,RESPONSABLE,HOBBY,ANNAISSANCE,SALAIRE,PRIME)" + 
                " VALUES(?,?,?,?,?,?,?,?,?)";
        try {
            pst = dbconn.prepareStatement(query);
            pst.setObject(1, prog.getPrenom(),Types.VARCHAR);
            pst.setObject(2, prog.getNom(),Types.VARCHAR);
            pst.setObject(3, prog.getAdresse(),Types.VARCHAR);
            pst.setObject(4, prog.getPseudo(),Types.VARCHAR);
            pst.setObject(5, prog.getResponsable(),Types.VARCHAR);
            pst.setObject(6, prog.getHobby(), Types.VARCHAR);
            pst.setObject(7, prog.getAnnNaissance(), Types.INTEGER);
            pst.setObject(8, prog.getSalaire(),Types.FLOAT);
            pst.setObject(9, prog.getPrime(),Types.FLOAT);
            pst.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(ActionsBDDImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Modification du salaire d'un programmeur en base de données en choissant par ID
     * @param id 
     * @param valeur 
     */
    @Override
    public void BDDModifierSalaire(int id, Float valeur)
    {
        /*
        Template: UPDATE PROGRAMMEUR SET PRIME = '11' WHERE id =2 ;
        */
        
        String query = "UPDATE PROGRAMMEUR SET SALAIRE = ? WHERE id = ?";
        try {
            pst = dbconn.prepareStatement(query);
            pst.setObject(1,valeur,Types.FLOAT);
            pst.setObject(2,id,Types.INTEGER);
            pst.executeUpdate(); 
        } catch (SQLException ex) {
            Logger.getLogger(ActionsBDDImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Supprimer un programmeur dans la base de données en le choisissant par ID
     * @param id 
     */
    @Override
    public void BDDDeleteProgrammeur(int id)
    {
        /*
        Template: DELETE FROM `utilisateur`
        *         WHERE `id` = 1
        */
        
        String query = "DELETE FROM PROGRAMMEUR " + 
                "WHERE id = ?";
        try {
            pst = dbconn.prepareStatement(query);
            pst.setObject(1,id,Types.INTEGER);
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ActionsBDDImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
}
