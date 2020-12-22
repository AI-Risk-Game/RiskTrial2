package Agents;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import risk_game.Player;
import risk_game.Territory;

public class AggressiveAgent implements Agent {
	Territory thisterritory = new Territory(0);
//	Player A = new Player(null); 
	Player B = new Player(this);
	HumanAgent human= new HumanAgent();
	@Override
	public void attack() {
		if (canAttack())
		{
			List<Territory> BTerritories = B.getOwned_Territories();
			//List<Territory> HTerritories = human.getTerritories();
			List<Territory> myTerritories = thisterritory.Get_adj_Territory();
			boolean noElementsInCommon = Collections.disjoint(BTerritories, myTerritories); // true
			if (noElementsInCommon)
			{
				//not one of territories 
			for (int i=0 ; i< myTerritories.size() ; i++)
			{			
				//attack with most armies  - lesa 
				if (myTerritories.get(i).getNo_of_armies() > BTerritories.get(i).getNo_of_armies() )
				{
					myTerritories.add(BTerritories.get(i));
					BTerritories.get(i).setNo_of_armies(0);
					BTerritories.remove(BTerritories.get(i));	//territory invaded 
					
					
				}
			}
			}
			//check : find el b territory mwgoda f my adjacent wla la 
			/*if 3adad my army akbr mn 3adad el army el odami attack 
			 *add their territory to my list of territories
			 *their army fl territory di btro7 */
			
		}

	}

	@Override
	public String getName() {
		return "Aggressive Agent";
	}

	@Override
	public int play() {
		
		List<Territory> myTerritories = thisterritory.Get_adj_Territory();
		
		int numofTerritories= myTerritories.size();
		int bonusArmies = numofTerritories/3;//count # of territories/3
		
		if (bonusArmies<3)
			bonusArmies=3;
		
		int max_No_Armies=getMaxTerritory();
		max_No_Armies=max_No_Armies+bonusArmies;
		
		return max_No_Armies;
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
	return 0;
	}

	@Override
	public int getNumberofArmies() {
		List<Territory> myTerritories = thisterritory.Get_adj_Territory();
		int numberofarmies = 0;
		int maxTerritory = myTerritories.get(0).getNo_of_armies();
		for (int i=0; i< myTerritories.size() ; i++)
		{
			numberofarmies = myTerritories.get(i).getNo_of_armies();
			
			if( numberofarmies > maxTerritory ){
				maxTerritory = numberofarmies;
            }
		}
		return maxTerritory;
	
	}

	@Override
	public int getMaxTerritory() {
//		ArrayList<Territory> ts=this.getTerritories();
//		
//		int maxTerritory = ts.get(0).getNo_of_armies();
//		for (int i=0; i < ts.size(); i++)
//		{
//			if( ts.get(i).getNo_of_armies()  > maxTerritory ){
//				maxTerritory = ts.get(i).getNo_of_armies();
//            }
// 		
//		}
//		return maxTerritory;
		return 0;
	}

}
