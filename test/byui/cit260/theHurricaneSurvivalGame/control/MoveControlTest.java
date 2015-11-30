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
public class MoveControlTest {
    
    public MoveControlTest() {
    }

    /**
     * Test of move method, of class MoveControl.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Player p = null;
        Location l = null;
        AisleControl a = null;
        boolean expResult = false;
        boolean result = MoveControl.move(p, l, a);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class MoveControl.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        boolean[] args = null;
        MoveControl.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMapControl method, of class MoveControl.
     */
    @Test
    public void testGetMapControl() {
        System.out.println("getMapControl");
        int[][] tableOfElements = null;
        MoveControl instance = new MoveControl();
        long expResult = 0L;
        long result = instance.getMapControl(tableOfElements);
        assertEquals(expResult, result);       
    }
    
}
