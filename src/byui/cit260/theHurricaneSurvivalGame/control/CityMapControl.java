/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import Exception.MapException;
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
        if (Player.Move() && Location.exists());
        
        p.setPlayerLocation(l);
        return false;
    }    

    boolean CityMapException() {

        Location = LocationType;
        
        if (row){               
            
            throw new CityMapException("");
            }
            return 

        }

    private static class CityMapException extends Exception {

        public CityMapException() {
        }

        private CityMapException(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    }
