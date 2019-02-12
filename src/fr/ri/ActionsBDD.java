/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

/**
 *
 * @author Emrick-PC-Portable
 */
public interface ActionsBDD {

    /**
     * Ajout d'un programmeur dans la base de données
     * @param prog
     */
    void BDDAddProgrammeur(Programmeur prog);

    /**
     * Supprimer un programmeur dans la base de données en le choisissant par ID
     * @param id
     */
    void BDDDeleteProgrammeur(int id);

    /**
     * Modification d'un champ d'un programmeur en base de données en choissant par ID
     * @param champ
     * @param id
     */
    void BDDModifierChamp(String champ, int id);

    /**
     * Generic query to the database, do not return anything, useful for pushing something
     * @param query
     */
    void BDDQuery(String query);

    /**
     * Generic query to the database, will return the programmer from a dataSet
     * @param query
     * @return Programmeur
     */
    Programmeur BDDQueryAndReturnProgrammer(String query);

    /**
     * Query in JDBC with an ID, and return the programmeur
     * @param id
     * @return Programmeur
     */
    Programmeur BDDQueryByID(int id);

    String getBdd_IP();

    String getBdd_id();

    String getBdd_pwd();

    void setBdd_IP(String bdd_IP);

    void setBdd_id(String bdd_id);

    void setBdd_pwd(String bdd_pwd);
    
}
