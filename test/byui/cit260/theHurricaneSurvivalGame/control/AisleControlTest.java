/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Aisle;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class AisleControlTest {
    
    public AisleControlTest() {
    }

    /**
     * Test of aisle method, of class AisleControl.
     */
    @Test
    public void testAisle() throws Exception {
        System.out.println("aisle");
        Aisle a = null;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int aisle = 0;
        int expResult = 0;
        int result = AisleControl.aisle(a, a1, a2, a3, a4, a5, aisle);
        assertEquals(expResult, result);
    }

    /**
     * Test of valid method, of class AisleControl.
     */
    @Test
    public void testValid() {
        System.out.println("valid");
        boolean expResult = false;
        boolean result = AisleControl.valid();
        assertEquals(expResult, result);
    }

    /**
     * Test of open method, of class AisleControl.
     */
    @Test
    public void testOpen() {
        System.out.println("open");
        boolean expResult = false;
        boolean result = AisleControl.open();
        assertEquals(expResult, result);
    }    
}
