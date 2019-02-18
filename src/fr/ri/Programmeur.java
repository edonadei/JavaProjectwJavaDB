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
public class Programmeur {
  
    private String nom;
    private String prenom;
    private String adresse;
    private String pseudo;
    private String responsable;
    private String hobby;
    private String annNaissance;
    private String salaire;
    private String prime;
    /*
    "ID" INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
	"NOM" VARCHAR(35),
	"PRENOM" VARCHAR(35),
 	"ADRESSE" VARCHAR(150),
	"PSEUDO" VARCHAR(20),
	"RESPONSABLE" VARCHAR(30),
	"HOBBY" VARCHAR(10),
	"ANNAISSANCE" VARCHAR(4),
	"SALAIRE" VARCHAR(10),
	"PRIME" VARCHAR(10),
    */

    public Programmeur(String nom, String prenom, String adresse, String pseudo, String responsable, String hobby, String annNaissance, String salaire, String prime) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.pseudo = pseudo;
        this.responsable = responsable;
        this.hobby = hobby;
        this.annNaissance = annNaissance;
        this.salaire = salaire;
        this.prime = prime;
    }

    public Programmeur(String nom, String prenom, String adresse, String pseudo, String responsable, String hobby, String annNaissance, String salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.pseudo = pseudo;
        this.responsable = responsable;
        this.hobby = hobby;
        this.annNaissance = annNaissance;
        this.salaire = salaire;
    }

    public Programmeur() {
        this.nom = "RANDOM";
        this.prenom = "RANDOM";
        this.adresse = "RANDOM";
        this.pseudo = "RANDOM";
        this.responsable = "RANDOM";
        this.annNaissance = "2000";
        this.salaire = "0";
        this.prime = "0";
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPseudo() {
        return pseudo;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getAnnNaissance() {
        return annNaissance;
    }

    public void setAnnNaissance(String annNaissance) {
        this.annNaissance = annNaissance;
    }

    public String getSalaire() {
        return salaire;
    }

    public void setSalaire(String salaire) {
        this.salaire = salaire;
    }

    public String getPrime() {
        return prime;
    }

    public void setPrime(String prime) {
        this.prime = prime;
    }
    
    /**
     * Surcharge du toString de base pour l'object programmeur
     * @return 
     */
    @Override
    public String toString()
    {
        return "Nom: " + this.nom
                + "\nPrénom: " + this.prenom 
                + "\nPseudo: " + this.pseudo
                + "\nAdresse: " + this.adresse
                + "\nHobby: " + this.hobby
                + "\nResponsable: " + this.responsable
                + "\nAnnée de naissance: " + this.annNaissance
                + "\nSalaire: " + this.salaire
                + "\nPrime: " + this.prime;
    }
}
