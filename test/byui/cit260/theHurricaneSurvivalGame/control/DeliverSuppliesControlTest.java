/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.DeliveryCenter;
import byui.cit260.theHurricaneSurvivalGame.model.Item;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class DeliverSuppliesControlTest {
    
    public DeliverSuppliesControlTest() {
    }

    /**
     * Test of deliverSupplies method, of class DeliverSuppliesControl.
     */
    @Test
    public void testDeliverSupplies() throws Exception {
        System.out.println("deliverSupplies");
        Item i = null;
        DeliverSuppliesControl.Purchased p = null;
        DeliveryCenter c = null;
        DeliverSuppliesControl.DeliveryLocation d = null;
        double expResult = 0.0;
        double result = DeliverSuppliesControl.deliverSupplies(i, p, c, d);
        assertEquals(expResult, result, 0.0);
    }    
}
