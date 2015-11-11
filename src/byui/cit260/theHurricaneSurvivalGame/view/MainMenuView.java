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

        
    public String getInput() {

        boolean valid = false; // Indicates the input has been retrieved
        String input = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream

        while (!valid) { //while a valid input has not been entered

            //Prompt for the player's input
            System.out.println("Enter the input value below:");

            //Get the input value entered from the keyboard and trim off the blanks at the end of value
            input = keyboard.nextLine();
            input = input.trim();

            //If invalid input entered (not less than one character in length))
            if (input.length() < 0) {
                System.out.println("Invalid input value - the input must not be blank");
                continue; //and repeat again        
            }
            break;// Out of the (exit) the repetition
        }
        return input;
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








    

