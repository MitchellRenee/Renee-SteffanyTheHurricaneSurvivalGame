/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import Exception.CityMapException;
import Exception.TimeException;
import byui.cit260.theHurricaneSurvivalGame.model.CityMap;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;

/**
 *
 * @author Renee
 */
public class CityMapControl {

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
    public static boolean move(Player p, Location l)
            throws CityMapException {
        if (Player.Move() && Location.exists()) {
            throw new CityMapException("Map must contain 25 locations,");
        }
        p.setPlayerLocation(l);
        return false;
    }

}
