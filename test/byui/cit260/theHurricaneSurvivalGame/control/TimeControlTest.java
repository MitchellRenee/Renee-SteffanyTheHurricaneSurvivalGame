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
 * @author Renee
 */
public class TimeControlTest {
    
    public TimeControlTest() {
    }

    /**
     * Test of calcTimeRemainingInGame method, of class TimeControl.
     */
    @Test
    public void testCalcTimeRemainingInGame() throws Exception {
        System.out.println("calcTimeRemainingInGame");
        double timeSpent = 0.0;
        double totalTime = 0.0;
        TimeControl instance = new TimeControl();
        double expResult = 0.0;
        double result = instance.calcTimeRemainingInGame(timeSpent, totalTime);
        assertEquals(expResult, result, 0.0);
    }    
}
