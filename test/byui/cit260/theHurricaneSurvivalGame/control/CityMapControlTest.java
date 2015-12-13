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
public class CityMapControlTest {
    
    public CityMapControlTest() {
    }

    /**
     * Test of move method, of class CityMapControl.
     */
    @Test
    public void testMove() throws Exception {
        System.out.println("move");
        Player p = null;
        Location l = null;
        boolean expResult = false;
        boolean result = CityMapControl.move(p, l);
        assertEquals(expResult, result);
    }    
}
