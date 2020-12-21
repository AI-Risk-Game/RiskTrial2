/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import java.util.ArrayList;
import risk_game.Territory;

/**
 *
 * @author yarae
 */
public interface Agent {
    public void attack();
    public String getName();
	public void play();
	public ArrayList<Territory> getTerritories();
    public boolean canAttack();
    public ArrayList<Territory> InitialNumberofArmies();
    public int getMinTerritory();
    public int getNumberofArmies();
}
