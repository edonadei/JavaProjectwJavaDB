/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.ri;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Emrick-PC-Portable
 */
import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
  public Fenetre(){             
    this.setTitle("BDD Programmeurs");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);               
 
    //Instanciation d'un objet JPanel
    JPanel pan = new JPanel();
    //Définition de sa couleur de fond
    pan.setBackground(Color.ORANGE);        
    //On prévient notre JFrame que notre JPanel sera son content pane
    this.setContentPane(pan);               
    this.setVisible(true);
  }       
}