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
        ActionsBDDImpl bdd = new ActionsBDDImpl();
        UtilityMethods util = new UtilityMethods();
        util.printProgrammeurArrayList(bdd.BDDQueryAll());
        //bdd.BDDDeleteProgrammeur(14);
    }
    
}
