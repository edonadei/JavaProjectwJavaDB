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
    
    private String nom;
    private String prenom;
    private String pseudo;
    private String responsable;
    private String hobby;
    private String annaissance;
    private String salaire;
    private String prime;

    public Programmeur(String nom, String prenom, String pseudo, String responsable, String hobby, String annaissance, String salaire, String prime) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.responsable = responsable;
        this.hobby = hobby;
        this.annaissance = annaissance;
        this.salaire = salaire;
        this.prime = prime;
    }

    public Programmeur(String nom, String prenom, String pseudo, String responsable, String hobby, String annaissance, String salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.responsable = responsable;
        this.hobby = hobby;
        this.annaissance = annaissance;
        this.salaire = salaire;
        this.prime = null;
    }

    public Programmeur() {
        this.nom = "UNKNOWN";
        this.prenom = "UNKNOWN";
        this.pseudo = "UNKNOWN";
        this.responsable = "UNKNOWN";
        this.hobby = "UNKNOWN";
        this.annaissance = "UNKNOWN";
        this.salaire = "UNKNOWN";
        this.prime = "UNKNOWN";
        
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

    public String getAnnaissance() {
        return annaissance;
    }

    public void setAnnaissance(String annaissance) {
        this.annaissance = annaissance;
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

    
    
    
}
