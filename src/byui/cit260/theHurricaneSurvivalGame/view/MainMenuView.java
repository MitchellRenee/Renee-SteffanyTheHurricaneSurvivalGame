/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import java.util.Scanner;

/**
 *
 * @author SteffanyFaldmo
 */
public class MainMenuView {

    public MainMenuView() {

    }
    private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n| MainMenu"
            + "\n------------------------------------"
            + "\nG - Start game"
            + "\nH - Get help on how to play the game"
            + "\nS - Save game"
            + "\nE - Exit"
            + "\n------------------------------------";

    public void displayMenu() {

        char selection = ' ';
        do {
            //boolean MENU = false;

            System.out.println(MENU); //Display the main menu

            String input = this.getInput(); // Get the user's selection
            selection = input.charAt(0); // Get first character of string

            this.doAction(selection); // Do action based on selection

        } while (selection != 'E'); // An selection is not "Exit"
    }

    /*public void displayMenu() {

     System.out.println("Please select an option:");
     System.out.println("G - Start Game");
     System.out.println("R - Return to Game");
     System.out.println("H - How to Play");
     System.out.println("S - Save Game");
     System.out.println("X - Exit");

     }
     */
    public String getInput() {

        boolean valid = false; // Indicates the input has been retrieved
        String getInput = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream

        while (!valid) {//while a valid input has not been entered

            //Prompt for the player's input
            System.out.println("Enter the input value below:");

            //Get the input value entered from the keyboard and trim off the blanks at the end of value
            String input = keyboard.nextLine();
            input = input.trim();

            //If invalid input entered (not less than one character in length))
            if (input.length() > 0) {
                System.out.println("Invalid input value - the input must not be blank");
                continue; //and repeat again        
            }
            break;// Out of the (exit) the repetition
        }
        return null;
    }

    //public String getInput() {
    Scanner keyboard = new Scanner(System.in);
    boolean valid = false;
    String selection = null;

    // While a valid name has no been retrieved
    selection  = keyboard.nextLine();
    selection  = selection.trim();

    if (selection.length () 
        < 1){ // Blank value entered
            System.out.println("\n*** Invalid selection *** Try again");
        continue;
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

break;
        }
    return selection; // Return the name
 }

    public void doAction(char choice) {

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
            case 'E': // Exit the program
                return;
            default:
                System.out.println("\n*** This is an invalid selection *** Please try again");
                break;
        }

    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
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
}
/*After importing the GameControl and GameMenuView classes into the
 MainMenuView class, we get the cannot find symbol errors again
 because we have not created the createNewGame() and
 displayMenu() functions yet.*/

private void startNewGame(){
    // Create a new game
    int value = GameControl.createNewGame(TheHurricaneSurvivalGame.getPlayer());
    if (value < 0)}
        System.out.println ("ERROR  -  Failed to crate new game");
    }

    // Display the game menu
    GameMenuView gameMenu = new GameMenuView();
    gameMenu


}




.displayMenu();

public class GameControl {

    public static void createNewGame(Player player) {
        System.out.println("\n***createNewGame stub function called ***");
    }

    private static class Player {

        public Player() {
        }
    }

    static class Player {

        public Player() {
        }
    }
}

public class GameMenuView {

    
        void displayMenu{
            System.out.println("\n*** displayeMenu stub function called ");

    }
}
