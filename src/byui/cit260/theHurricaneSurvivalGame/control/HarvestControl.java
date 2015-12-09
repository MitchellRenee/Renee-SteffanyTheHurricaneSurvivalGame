/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import Exception.HarvestException;
import Exception.TimeException;
import static byui.cit260.theHurricaneSurvivalGame.control.StoreControl.MoneyAccount;
import byui.cit260.theHurricaneSurvivalGame.model.DeliveryCenter;
import byui.cit260.theHurricaneSurvivalGame.model.Item;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renee
 */
public class HarvestControl {

//Did not pass test 
    /**
     * <h2>Move:</h2>
     *
     * @param Player gets items needed for their supply harvest.
     * @param Items are the actual things acquired from the store.(yes
     * @param Supplies is the list of items that the player needs to acquire.
     * @param Delivery validates that the player has a delivery order to
     * deliver. validate which items to purchase
     * @return Are the correct items located in the inventory and the supplies?
     */
    public static boolean harvestControl(Player p, Supplies s, Item i, DeliveryCenter d)
            throws HarvestExcepton, HarvestException {

        boolean returnValue = false;

//        if (Player.exists() && Supplies.isNeeded() && Item.located() && DeliveryCenter.status("Will have delivery order")) {
//            throw new HarvestException("Create method with no error.");
//        }

        returnValue = true;
        return returnValue;

    public static boolean harvest(Player p, Supplies s, Item i, Delivery d)
            throws HarvestException {
        if (Player.exists() && Supplies.needed() && Item.located() && Delivery.ready()) {
            throw new HarvestException("Cannot deliver items is not located.");
        }
        d.getDelivery(d);
        return false;

    public static class Supplies {

        public static boolean needed() {
            System.out.println("Items needed if not in inventory."); 
            return false;
        }

        public DeliveryCenter() {
        }
    }

    public static class Item {

        private static boolean located() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Item() {
        }

        private void setIsNeeded(String item_needed_if_amount_is_not_in_the_inven) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }

    private static class HarvestExcepton extends Exception {

        public HarvestExcepton() {
        }
    }

    private static class item extends Item {

        public item() {
        }
    }

    public class Supplies {

        private boolean isNeeded() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

    }


    public static class Delivery {

        private static boolean ready() {
            System.out.println("Status is not ready if items are not located."); 
            return false;
        }

        public Delivery() {
        }

        private void getDelivery(Delivery d) {
            System.out.println("Delivery ready for delivery if items are purchased."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
