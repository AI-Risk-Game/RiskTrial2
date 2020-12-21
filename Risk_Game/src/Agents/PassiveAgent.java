package Agents;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import risk_game.Territory;

public class PassiveAgent implements Agent {

	Territory thisterritory = new Territory(0);
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Passive Agent";
	}


	@Override
	public void play() {
		ArrayList<Territory> ts= this.getTerritories();
		int numofTerritories= ts.size();
		int bonusArmies = numofTerritories/3;//count territories/3
		//loop 3la kol el adjacent territories w check the min number of territories w plus 3aleha el bonus army
		int min_No_Armies=getMinTerritory();
		min_No_Armies=min_No_Armies+bonusArmies;
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public ArrayList<Territory> getTerritories() {
		ArrayList<Territory> ts=this.getTerritories();
		return (ArrayList<Territory>) ts;
	}

	@Override
	public boolean canAttack() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ArrayList<Territory> InitialNumberofArmies() {
		ArrayList<Territory> armies = new ArrayList();
		for (int i = 0; i < 20; i++) {
		    armies.add(1,null);
		}
		return armies;
	}

	@Override
	public int getMinTerritory() {
		ArrayList<Territory> ts=this.getTerritories();
	
		int minTerritory = ts.get(0).getNo_of_armies();
		for (int i=0; i<ts.size(); i++)
		{
			if( ts.get(i).getNo_of_armies() < minTerritory ){
				minTerritory = ts.get(i).getNo_of_armies();
            }
 		
		}
		return minTerritory;
	}

	@Override
	public int getNumberofArmies() {
		int numberofarmies = thisterritory.getNo_of_armies();
		return numberofarmies;
	}
}
