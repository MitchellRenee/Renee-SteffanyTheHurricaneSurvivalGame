/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import static org.testng.Assert.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Renee
 */
public class deliveryControlNGTest {
    
    public deliveryControlNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of delivery method, of class DeliveryControl.
     */
    @Test
    public void testDelivery() {
        System.out.println("delivery");
        DeliveryControl.DeliveryOrder d = null;
        DeliveryControl.Time t = null;
        DeliveryControl.Cost c = null;
        boolean expResult = false;
        boolean result = DeliveryControl.delivery(d, t, c);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
