/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Emrick-PC-Portable
 */
public class UtilityMethods {
    
    public Programmeur createProgrammeur()
    {
        Programmeur prog = new Programmeur();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("NOM:");
        prog.setNom(sc.nextLine());
        System.out.println("PRENOM:");
        prog.setPrenom(sc.nextLine());
        System.out.println("ADRESSE:");
        prog.setAdresse(sc.nextLine());
        System.out.println("PSEUDO:");
        prog.setPseudo(sc.nextLine());
        System.out.println("RESPONSABLE:");
        prog.setResponsable(sc.nextLine());
        System.out.println("ANNEE DE NAISSANCE:");
        prog.setAnnNaissance(sc.nextLine());
        System.out.println("SALAIRE:");
        prog.setAnnNaissance(sc.nextLine());
        System.out.println("PRIME:");
        prog.setAnnNaissance(sc.nextLine());
        return prog;
    }
    
    /**
     * Utilisation d'une boucle for each pour l'affichage d'une ArrayList de programmeurs
     * @param toPrint 
     */
    public void printProgrammeurArrayList(ArrayList<Programmeur> toPrint)
    {
        if (toPrint.isEmpty())
        {
            System.out.println("Votre recherche n'a trouvé aucun résultat");
        } else {
            for (Programmeur p : toPrint)
            {
                System.out.println(p.toString());
            }
        }
    }
}
