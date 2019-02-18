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
import java.awt.Graphics;
import javax.swing.JPanel;
 
public class Panneau extends JPanel { 
  @Override
  public void paintComponent(Graphics g){
    g.fillOval(20, 20, 75, 75);
  }               
}
