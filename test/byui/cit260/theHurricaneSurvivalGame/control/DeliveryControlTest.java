/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;


import byui.cit260.theHurricaneSurvivalGame.model.DeliverySupplies;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class DeliveryControlTest {
    
    public DeliveryControlTest() {
    }

    /**
     * Test of delivery method, of class DeliveryControl.
     */
    @Test
    public void testDelivery() {
        System.out.println("delivery");
        DeliverySupplies d = new DeliverySupplies();
        d.setDeliverCost(5.00);
        double x1 = 0.0;
        double y1 = 0.0;
        double x2 = 0.0;
        double y2 = 0.0;
        DeliveryControl instance = new DeliveryControl();
        double expResult = 5.00;
        double result = instance.delivery(d, x1, y1, x2, y2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of delivery method, of class DeliveryControl.
     */
    
    }
    


    
       
  
    

