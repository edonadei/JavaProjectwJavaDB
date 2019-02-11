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
    
    public int choix;

    public Menu() {         //Constructeur de base du Menu
        this.choix = 0;
    }

    public int getChoix() {         //Méthode qui permet d'avoir le choix de l'utilisateur
        return choix;
    }

    public void setChoix(int choix) {
        this.choix = choix;
    }
    
    public void afficherMenu()
    {
        System.out.println("$$$$$$$$$$ MENU $$$$$$$$$$ \n" +
        "1. Afficher tous les programmeurs \n" +
        "2. Afficher un programmeur \n" +
        "3. Supprimer une programmeur \n" +
        "4. Ajouter un programmeur \n" +
        "5. Modifier le salaire \n" +
        "6. Quitter le programme \n" +
        "Quel est votre choix ? :");
    }
    
    public int choisir(){           //Méthode qui permet d'obtenir le choix de l'utilisateur
        
        Scanner sc = new Scanner(System.in);
        String numero;
        int num;
        
        afficherMenu();
                
        numero = sc.nextLine();     //On récupère la saisie de l'utilisateur 
        num = Integer.parseInt(numero);     //On transforme le string en integer
                
        while(num > 6 || num < 0)       //On vérifie que la saisie soit entre 1 et 6
        {
            System.out.println("ERREUR ! Veuillez choisir un numéro entre 1 et 6 \n"
                            + "");
            afficherMenu();             
            
            numero = sc.nextLine();     //On récupère la saisie de l'utilisateur 
            num = Integer.parseInt(numero);     //On transforme le string en integer
        }
        
        return num;
    }
    
}
