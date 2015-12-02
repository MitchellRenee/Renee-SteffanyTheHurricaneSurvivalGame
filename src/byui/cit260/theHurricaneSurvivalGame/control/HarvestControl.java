/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import Exception.HarvestException;
import static byui.cit260.theHurricaneSurvivalGame.control.StoreControl.MoneyAccount;
import byui.cit260.theHurricaneSurvivalGame.model.Item;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;

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
     * @param DeliveryCenter stores the purchased items from store locations and
     * validate which items to purchase
     * @return Are the correct items located in the inventory and the supplies?
     */
    public static boolean harvestControl(Player p, Supplies s, Item i, DeliveryCenter d)
            throws HarvestExcepton, HarvestException {

    boolean returnValue = false;
    
        if (Player.exists() && Supplies.isNeeded() && Item.located() && DeliveryCenter.status("Will have delivery order")) {
            throw new HarvestException("Create method with no error.");
        }

        returnValue = true;
        return returnValue;
    }

   

    static boolean harvest(Player p, Item i, Supplies s) throws HarvestException {
        throw new HarvestException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    public static class DeliveryCenter {

        private static boolean status(String will_have_delivery_order) {
            System.out.println("Delivery order ready.");
            return true;
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
        
        public Supplies() {
        }
    
        
     

    }
}
