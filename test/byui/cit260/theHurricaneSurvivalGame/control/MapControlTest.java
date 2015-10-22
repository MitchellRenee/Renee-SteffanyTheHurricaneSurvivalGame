/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of move method, of class MapControl.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Player p = null;
        Location l = null;
        boolean expResult = false;
        boolean result = MapControl.move(p, l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
