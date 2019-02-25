package fr.ri;

import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
  @Override
  public void paintComponent(Graphics g){
    g.fillOval(20, 20, 75, 75);
  }               
}
