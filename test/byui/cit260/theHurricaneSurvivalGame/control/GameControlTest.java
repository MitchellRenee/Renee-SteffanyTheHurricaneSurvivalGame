/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Item;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class GameControlTest {
    
    public GameControlTest() {
    }

    /**
     * Test of createInventoryList method, of class GameControl.
     */
    @Test
    public void testCreateInventoryList() {
        System.out.println("createInventoryList");
        Item[] expResult = null;
        Item[] result = GameControl.createInventoryList();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
    @Test
    public void testCreateNewGame_Player() {
        System.out.println("createNewGame");
        Player player = null;
        GameControl.createNewGame(player);
    
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
    @Test
    public void testCreateNewGame_0args() {
        System.out.println("createNewGame");
        GameControl.createNewGame();
    }

    /**
     * Test of finishCreatePlayer method, of class GameControl.
     */
    @Test
    public void testFinishCreatePlayer() {
        System.out.println("finishCreatePlayer");
        GameControl.finishCreatePlayer();
    }
    
}
