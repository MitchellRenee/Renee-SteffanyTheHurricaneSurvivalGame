/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.Exception.PlayerException;
import static byui.cit260.theHurricaneSurvivalGame.Exception.PlayerException.PlayerException;
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
     * @param player is the person interacting as the end user.
     * @param Name is the valid by alphabet, first and/or last name, or
     * abbreviation then name exists
     * @param Status gives player's best time played,amount of cash in account,
     * and time left to play game
     * @return Was the player able to retrieve the game status?
     */
    //Status 
    public static boolean player(String name, Location l)
            throws PlayerException {

        boolean returnValue = false;
        if (name != null && Location.open()) {
            throw new PlayerException("Player's name cannot be a null.");
        }
        return false;

    }
}
