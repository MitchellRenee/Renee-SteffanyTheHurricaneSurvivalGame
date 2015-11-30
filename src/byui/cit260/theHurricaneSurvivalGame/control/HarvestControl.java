/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import static byui.cit260.theHurricaneSurvivalGame.control.StoreControl.MoneyAccount;
import byui.cit260.theHurricaneSurvivalGame.model.Item;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;

/**
 *
 * @author Renee
 */
public class HarvestControl {

    static boolean harvest(Player p, Item i, Supplies s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//Did not pass test 

    
    /**
     * <h2>Move:</h2>
     *
     * @param Player gets items needed for their supply harvest.
     * @param Items are the actual things acquired from the store.(yes
     * @param Supplies is the list of items that the player needs to acquire.
     * @param DeliveryCenter stores the purchased items from store
     * locations and validate which items to purchase
     * @return Are the correct items located in the inventory and the supplies?
     */
    public boolean harvestControl(Player p, Supplies s, Item i, DeliveryCenter d) {
        boolean returnValue = false;
        if(Player.exists() && Supplies.needed() && Items.located && DeliveryCenter.status ("Will have delivery order")){
            returnValue = true;
        }
        
        return  returnValue;
    }
    

    public static class DeliveryCenter {

        private static boolean status(String will_have_delivery_order) {
            System.out.println("Delivery order ready."); 
            return true;
        }    

        public DeliveryCenter() {
        }
    }

    private static class Items {
        private static boolean located;

        public Items() {
        }
    }

    public static class Item {

        public Item() {
        }
    }
    public class Supplies { 

         

        public Supplies() {
        }      
        
        
    }
}    
    

        
 

        
        
     
 

   

  
        
