/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;
    /**
     * <h2>Time:</h2>
     * <p>Create rooms to stock each item for inventory and resource supplies.</p>
     *
     * @param Room is where the player keeps their item storage.
     * @param Home contains rooms.
     * @param Inventory is the items already stocked in each room.
     * @param ResourceSupplies are the items that need to be purchased.
     * @return Does the room exists?
     */

import byui.cit260.theHurricaneSurvivalGame.Exception.RoomException;
import byui.cit260.theHurricaneSurvivalGame.model.Inventory;
import static byui.cit260.theHurricaneSurvivalGame.model.LocationType.Home;
import java.io.Serializable;

/**
 *
 * @author Renee
 */
public class RoomControl {
    
    
    public static boolean room(Home h, Room r,Inventory i, Supplies s) 
            throws RoomException {
        boolean returnValue = false;    
        if(h.exists() && r.open() && i.valid && s.needed ()) {
            throw new RoomException("Room cannot exists outside the home.");
        }                       
        return true;
    }    
    boolean returnValue = false;

    class Supplies {

        public Supplies() {
        }

        private boolean needed() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class Room {

        public Room() {
        }

        private boolean open() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    class Home {

        public Home() {
        }

        private boolean exists() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
