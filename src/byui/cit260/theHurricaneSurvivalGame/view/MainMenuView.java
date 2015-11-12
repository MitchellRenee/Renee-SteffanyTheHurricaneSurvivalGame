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
public class MainMenuView extends View {

    public MainMenuView() {
        // Call super constructor & pass in the String that will be the menu   
        super("Please select an option:\n"
                + "N - Begin new game\n"
                + "L - Load saved game\n"
                + "H - View help menu\n"
                + "E -Exit game\n");
    }

    /*private final String MENU = "\n"
     + "\n------------------------------------"
     + "\n| MainMenu"
     + "\n------------------------------------"
     + "\nG - Start game"
     + "\nH - Get help on how to play the game"
     + "\nS - Save game"
     + "\nE - Exit"
     + "\n------------------------------------";
     */
    /*public void displayMenu() {
     //Display all of the text wanted
        
     //Then capture the character the uper input
     String in = getInput();
     //Then perform the action
     doAction(in); 
     }
     */
    /**
     * This calls a method based on the input
     *
     * @param input
     */
    /*public void displayMenu() {

     char selection = ' ';
     do {
     //boolean MENU = false;

     System.out.println(MENU); //Display the main menu

     String input = this.getInput(); // Get the user's selection
     selection = input.charAt(0); // Get first character of string

     this.doAction(selection); // Do action based on selection

     } while (selection != 'E'); // An selection is not "Exit"
     }
     */
    
    @Override
    public String getInput() {

        boolean valid = false; // Indicates the input has been retrieved
        String input = "";
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream

        while (!valid) { //while a valid input has not been entered

            //Prompt for the player's input
            System.out.println("Enter the input value below:");

            //Get the input value entered from the keyboard and trim off the blanks at the end of value
            input = keyboard.nextLine();
            input = input.trim();

            //If invalid input entered (not less than one character in length))
            if (input.length() < 1) {
            } else {
                System.out.println("Invalid input value - the input must not be blank");
                continue; //and repeat again        
            }
            break;// Out of the (exit) the repetition
        }
        return input;
    }

    public boolean doAction(char choice) {

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
                exitGame();
                return false;
            default:
                System.out.println("\n*** This is an invalid selection *** Please try again");
                break;
        }
        return true;
    }

    private void startNewGame() {
        System.out.println("*** startNewGame function called ***");
        //TurnView t = new TurnView(;
        //t.display();
        //implement controllers here to change direction of view
    
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(String input) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
