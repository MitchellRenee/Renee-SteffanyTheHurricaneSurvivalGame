/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.DeliverySupplies;

/**
 *
 * @author Renee
 */
public class DeliveryControl {

    /**
     * <h2>Move:</h2>
     * <p>
     * Move player from current location to a new location if the location is
     * available.</p>
     *
     * @param validateDeliveryOrder validate that a pickup order exists
     * @param calculateDeliveryTime determines the time it takes to deliver
     * items
     * @param calculateDeliveryCost determines the cost of the total delivery of
     * packages
     * @return Was the player able to move to the new location?
     */
    public double delivery(DeliverySupplies d, double x1, double y1, double x2, double y2) {

        double returnValue = 0;
        if (d == null) {
            return 0;
        }
        
        double calDistance = this.distance(x1, y1, x2, y2); 
        
        returnValue = d.getDeliverCost();
        return returnValue;
    }

    private double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }       
}
