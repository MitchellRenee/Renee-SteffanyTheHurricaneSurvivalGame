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
public class HarvestControl {

    /**
     * <h2>Move:</h2>
     * <p>
     * Delivery allows the player to take inventory of personal stock, purchase
     * needed items, and deliver items to correct locations.</p>
     *
     * @param HarvestInventoryItems lets the player view and validate stock
     * inventory
     * @param HarvestInventorySupplies lets the player view items at the store
     * locations and validate which items to purchase
     * @return Are the correct items located in the inventory and the supplies?
     */
    public static boolean harvestControl(Player p, InventoryItems i, InventorySupplies s) {
        boolean returnValue = false;
        if (InventoryItems.exists() && InventorySupplies.valid()) {

        }

        return returnValue;
    }

    public static class InventoryItems {

        private static boolean exists() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public InventoryItems() {
        }
    }

    public static class Inventory {

        private static boolean harvest(Player p, Supplies s, Items i) {

            p.setSupplies(s);
            p.setItems(i);
            return true;

        

        
        }
    }

    private static class InventorySupplies {

        public InventorySupplies() {
        }
    }

    }