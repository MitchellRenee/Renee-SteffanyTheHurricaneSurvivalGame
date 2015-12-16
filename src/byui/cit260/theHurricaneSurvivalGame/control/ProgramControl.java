/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.Exception.ProgramException;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Player;

/**
 *
 * @author Renee
 */
public class ProgramControl {
    
    public static void main(String[] args) {
        System.out.println("Let the games begin.");
    }

//Did not pass 
    // This algorithm checks to make sure the value of name of the input parameter contains a value not a null
    public static Player createPlayer(String name) throws ProgramException {
        if (name == null) {
            throw new ProgramException("Player name must be entered.");
        }

        Player player = new Player();
        player.setName(name);

        HurricaneSurvivalGame.getInstance().setPlayer(player);// save 
        return player;
    }
}
