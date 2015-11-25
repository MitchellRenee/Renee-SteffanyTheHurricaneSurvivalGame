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

    public static Item[] createInventoryList() {
        //Created an array list of supply items

        Item[][] inventory = new Item[22];

        Item protein = new Item();
        protein.setName("Protein");
        protein.setWeight(5);
        protein.setSurvivalPoint(18);
        inventory[8] = protein;

        return inventory;
    }

    //Testing
    private void startNewGame() {
        // Create a new game
        GameControl.createNewGame(TheHurricaneSurvivalGame.getPlayer());
    }

    private static class Item {

        public Item() {
        }
    }
}
