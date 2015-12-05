/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import Exception.HarvestException;
import static byui.cit260.theHurricaneSurvivalGame.control.StoreControl.MoneyAccount;
import byui.cit260.theHurricaneSurvivalGame.model.DeliveryCenter;
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
    public static int harvestControl(Player p, Supplies s, Item i, Delivery d)
            throws HarvestException {
        if (item < 0); {// item must be greater than 0 on supplies inventory
              return 0;    
            }
        if (Player.exists() && Supplies.isNeeded() && Item.located() && Delivery.status("Has delivery.")){
            throw new HarvestException("Items cannot be less than 0 to have a deliver.");
        }
        return delivery;   
      
    }

    private static class Supplies {

        private static boolean isNeeded() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Supplies() {
        }
    }

    private static class Delivery {

        private static boolean status(String will_have_delivery_order) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Delivery() {
        }
    }
}     

            
   



