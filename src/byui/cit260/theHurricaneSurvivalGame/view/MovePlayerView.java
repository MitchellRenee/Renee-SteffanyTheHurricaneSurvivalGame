/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.Exception.MoveException;
import static byui.cit260.theHurricaneSurvivalGame.control.CityMapControl.move;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import static java.nio.file.Files.move;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renee
 */
public abstract class MovePlayerView extends View {

    public MovePlayerView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Move Player View                     "
                + "\n------------------------------------"
                + "\nG - Start player view menu                     "
                + "\nH - Get help on how to view move"
                + "\nS - Save view menu"
                + "\nE - Exit"
                + "\n------------------------------------");
    }

    public boolean doAction(Object selection) {
        Player player;
        String value = (String)move;//action was in place of move
        value = value.toUpperCase();
        char choice = value.charAt(0);
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

    private void viewLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveNorth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveEast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveSouth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveWest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


   


