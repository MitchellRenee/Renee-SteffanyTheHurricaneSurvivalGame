/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.model.Item;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
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
     * Test of move method, of class GameControl.
     */
    @Test
    public void testMove() throws Exception {
        System.out.println("move");
        Player p = null;
        Location l = null;
        boolean expResult = false;
        boolean result = GameControl.move(p, l);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSavedGame method, of class GameControl.
     */
    @Test
    public void testGetSavedGame() throws Exception {
        System.out.println("getSavedGame");
        String filePath = "";
        GameControl.getSavedGame(filePath);
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
    }

    /**
     * Test of createNewGame method, of class GameControl.
     */
    @Test
    public void testCreateNewGame() {
        System.out.println("createNewGame");
        GameControl.createNewGame();
    }

    /**
     * Test of createNewPlayer method, of class GameControl.
     */
    @Test
    public void testCreateNewPlayer() {
        System.out.println("createNewPlayer");
        GameControl.createNewPlayer();
    }

    /**
     * Test of saveGame method, of class GameControl.
     */
    @Test
    public void testSaveGame_0args() {
        System.out.println("saveGame");
        GameControl.saveGame();
    }

    /**
     * Test of finishCreatePlayer method, of class GameControl.
     */
    @Test
    public void testFinishCreatePlayer() {
        System.out.println("finishCreatePlayer");
        Player expResult = null;
        Player result = GameControl.finishCreatePlayer();
        assertEquals(expResult, result);
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
    }    
}
