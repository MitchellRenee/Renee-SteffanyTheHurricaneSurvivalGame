/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.Exception.CityMapException;
import byui.cit260.theHurricaneSurvivalGame.Exception.TimeException;
import byui.cit260.theHurricaneSurvivalGame.model.CityMap;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;

/**
 *
 * @author Renee
 */
public class CityMapControl {

   
    public static boolean move(Player p, Location l)
            throws CityMapException {
         
        //ADD RETURN FALSE THEN RETURN TRUE
        if (Player.move() && Location.open()) {
            throw new CityMapException("Map cannot have less than 25 locations.");
            
        }
        p.setPlayerLocation(l);
        return false;
    }
}
