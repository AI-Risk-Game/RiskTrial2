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
public class HumanAgent implements Agent{
	Territory thisterritory = new Territory(0);

    @Override
    public void attack() {
    }

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int play() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Territory> getTerritories() {
		List<Territory> myTerritories = thisterritory.Get_adj_Territory();
		return myTerritories;
	}


	@Override
	public boolean canAttack() {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public ArrayList<Territory> InitialNumberofArmies() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public int getMinTerritory() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNumberofArmies() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMaxTerritory() {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
