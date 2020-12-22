package Agents;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import risk_game.Territory;

public class PassiveAgent implements Agent {

	Territory thisterritory = new Territory(0);
	
	@Override
	public void attack() {
	
	}

	@Override
	public String getName() {
		return "Passive Agent";
	}


	@Override
	public int play() {
		List<Territory> ts= thisterritory.Get_adj_Territory();
		int numofTerritories= ts.size();
		int bonusArmies = numofTerritories/3;//count # of territories/3
		
		if (bonusArmies<3)
			bonusArmies=3;
		
		int min_No_Armies=getMinTerritory();
		min_No_Armies=min_No_Armies+bonusArmies;
		
		return min_No_Armies;
	}

	
	@Override
	public List<Territory> getTerritories() {
		List<Territory> myTerritories = thisterritory.Get_adj_Territory();
		return myTerritories;
	}


	@Override
	public boolean canAttack() {
		return false;
	}

//	@Override
//	public ArrayList<Territory> InitialNumberofArmies() {
//		ArrayList<Territory> armies = new ArrayList();
//		for (int i = 0; i < 20; i++) {
//		    armies.add(1,null);
//		}
//		return armies;
//	}

	@Override
	public int getMinTerritory() {
		List<Territory> myTerritories = thisterritory.Get_adj_Territory();
		int numberofarmies =0 ;
		int minTerritory = myTerritories.get(0).getNo_of_armies();
		for (int i=0; i< myTerritories.size() ; i++)
		{
			numberofarmies = myTerritories.get(i).getNo_of_armies();
		
			if( numberofarmies  < minTerritory ){
				minTerritory = numberofarmies;
			}
		}
	return minTerritory;
	}

	@Override
	public int getNumberofArmies() {
		List<Territory> myTerritories = thisterritory.Get_adj_Territory();
		int numberofarmies =0 ;
	
		for (int i=0; i< myTerritories.size() ; i++)
		{
			numberofarmies = myTerritories.get(i).getNo_of_armies();
		}
		return numberofarmies;
	
	
	}


	@Override
	public int getMaxTerritory() {
		return 0;
	}
}
