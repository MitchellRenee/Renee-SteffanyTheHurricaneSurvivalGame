/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SteffanyFaldmo
 */
public class timeControlTest {
    
    public timeControlTest() {
    }

    /**
     * Test of calcTimeRemainingInGame method, of class timeControl.
     */
    @Test
    public void testCalcTimeRemainingInGame() {
        System.out.println("calcTimeRemainingInGame");
        double TimeSpent = 0.0;
        double TotalTime = 0.0;
        timeControl instance = new timeControl();
        double expResult = 0.0;
        double result = instance.calcTimeRemainingInGame(TimeSpent, TotalTime);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
