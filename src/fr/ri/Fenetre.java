package fr.ri;

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