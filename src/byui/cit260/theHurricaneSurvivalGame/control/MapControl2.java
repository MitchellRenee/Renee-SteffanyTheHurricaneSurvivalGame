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
public class MapControl2 {

    /**
     * <h2>Move:</h2>
     * <p>
     * Move player from current location to a new location if the location is
     * available.</p>
     *
     * @param Player is the person to be moved
     * @param Location is the destination
     * @param Aisle is a location within the megaStore to move to.
     * @return Was the player able to move to the new location?
     */
    public static boolean move(Player p, Location l, AisleControl a) {
        boolean returnValue = false;

        if (Player.exists() && Location.exists() && AisleControl.valid()) {

            returnValue = true;
        }
        return returnValue;
    }
    
        
public static void main(boolean[] args) {

    int[][]aryNumbers = new int[2][2];
    //Create a multidemnsional array
        
    boolean [][] player = new boolean[0][0];
    boolean[][] location = new boolean[0][1];
    boolean [][] aisle = new boolean[0][2];
    
    aryNumbers[0][0] = 6;
    aryNumbers[01][1] = 20;
    aryNumbers[0][2] = 30;  
      
    int row = 2;
    int column = 2;
    int i, j;
        
}
    //Use the for-each style loop pg 13, 17 ref
public long getMapControl(int[][] tableOfElements){
    
    long total = 0;   

    for(int[] row : tableOfElements) {
        for(int elements : row){
            total += elements;
            System.out.println(elements + " ");
       }
    }
    return total;
}
    
}

      
 

      



   // p.setPlayerLocation(l);
    //p.setPlayerAisle(a1, a2, a3, a4, a5);

