package Agents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import risk_game.Player;
import risk_game.Territory;

public class PacifistAgent implements Agent {
	
	Territory thisterritory = new Territory(0);
//	Player A = new Player(null); 
	Player B = new Player(this);
	
	@Override
	public void attack() {
		//conquer one land only with the fewest territories
		Territory t=null;
		List<Territory> BTerritories = B.getOwned_Territories();
		List<Territory> myTerritories = thisterritory.Get_adj_Territory();
		boolean noElementsInCommon = Collections.disjoint(BTerritories, myTerritories); // true
		if (noElementsInCommon) 	//not one of territories 
		{
		 t= B.getMinTPlayer(); //get terr with min # of armies in player B
		for (int i=0 ; i< myTerritories.size() ; i++)
		{			
			
			if (myTerritories.get(i).getNo_of_armies() > t.getNo_of_armies())
			{
				myTerritories.add(t);
			//	BTerritories.remove(t);	//territory invaded 
				
				if (BTerritories.remove(t)) /****invaded once only --checkkkk */
					break;
			}
		}
		}
		
	}

	@Override
	public String getName() {
		return "Pacifist Agent" ;
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
		return true;
	}

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
