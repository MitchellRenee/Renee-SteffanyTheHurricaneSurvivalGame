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

        char selection = 'G';
        do {
            boolean MENU = false;

            System.out.println(MENU); //Display the main menu

            String input = this.getInput(); // Get the user's selection
            selection = input.charAt(0); // Get first character of string

            this.doAction(selection); // Do action based on selection

        } while (selection != 'E'); // An selection is not "Exit"
    }

    public MainMenuView() {

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

    public void doAction(char input) {

    }

    private int input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void startNewGame() {
        // Create a new game
        GameControl.createNewGame(TheHurricaneSurvivalGame());

    }

    private static class GameControl {

        public GameControl() {
        }
    }

}
