package fr.ri;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
    private int choix;
    private ActionsBDDImpl bdd = new ActionsBDDImpl();

    /**
     * Constructeur par défaut du menu
     */
    public Menu() {  
        this.choix = 0;
    }

    public int getChoix() {    
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
            case 1 : printProgrammeurArrayList(bdd.BDDQueryAll());  //Fonction qui permet d'afficher la liste de programmeurs
                    break;
            
            case 2 : printProgrammeurArrayList(bdd.BDDQueryByID(askId())); //Fonction qui va permettre d'afficher un programmeur selont son ID
                    break;
            
            case 3 : bdd.BDDDeleteProgrammeur(askId());
                    System.out.println("Le programmeur a ete supprime");
                    break;
                
            case 4 : bdd.BDDAddProgrammeur(createProgrammeur());
                    System.out.println("Le programmeur a ete ajoute");
                    break;
                
            case 5 : bdd.BDDModifierSalaire(askId(), askSalaire());
                    System.out.println("Le champ a ete modifie");
                    break;
                
            case 6 : System.exit(0);
                    break;
                
            default : break;
        }
    }
    
    /**
     * Boucle de fonctionnement du programme
     */
    public void boucle()
    {   
        while(true)
        {
            afficherMenu();
            action(choisir());

        }
    }
    
    /**
     * Méthode de construction d'un objet ProgrammeurBean en rentrant toutes les informations en console
     * @return 
     */
    public ProgrammeurBean createProgrammeur()
    {
        ProgrammeurBean prog = new ProgrammeurBean();
        
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
        System.out.println("HOBBY:");
        prog.setHobby(sc.nextLine());
        System.out.println("ANNEE DE NAISSANCE:");
        prog.setAnnNaissance(Integer.parseInt(sc.nextLine()));
        System.out.println("SALAIRE:");
        prog.setSalaire(Float.parseFloat(sc.nextLine()));
        System.out.println("PRIME:");
        prog.setPrime(Float.parseFloat(sc.nextLine()));
        return prog;
    }
    
    /**
     * Utilisation d'une boucle for each pour l'affichage d'une ArrayList de programmeurs
     * @param toPrint 
     */
    public void printProgrammeurArrayList(ArrayList<ProgrammeurBean> toPrint)
    {
        if (toPrint.isEmpty())
        {
            System.out.println("Votre recherche n'a trouvé aucun résultat");
        } else {
            for (ProgrammeurBean p : toPrint)
            {
                System.out.println(p.toString());
            }
        }
    }
    
    /**
     * Demande à l'utilisateur de rentrer un ID
     * @return 
     */
    public int askId(){
        
        Scanner sc = new Scanner(System.in);
        int idInt;
        String id;
        
        System.out.println("Quel est l'ID ?");
        
        id = sc.nextLine();     //On recupere la saisie de l'utilisateur 
        idInt = Integer.parseInt(id);     //On transforme le string en integer
        
        return idInt;
        
    }
    
    /**
     * Demande à l'utilisateur quelle valeur il veut allouer au champ
     * @return 
     */
    public Float askSalaire(){
        
        Scanner sc = new Scanner(System.in);    //Variable qui permet de recuperer une saisie
        String champ;
        System.out.println("Quelle est la nouvelle valeur du champ ?");
        champ = sc.nextLine();     //On recupere la saisie de l'utilisateur  
        return Float.parseFloat(champ);   //On retourne la valeur que l'utilisateur a rentre
        
    }

}
