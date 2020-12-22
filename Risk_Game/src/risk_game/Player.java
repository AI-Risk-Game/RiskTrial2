/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package risk_game;

import Agents.Agent;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yarae
 */
public class Player {
    ArrayList<Territory> owned_Territories=null;
    int no_of_armies;
    Agent g;
    public Player( Agent g) {
        this.g=g;
        this.owned_Territories=null;
        this.no_of_armies=20;
    }
    public void attack(){
    }
    
    public Territory getMinTPlayer() {
	  
		int numberofarmies =0 ;
		Territory t = null;
		int minTerritory = owned_Territories.get(0).getNo_of_armies();
		for (int i=0; i< owned_Territories.size() ; i++)
		{
			numberofarmies = owned_Territories.get(i).getNo_of_armies();
		
			if( numberofarmies  < minTerritory ){
				minTerritory = numberofarmies;
			t= owned_Territories.get(i);	
			}
		}
	return t;
	}
    
	public ArrayList<Territory> getOwned_Territories() {
		return owned_Territories;
	}
	public void setOwned_Territories(ArrayList<Territory> owned_Territories) {
		this.owned_Territories = owned_Territories;
	}
	public int getNo_of_armies() {
		return no_of_armies;
	}
	public void setNo_of_armies(int no_of_armies) {
		this.no_of_armies = no_of_armies;
	}
	public Agent getG() {
		return g;
	}
	public void setG(Agent g) {
		this.g = g;
	}
    
    
    
    
    
}
