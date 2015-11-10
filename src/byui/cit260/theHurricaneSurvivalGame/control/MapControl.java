/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;

/**
 *
 * @author Renee
 */
public class MapControl {

    /**
     * <h2>Move:</h2>
     * <p>
     * Move player from current location to a new location if the location is
     * available.</p>
     *
     * @param Player is the person to be moved
     * @param Location is the destination
     * @return Was the player able to move to the new location?
     */
    public static boolean move(Player p, Location l) {
        boolean returnValue = false;
        if (Location.exists() && Player.canMove()) {
            returnValue = true;
        }

        return returnValue;
    }
}
