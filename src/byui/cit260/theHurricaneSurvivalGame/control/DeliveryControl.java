/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

/**
 *
 * @author Renee
 */
public class DeliveryControl {

 /**
    *<h2>Move:</h2>
    *<p>Move player from current location to a new location if the location is available.</p>
    *@param validateDeliveryOrder validate that a pickup order exists
    *@param calculateDeliveryTime determines the time it takes to deliver items
    *@param calculateDeliveryCost determines the cost of the total delivery of packages
    *@return Was the player able to move to the new location?
    */
     public static boolean delivery(DeliveryOrder o, DeliveryTime t, DeliveryCost c){
        boolean returnValue = false;
        if(DeliveryOrder.validate() && DeliveryTime.calculate() && DeliveryCost.calculate()){
            returnValue = true;
        }

        return returnValue;
        }

    private static class DeliveryCost {

        private static boolean calculate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public DeliveryCost() {
        }
    }

    private static class DeliveryTime {

        private static boolean calculate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public DeliveryTime() {
        }
    }

    private static class DeliveryOrder {

        private static boolean validate() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public DeliveryOrder() {
        }
    }
    
}
