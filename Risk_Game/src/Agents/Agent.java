/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agents;

import java.util.ArrayList;
import java.util.List;

import risk_game.Territory;

/**
 *
 * @author yarae
 */
public interface Agent {
    public void attack();
    public String getName();
	public int play();
	public List<Territory> getTerritories();
    public boolean canAttack();
    public int getMinTerritory();
    public int getMaxTerritory();
    public int getNumberofArmies();
}
