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
//Did not pass test
    /**
     * <h2>Move:</h2>
     * <p>
     * Move player from current location to a new location if the location is
     * available.</p>
     *
     * @param Location is the destination
     * @param Name is the valid by alphabet, first and/or last name, or
     * abbreviation then name exists
     * @param Status gives player's best time played,amount of cash in account,
     * and time left to play game
     * @return Was the player able to create a name?
     */
    public static boolean player(String name, Location l, String status) {
        boolean returnValue = false;
        throws TimeException  {
        for (Player player : players) {
            TimeRemaining = player.getTimeRemaining();
        boolean returnValue = TimeControl.calcTimeRemainingInGame(TimeSpent, TotalTime, TimeRemaining);
           // if (Location.exists() && name != null && status.equals("win")) {
           // returnValue = true;
           // }
        }
     }
        return returnValue;
    }
}
