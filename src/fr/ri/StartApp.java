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
public class StartApp {
    
    public static void main(String[] args) {
        Fenetre sw = new Fenetre();
        ActionsBDDImpl bdd = new ActionsBDDImpl();
        UtilityMethods util = new UtilityMethods();
        Fenetre wd = new Fenetre();
        util.printProgrammeurArrayList(bdd.BDDQueryAll());
        //bdd.BDDDeleteProgrammeur(14);
    }
    
}
