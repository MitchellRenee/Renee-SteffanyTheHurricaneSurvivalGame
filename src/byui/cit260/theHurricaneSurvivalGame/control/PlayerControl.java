/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import javax.lang.model.element.Name;


/**
 *
 * @author Renee
 */
public class PlayerControl {
  /**
    *<h2>Move:</h2>
    *<p>Move player from current location to a new location if the location is available.</p>
    *@param Location is the destination
    *@param Name is the valid by alphabet, first and/or last name, or abbreviation then name exists
    *@param Status gives player's best time played,amount of cash in account, and time left to play game
    *@return Was the player able to create a name?
    */
      public static boolean player(Name n, Location l, Status s){
        boolean returnValue = false;
        if(Location.exists() && Player.name() && Status.bestTime()){
            returnValue = true;
        }

        return returnValue;
    }

    private static class Status {

        private static boolean bestTime() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Status() {
        }
    }

}
    
