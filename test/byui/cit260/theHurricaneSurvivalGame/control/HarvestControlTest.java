/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Player;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class HarvestControlTest {

    public HarvestControlTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of harvest method, of class HarvestControl.
     */
    @Test
    public void testHarvest() {
        System.out.println("harvest");
        Player p = null;
        HarvestControl.Item i = null;
        HarvestControl.Supplies s = null;
        boolean expResult = false;
        boolean result = HarvestControl.harvest(p, i, s);
        assertEquals(expResult, result);
    }
}
