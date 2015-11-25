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
import byui.cit260.theHurricaneSurvivalGame.control.GameControl;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import java.util.Scanner;

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
                + "\nG - Start new game                  "
                + "\nH - Get help on how to play the game"
                + "\nS - Save game                       "
                + "\nQ- Quit                             "
                + "\n------------------------------------");
        /**
         * This calls a method based on the input
         *
         * @param input
         */
    }
    
    public boolean doAction(Object obj) {

        String value = (String) obj;

        value = value.toUpperCase(); // Convert to all upper case
        char choice = value.charAt(0); // Get first character entered

        switch (choice) {
            case 'N': // Create and start a new game
                this.startNewGame();
                break;
            case 'G': // Get and start an exiting game
                this.startExistingGame();
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
    }

    private void startNewGame() {
        //Create a new game
        GameControl.createNewGame(HurricaneSurvivalGame.getInstance().getPlayer());
       
        //Display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** saveGame function called ***");
    }

    private void exitGame() {
        System.out.println("*** exit out of the game ***");
    }
 //MoveView t = new MoveView(;
    //m.display();
    //implement controllers here to change direction of view

}
