/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

import java.util.Scanner;

/**
 *
 * @author Camille
 */
public class Menu {
    
    private int choix;
    private ActionsBDDImpl bdd = new ActionsBDDImpl();
    private UtilityMethods util = new UtilityMethods();

    public Menu() {         //Constructeur de base du Menu
        this.choix = 0;
    }

    public int getChoix() {         //M�thode qui permet d'avoir le choix de l'utilisateur
        return choix;
    }

    public void setChoix(int choix) {
        this.choix = choix;
    }
    
    /**
     * Fonction d'affichage du menu
     */
    public void afficherMenu()
    {
        System.out.println("$$$$$$$$$$ MENU $$$$$$$$$$ \n" +
        "1. Afficher tous les programmeurs \n" +
        "2. Afficher un programmeur \n" +
        "3. Supprimer un programmeur \n" +
        "4. Ajouter un programmeur \n" +
        "5. Modifier le salaire \n" +
        "6. Quitter le programme \n" +
        "Quel est votre choix ? :");
    }
    
    /**
     * M�thode qui permet d'obtenir le choix de l'utilisateur
     * @return 
     */
    public int choisir(){  
        
        Scanner sc = new Scanner(System.in);
        String numero;
        int num;
                
        numero = sc.nextLine();     //On r�cup�re la saisie de l'utilisateur 
        num = Integer.parseInt(numero);     //On transforme le string en integer
                
        while(num > 6 || num < 0)       //On v�rifie que la saisie soit entre 1 et 6
        {
            System.out.println("ERREUR ! Veuillez choisir un numero entre 1 et 6 \n"
                            + "");
            afficherMenu();             
            
            numero = sc.nextLine();     //On r�cup�re la saisie de l'utilisateur 
            num = Integer.parseInt(numero);     //On transforme le string en integer
        }
        
        return num;
    }
    
    /**
     * Méthode qui effectue les actions en fonction du choix fait par l'utilisateur
     * @param choix 
     */
    public void action(int choix)
    {
        switch(choix)
        {
            case 1 : util.printProgrammeurArrayList(bdd.BDDQueryAll());  //Fonction qui permet d'afficher la liste de programmeurs
                    break;
            
            case 2 : util.printProgrammeurArrayList(bdd.BDDQueryByID(util.askId())); //Fonction qui va permettre d'afficher un programmeur selont son ID
                    break;
            
            case 3 : bdd.BDDDeleteProgrammeur(util.askId());
                    System.out.println("Le programmeur a ete supprime");
                    break;
                
            case 4 : bdd.BDDAddProgrammeur(util.createProgrammeur());
                    System.out.println("Le programmeur a ete ajoute");
                    break;
                
            case 5 : bdd.BDDModifierChamp("SALAIRE", util.askId(), util.askChamp());
                    System.out.println("Le champ a ete modifie");
                    break;
                
            case 6 : System.exit(0);
                    break;
                
            default : break;
        }
    }
    
    public void boucle()
    {   
        while(true)
        {
            afficherMenu();
            action(choisir());

        }
    }

}
