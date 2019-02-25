package fr.ri;

import java.util.ArrayList;

public interface ActionsBDD {

    /**
     * Ajout d'un programmeur dans la base de données
     * @param prog
     */
    void BDDAddProgrammeur(ProgrammeurBean prog);

    /**
     * Supprimer un programmeur dans la base de données en le choisissant par ID
     * @param id
     */
    void BDDDeleteProgrammeur(int id);

    /**
     * Modification d'un champ d'un programmeur en base de données en choissant par ID
     * @param champ
     * @param id
     * @param valeur 
     */
    void BDDModifierChamp(String champ, int id, String valeur);

    /**
     * Generic query to the database, do not return anything, useful for pushing something
     * @param query
     */
    void BDDQuery(String query);

    /**
     * Generic query to the database, will return the programmer from a dataSet
     * @param query
     * @return ProgrammeurBean
     */
    ArrayList<ProgrammeurBean> BDDQueryAndReturnProgrammer(String query);

    /**
     * Query in JDBC with an ID, and return the programmeur
     * @param id
     * @return ProgrammeurBean
     */
    ArrayList<ProgrammeurBean> BDDQueryByID(int id);

    String getBdd_IP();

    String getBdd_id();

    String getBdd_pwd();

    void setBdd_IP(String bdd_IP);
    
    void setBdd_id(String bdd_id);

    void setBdd_pwd(String bdd_pwd);
    
}
