/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Player;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame;

/**
 *
 * @author Steffany
 */
public class GameControl {

    public static void createNewGame(Player player) {
        System.out.println("\n***createNewGame stub function called ***");
    }

    public static InventoryItem[] createInventoryList() {
        //Created an array list of supply items

        InventoryItem inventory = new InventoryItem[22];

        InventoryItem proteinPoints = new InventoryItem();
        proteinPoints.setDescription("Protein");
        proteinPoints.setQuantityInStock(5);
        proteinPoints.setRequiredAmount(1);
        inventory[0] = proteinPoints;

        return supplies;
    }

    //Testing
    private void startNewGame() {
        // Create a new game
        GameControl.createNewGame(TheHurricaneSurvivalGame.getPlayer());
    }
}
