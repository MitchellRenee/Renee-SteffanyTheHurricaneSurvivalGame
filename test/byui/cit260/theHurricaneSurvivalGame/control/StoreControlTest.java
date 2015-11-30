/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Item;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class StoreControlTest {
    
    public StoreControlTest() {
    }

    /**
     * Test of purchase method, of class StoreControl.
     */
    @Test
    public void testPurchase() {
        System.out.println("purchase");
        Item i = null;
        StoreControl.ItemAmount a = null;
        MoneyAccount m = null;
        boolean expResult = false;
        boolean result = StoreControl.purchase(i, a, m);
        assertEquals(expResult, result);        
    }

    /**
     * Test of main method, of class StoreControl.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        boolean[] args = null;
        StoreControl.main(args);
    }

    /**
     * Test of getStoreControl method, of class StoreControl.
     */
    @Test
    public void testGetStoreControl() {
        System.out.println("getStoreControl");
        int[][] tableOfElements = null;
        StoreControl instance = new StoreControl();
        long expResult = 0L;
        long result = instance.getStoreControl(tableOfElements);
        assertEquals(expResult, result);
    }

    /**
     * Test of ItemAmount method, of class StoreControl.
     */
    @Test
    public void testItemAmount() {
        System.out.println("ItemAmount");
        int expResult = 0;
        int result = StoreControl.ItemAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of MoneyAccount method, of class StoreControl.
     */
    @Test
    public void testMoneyAccount() {
        System.out.println("MoneyAccount");
        double expResult = 0.0;
        double result = StoreControl.MoneyAccount();
        assertEquals(expResult, result, 0.0);
    }
    
}
