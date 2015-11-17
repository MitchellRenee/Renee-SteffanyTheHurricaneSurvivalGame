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
    public void display() {
        String value;

        do {

            //Display the prompt message
            System.out.println(this.MENU);

            // Get the user's selection
            value = this.getInput();

            // Do action based on selection
            this.doAction(value);

            // An selection is not "Exit"
        } while (!value.equals("Q"));
    }

    @Override
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        boolean valid = true; // Indicates the input has been retrieved
        String selection = "";

        while (!valid) {

            //Prompt for the player's name
            System.out.println("Enter your selection below:");

            //Get the input value entered from the keyboard 
            selection = keyboard.nextLine();
            selection = selection.trim();

            //If invalid input entered (not less than one character in length))
            if (selection.length() < 1) { //Blank value entered
                System.out.println("Invalid selection - try again");
                continue; //and repeat again        
            }
            break;// Out of the (exit) the repetition
        }
        return selection;
    }

    private void doAction(char selection) {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*public boolean doAction(char choice) {

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
 }*/
