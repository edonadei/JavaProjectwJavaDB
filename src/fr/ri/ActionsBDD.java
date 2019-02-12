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
    // Ajout d'un programmeur dans la BDD
    // Modifier le salaire d'un programmeur
    // Supprimer un programmeur

    /**
     * Query in JDBC with an ID, and return the programmeur
     * @param id
     * @return Programmeur
     */
    Programmeur BDDRequestByID(int id);

    String getBdd_IP();

    String getBdd_id();

    String getBdd_pwd();

    void setBdd_IP(String bdd_IP);

    void setBdd_id(String bdd_id);

    void setBdd_pwd(String bdd_pwd);
    
}
