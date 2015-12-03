/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.control.MoveControl;
import byui.cit260.theHurricaneSurvivalGame.model.*;

/**
 *
 * @author Renee
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Game Menu                         "
                + "\n------------------------------------"
                + "\nV - View player location            "
                + "\nN - North     "
                + "\nE - East"
                + "\nS - South"
                + "\nW - West"
                + "\nM - Map"
                + "\n------------------------------------");
    }

    public boolean doAction(Object action) {
        String value = (String) action;

        value = value.toUpperCase(); // Convert to all upper case
        char choice = value.charAt(0); // Get first character entered

        switch (choice) {
            case 'V': // Create and start a new game
                this.viewLocation();
                break;
            case 'N':
                this.moveNorth();
                break;
            case 'E':
                this.moveEast();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'W':
                this.moveWest();
                break;
            case 'M':
                this.viewMap();
                break;
            default:
                System.out.println("\n*** This is an invalid selection *** Please try again");
                break;
        }
        return false;
    }

    public void viewLocation() {

        int row = HurricaneSurvivalGame.getInstance().getPlayer().getPlayerLocation().getRow();
        int col = HurricaneSurvivalGame.getInstance().getPlayer().getPlayerLocation().getColumn();

        System.out.println("Player is at: " + row + ", " + col);
        System.out.println("Which is a " + HurricaneSurvivalGame.getInstance().getPlayer().getPlayerLocation().getLocationType() + " location");
    }

    public void moveNorth() {
        MoveControl mc = new MoveControl();

        mc.moveNorth(HurricaneSurvivalGame.getInstance().getPlayer());
    }

    public void moveEast() {
        MoveControl mc = new MoveControl();

        mc.moveEast(HurricaneSurvivalGame.getInstance().getPlayer());
    }

    public void moveSouth() {
        MoveControl mc = new MoveControl();

        mc.moveSouth(HurricaneSurvivalGame.getInstance().getPlayer());
    }

    public void moveWest() {
        MoveControl mc = new MoveControl();

        mc.moveWest(HurricaneSurvivalGame.getInstance().getPlayer());
    }
    
    public void viewMap() {
        System.out.println(HurricaneSurvivalGame.getInstance().getMap().getMapDisplay());
    }

}
