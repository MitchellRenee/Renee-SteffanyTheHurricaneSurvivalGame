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
    public static boolean harvestControl(Player p, Item i, Supplies s) {
        boolean returnValue = false;
        if (Item.exists() && Supplies.valid()) {

        }

        return returnValue;
    }

    static boolean harvest(Player p, Item i, Supplies s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static class Inventory {

        public static boolean harvest(Player p, Supplies s, Item i) {
       
        
        p.setSupplies(s);
        p.setItem(i);

            return true;
        }
    }

    public static class Supplies {

        private static boolean valid() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Supplies() {
        }
    }

    public static class Item {

        private static boolean exists() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Item() {
        }
    }
}
