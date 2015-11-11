/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.control.GameControl;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame;

/**
 *
 * @author Renee
 */
public class GameMenuView {
   // Picture shows to create GameMenuView in the View Layer not Model Layer 
  private void startNewGame(){
             // Create a new game
      GameControl.createNewGame(TheHurricaneSurvivalGame.getPlayer());
      
      // Display the game menu
      GameMenuView gameMenu = new GameMenuView();
      gameMenu.displayMenu();
  }

    private void displayMenu() {
        System.out.println("\n*** displayeMenu stub function called ");
  
    }
    
}
    