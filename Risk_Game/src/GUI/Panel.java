/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import maps.Egypt;
import maps.maps;
import risk_game.Territory;

/**
 *
 * @author yarae
 */
public class Panel extends JPanel{
 
    private Image img;
    private Image circle;
    int view;
    maps map;
    ArrayList<Territory> territories=null;
  public Panel() {
    this.img = new ImageIcon("resources/wall1.jpg").getImage();
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

    Panel(maps map) {
    this.map=map;
    this.territories=map.getTerritories();
    this.circle= new ImageIcon("resources/c.grey.jpg").getImage();
    this.img = new ImageIcon(map.getwallpapper()).getImage();
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    
    setLayout(null);
    }
    public void setview(int i){
        view=i;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);   
        g.drawImage(img, 0, 0, null); 
       /* if (map instanceof Egypt) {
            for (Territory territory : territories) {
               
                g.drawImage(circle, territory.getXcoordinate(), territory.getYcoordinate(), this);
                repaint();
            }
        }*/
    }
   
    
    
}
