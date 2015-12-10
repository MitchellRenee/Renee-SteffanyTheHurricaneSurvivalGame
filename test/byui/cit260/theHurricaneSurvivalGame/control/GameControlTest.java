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

    /**
     * Test of getSavedGame method, of class GameControl.
     */
    @Test
    public void testGetSavedGame() throws Exception {
        System.out.println("getSavedGame");
        String filePath = "";
        GameControl.getSavedGame(filePath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame_GameControl_String() throws Exception {
        System.out.println("saveGame");
        GameControl gameControl = null;
        String filepath = "";
        GameControl.saveGame(gameControl, filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
    @Test
    public void testCreateNewGame() {
        System.out.println("createNewGame");
        GameControl.createNewGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createNewPlayer method, of class GameControl.
     */
    @Test
    public void testCreateNewPlayer() {
        System.out.println("createNewPlayer");
        GameControl.createNewPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame_0args() {
        System.out.println("saveGame");
        GameControl.saveGame();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of <error> method, of class GameControl.
     */
    @Test
    public void test<error>() {
        System.out.println("<error>");
        game = null;
        GameControl instance = new GameControl();
        instance.<error>(<error>);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of exists method, of class GameControl.
     */
    @Test
    public void testExists() {
        System.out.println("exists");
        GameControl instance = new GameControl();
        boolean expResult = false;
        boolean result = instance.exists();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saved method, of class GameControl.
     */
    @Test
    public void testSaved() {
        System.out.println("saved");
        GameControl instance = new GameControl();
        boolean expResult = false;
        boolean result = instance.saved();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Game method, of class GameControl.
     */
    @Test
    public void testGame() {
        System.out.println("Game");
        GameControl instance = new GameControl();
        instance.Game();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
