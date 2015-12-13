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
public class MoneyAccountControlTest {
    
    public MoneyAccountControlTest() {
    }

    /**
     * Test of subtractMoney method, of class MoneyAccountControl.
     */
    @Test
    public void testSubtractMoney() throws Exception {
        System.out.println("subtractMoney");
        double totalCash = 0.0;
        double cashDeducted = 0.0;
        double cashRemaining = 0.0;
        MoneyAccountControl instance = new MoneyAccountControl();
        double expResult = 0.0;
        double result = instance.subtractMoney(totalCash, cashDeducted, cashRemaining);
        assertEquals(expResult, result, 0.0);
    }    
}
