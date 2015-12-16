/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Location;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class PlayerControlTest {

    public PlayerControlTest() {
    }

    /**
     * Test of player method, of class PlayerControl.
     */
    @Test
    public void testPlayer() throws Exception {
        System.out.println("player");
        String name = "";
        Location l = null;
        boolean expResult = false;
        boolean result = PlayerControl.player(name, l);
        assertEquals(expResult, result);
    }
}
