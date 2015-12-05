/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import Exception.MoveException;
import byui.cit260.theHurricaneSurvivalGame.model.CityMap;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;

/**
 *
 * @author Renee
 */
public class MoveControl {

    public boolean moveNorth(Player p) {

        int row = p.getPlayerLocation().getRow();
        int col = p.getPlayerLocation().getColumn();

        if (row == 0) {
            return false; //HERE THROW AN EXCEPTION
        }

        CityMap gameMap = HurricaneSurvivalGame.getInstance().getMap();

        Location newLocation = gameMap.getLocation(row - 1, col);

        p.setPlayerLocation(newLocation);

        return true;
    }

    public boolean moveEast(Player p) {

        int row = p.getPlayerLocation().getRow();
        int col = p.getPlayerLocation().getColumn();

        if (col == 4) { // DONT HARDCODE
            return false; //HERE THROW AN EXCEPTION
        }

        CityMap gameMap = HurricaneSurvivalGame.getInstance().getMap();

        Location newLocation = gameMap.getLocation(row, col + 1);

        p.setPlayerLocation(newLocation);

        return true;
    }

    public boolean moveSouth(Player p) {

        int row = p.getPlayerLocation().getRow();
        int col = p.getPlayerLocation().getColumn();

        if (row == 4) { // DONT HARDCODE
            return false; //HERE THROW AN EXCEPTION
        }

        CityMap gameMap = HurricaneSurvivalGame.getInstance().getMap();

        Location newLocation = gameMap.getLocation(row + 1, col);

        p.setPlayerLocation(newLocation);

        return true;
    }

    public boolean moveWest(Player p) throws MoveException {

        int row = p.getPlayerLocation().getRow();
        int col = p.getPlayerLocation().getColumn();

        if (col == 0) { // DONT HARDCODE
            throw new MoveException("Cannot move west.");
            //HERE THROW AN EXCEPTION

        }

        CityMap gameMap = HurricaneSurvivalGame.getInstance().getMap();

        Location newLocation = gameMap.getLocation(row, col - 1);

        p.setPlayerLocation(newLocation);

        return true;
    }

}
