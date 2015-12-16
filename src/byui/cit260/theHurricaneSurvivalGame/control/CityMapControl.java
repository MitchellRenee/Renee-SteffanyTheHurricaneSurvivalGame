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
    
     public static void main(String[] args) {
        System.out.println("Welcome to the city map.");
    }

    public static boolean move(Player p, Location l) throws CityMapException {
         
        boolean returnValue = false;
        if (Player.move() && Location.open()) {
            throw new CityMapException("Map cannot have less than 25 locations.");
            
        }
        
        
       
        p.setPlayerLocation(l);
        return false;
    }
    
     static boolean valid() {
        System.out.println("Map not available.");
        return false;
    }

    static boolean open() {
        System.out.println("Here is the city map."); 
        return false;
    }
}
