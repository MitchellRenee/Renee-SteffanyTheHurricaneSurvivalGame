/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.DeliverSupplies;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class DeliveryCenterControlTest {
    
    public DeliveryCenterControlTest() {
    }

    /**
     * Test of deliveryCenter method, of class DeliveryCenterControl.
     */
    @Test
    public void testDeliveryCenter() {
        System.out.println("deliveryCenter");
        DeliverSupplies d = null;
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        DeliveryCenterControl instance = new DeliveryCenterControl();
        double expResult = 0.0;
        double result = instance.deliveryCenter(d, x1, y1, x2, y2);
        assertEquals(expResult, result, 0.0);
    }    
}
