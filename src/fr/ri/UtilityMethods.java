/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

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
        prog.setAnnNaissance(Integer.parseInt(sc.nextLine()));
        System.out.println("SALAIRE:");
        prog.setAnnNaissance(Integer.parseInt(sc.nextLine()));
        System.out.println("PRIME:");
        prog.setAnnNaissance(Integer.parseInt(sc.nextLine()));
        return prog;
    }
    
}
