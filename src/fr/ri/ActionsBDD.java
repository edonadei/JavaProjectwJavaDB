/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

import java.util.ArrayList;

/**
 *
 * @author Emrick-PC
 */
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
     * Query in JDBC with an ID, and return the programmeur
     * @param id
     * @return Programmeur
     */
    /**
     * Generic query to the database, do not return anything, useful for pushing something
     * @param query
     */
    void BDDQuery(String query);

    ArrayList<ProgrammeurBean> BDDQueryAll();

    /**
     * Generic query to the database, will return the programmer from a dataSet
     * @param query
     * @return ProgrammeurBean
     */
    ArrayList<ProgrammeurBean> BDDQueryAndReturnProgrammer(String query);

    ArrayList<ProgrammeurBean> BDDQueryByID(int id);

    void BDDQueryUpdate(String query);

    String getBdd_IP();

    String getBdd_id();

    String getBdd_pwd();

    void setBdd_IP(String bdd_IP);

    void setBdd_id(String bdd_id);

    void setBdd_pwd(String bdd_pwd);
    
}
