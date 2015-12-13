/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

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
     * Test of moveNorth method, of class MoveControl.
     */
    @Test
    public void testMoveNorth() throws Exception {
        System.out.println("moveNorth");
        Player p = null;
        MoveControl instance = new MoveControl();
        boolean expResult = false;
        boolean result = instance.moveNorth(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of moveEast method, of class MoveControl.
     */
    @Test
    public void testMoveEast() throws Exception {
        System.out.println("moveEast");
        Player p = null;
        MoveControl instance = new MoveControl();
        boolean expResult = false;
        boolean result = instance.moveEast(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of moveSouth method, of class MoveControl.
     */
    @Test
    public void testMoveSouth() throws Exception {
        System.out.println("moveSouth");
        Player p = null;
        MoveControl instance = new MoveControl();
        boolean expResult = false;
        boolean result = instance.moveSouth(p);
        assertEquals(expResult, result);
    }

    /**
     * Test of moveWest method, of class MoveControl.
     */
    @Test
    public void testMoveWest() throws Exception {
        System.out.println("moveWest");
        Player p = null;
        MoveControl instance = new MoveControl();
        boolean expResult = false;
        boolean result = instance.moveWest(p);
        assertEquals(expResult, result);
    }    
}
