/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import static byui.cit260.theHurricaneSurvivalGame.control.PlayerControl.player;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Renee
 */
public class MapControlTest {
    
    public MapControlTest() {
    }

    /**
     * Test of move method, of class MapControl.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Player p = new Player();
        Location home = new Location();
        Location store = new Location();
        Location deliveryCenter = new Location();
        Location nursingHome = new Location();
        Location prison = new Location();        
        boolean expResult = true;
        boolean result = MapControl.move(p, home);
        assertEquals(home, p.getPlayerLocation());
        assertEquals(store, p.getPlayerLocation());
        assertEquals(deliveryCenter, p.getPlayerLocation());
        assertEquals(nursingHome, p.getPlayerLocation());
        assertEquals(prison, p.getPlayerLocation());
        assertEquals(expResult, result);
    }    
}
