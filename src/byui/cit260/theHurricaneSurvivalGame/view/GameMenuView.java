/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

/**
 *
 * @author Renee
 */
public class GameMenuView {
    
    private void startNewGame(){
        
       // Create a new game
        GameControl.createNewGame (TheHurricaneSurvivalGame());
        
        // Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }
}    
    