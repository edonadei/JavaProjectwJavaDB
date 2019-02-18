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
import java.awt.Color; 
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class Fenetre extends JFrame {
  public Fenetre(){             
    this.setTitle("BDD Programmeurs");
    this.setSize(800, 600);
    this.setLocationRelativeTo(null);               
 
    JPanel pan = new JPanel();
    pan.setBackground(Color.ORANGE);        
    this.setContentPane(pan); 
    this.setContentPane(new Panneau());
    this.setVisible(true);
  }       
}