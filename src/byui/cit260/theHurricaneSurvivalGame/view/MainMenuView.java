/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Create a super class that contains all of the attributes and functions common
 * to in all of the group of similar classes and then inherit (or /* extend)
 * from the super class.
 *
 *
 * /* Call super constructor & pass in the String that will be the menu
 * super("Please select an option: \n" + "N - Begin new game \n" + "L - Load
 * saved game \n" + "H - View help menu \n" + "E -Exit game\n"); }
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.Exception.GameException;
import byui.cit260.theHurricaneSurvivalGame.Exception.ViewException;
import byui.cit260.theHurricaneSurvivalGame.control.GameControl;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame;

/**
 *
 * @author SteffanyFaldmo
 */
public class MainMenuView extends View {

    boolean display;
    private boolean MENU;

    public MainMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Main Menu"
                + "\n------------------------------------"
                + "\nN - Start new game                  "
                + "\nV - View player location            "
                + "\nH - Help"
                + "\nS - Save game                       "
                + "\nQ- Quit                             "
                + "\n------------------------------------");
    }

    public boolean doAction(Object obj) {
        try {

            String value = (String) obj;

            value = value.toUpperCase(); // Convert to all upper case
            char choice = value.charAt(0); // Get first character entered

            switch (choice) {
                /*case 'N': // Create and start a new game
                 this.startNewGame();
                 break;
                 */
                case 'G': // Get and start an existing game
                    this.startExistingGame();
                    break;
                case 'V': //Lets the player view the player's location
                    this.displaysPlayerLocation();
                    break;
                case 'H': // Display the help menu
                    this.displayHelpMenu();
                    break;
                case 'S': // Save the current game view 
                    this.saveGame();
                    break;
                case 'Q': // Quit the program
                    return true;
                default:
                    System.out.println("\n*** This is an invalid selection *** Please try again");
                    break;
            }
            return false;

        } catch (Exception e) {

            System.out.print("Error reading input: " + e.getMessage());
            ErrorView.display(this.getClass().getName());

            return true;
        }
    }

    private void startNewGame() {
        //Create a new game
        GameControl c = new GameControl();
        GameControl.createNewGame();

        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("\n\nEnter the file path or file where the game "
                + "is to be saved.");
        String filePath = this.getInput();

        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }

        //display game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void saveGame() {
        System.out.println("\n\nEnter the file path or file where the game "
                + "is to be saved.");
        String filePath = this.getInput();

        try {
            //save game specified file
            GameControl.saveGame(TheHurricaneSurvivalGame.getCurrentGame(), filePath);
        } catch (GameException | IOException ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {
        System.out.println("*** saveGame function called ***");
    }

    private void exitGame() {
        System.out.println("*** exit out of the game ***");
    }
   
    private void displaysPlayerLocation() {
        System.out.println("Retrieve player's location."); 
    }
}
