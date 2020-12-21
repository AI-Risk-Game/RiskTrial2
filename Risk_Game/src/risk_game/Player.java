/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package risk_game;

import Agents.Agent;
import java.util.ArrayList;

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
    
    
    
    
}
