/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Player;

/**
 *
 * @author Renee
 */
public class ProgramControl {

    public static Player createPlayer(String Name) {
        Object name = null;
       
       if(name == null){ 
           return null;        
    }
               
    Player player = new Player();
    player.setName(name);
    
    theHurricaneSurvivalGame.setPlayer(player);// save 
       return player;
    }

    private static void If(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
