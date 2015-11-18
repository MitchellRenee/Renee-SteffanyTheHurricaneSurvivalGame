/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.control.GameControl;
import java.util.Scanner;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame;

/**
 *
 * @author Renee
 */
public class GameMenuView extends View {

    // Picture shows to create GameMenuView in the View Layer not Model Layer 

    private void startNewGame() {
        // Create a new game
        GameControl.createNewGame(TheHurricaneSurvivalGame.getPlayer());

        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

       
   


    public GameMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Game Menu                         "
                + "\n------------------------------------"
                + "\nG - Start new game                      "
                + "\nH - Get help on how to playgame     "
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n------------------------------------");
    }

  

    /**
     * This just gets the player's input
     *
     * @return
     */
    
    

    
    public boolean doAction(Object action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
