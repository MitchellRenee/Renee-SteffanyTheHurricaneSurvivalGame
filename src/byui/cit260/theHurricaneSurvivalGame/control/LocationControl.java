/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import Exception.MoveException;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import byui.cit260.theHurricaneSurvivalGame.model.Location;

/**
 *
 * @author Renee
 */
public class LocationControl {

    public boolean moveNorth(Player p, Map m) throws MoveException, MoveException {

        if (p.getLocation().getRow() == 0) {
            throw new MoveException("Player cannot move from the map");

            Location newLoc = m.getMatrix()[p.getLocation().getRow() - 1][p.getLocation().getCol()]
            {

                p.setPlayerLocation(newLoc);
        

    

    public boolean moveEast(Player p, Map m) throws MoveException, MoveException {

        if (p.getLocation().getRow() == 0) {
            throw new MoveException("Player cannot move from the map");

            Location newLoc = m.getMatrix()[p.getLocation().getRow() - 1][p.getLocation().getCol()];

            p.setPlayerLocation(newLoc);
        
     
        
    

    public boolean moveSouth(Player p, Map m) throws MoveException {
        if (p.getLocation().getRow() == 0) {
            throw new MoveException("Player can move from the map");

            Location newLoc = m.getMatrix()[p.getLocation().getRow() - 1][p.getLocation().getCol()]
            {

                p.setPlayerLocation(newLoc);
        
       
    

      

    public boolean moveWest(Player p, Map m) throws MoveException {
        if (p.getLocation().getRow() == 1) {
            throw new MoveException("Player can move from the map");

            Location newLoc = null m.getMatrix()[p.getLocation().getRow() - 1][p.getLocation().getCol()]
            {
                p.setPlayerLocation(newLoc);



