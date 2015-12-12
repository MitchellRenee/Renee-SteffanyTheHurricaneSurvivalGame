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
public class ProgramControlTest {
    
    public ProgramControlTest() {
    }

    /**
     * Test of createPlayer method, of class ProgramControl.
     */
    @Test
    public void testCreatePlayer() throws Exception {
        System.out.println("createPlayer");
        String name = "";
        Player expResult = null;
        Player result = ProgramControl.createPlayer(name);
        assertEquals(expResult, result);
    }    
}
