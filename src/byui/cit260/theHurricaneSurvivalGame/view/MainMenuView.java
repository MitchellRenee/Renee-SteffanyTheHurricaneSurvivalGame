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

    boolean displayMessage;

    public MainMenuView(String menuString) {
        super(menuString);
    }

    /**
     * Create a super class that contains all of the attributes and functions
     * common to in all of the group of similar classes and then inherit (or /*
     * extend) from the super class.
     *
     *
     * /* Call super constructor & pass in the String that will be the menu
     * super("Please select an option: \n" + "N - Begin new game \n" + "L - Load
     * saved game \n" + "H - View help menu \n" + "E -Exit game\n"); }
     */
    private final String MENU = "\n"
            //super;  
            //public MainMenuView() {
            //Error in line 32 & 33
            + "\n------------------------------------"
            + "\n| Main Menu"
            + "\n------------------------------------"
            + "\nG - Start new game                  "
            + "\nH - Get help on how to play the game"
            + "\nS - Save game                       "
            + "\nQ- Quit                             "
            + "\n------------------------------------";


    public void displayMenu() {
 //Display all of the text wanted

        //Then capture the character the user input
        String in = getInput();
        //Then perform the action
        doAction(in);
    }

    /**
     * This calls a method based on the input
     *
     * @param input
     */
    public void display() {

        char selection = ' ';
        do {

            //Display the main menu
            System.out.println(MENU);

            // Get the user's selection
            String input = this.getInput();

            // Get first character of string
            selection = input.charAt(0);

            // Do action based on selection
            this.doAction(selection);

            // An selection is not "Exit"
        } while (selection != 'E');
    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        boolean valid = true; // Indicates the input has been retrieved
        String input = "";

        while (!valid) {

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
            case 'Q': // Quit the program
                return true;
            default:
                System.out.println("\n*** This is an invalid selection *** Please try again");
                break;
        }
        return false;
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

    private void exitGame() {
        System.out.println("*** exit out of the game ***"); 
    }
      //MoveView t = new MoveView(;
        //m.display();
        //implement controllers here to change direction of view

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        
        value = value.toUpperCase();// Convert to all upper case
        char choice = value.charAt(0); // Get first charater entered
   
        //String value = " ";
        boolean done = true;
                
        do {
            System.out.println(this.displayMessage); //Print message
            value = this.getInput(); //Get the user's selection
            done = this.doAction(value); //Do action based on selection
        }
        while (!done);
        return false;
    }

    private static class value {

        private static char charAt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public value() {
        }
    }
}
