/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.Exception.MoveException;
import byui.cit260.theHurricaneSurvivalGame.Exception.ViewException;
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

    public boolean doAction(Object move) {
        try {

            Player player;

            String value = (String) move;//action was in place of move
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
        } catch (Exception e) {
            e.printStackTrace();
            

            System.out.print("Error reading input: " + e.getMessage());
            ErrorView.display(this.getClass().getName());

            return true;
        }
    }

    private void viewLocation() {
        System.out.print("View the player's move.");
    }

    private void moveNorth() {
        System.out.print("View northward move.");
    }

    private void moveEast() {
        System.out.print("View eastward move.");
    }

    private void moveSouth() {
        System.out.print("View southward move.");
    }

    private void moveWest() {
        System.out.print("View westtward move.");
    }

    private void viewMap() {
        System.out.print("View the main map.");
    }
}
