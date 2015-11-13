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

    /* Call super constructor & pass in the String that will be the menu   
     super("Please select an option:\n"
     + "N - Begin new game\n"
     + "L - Load saved game\n"
     + "H - View help menu\n"
     + "E -Exit game\n");

     }

     void displayMenu() {
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
     }
     }

     /*private final String MENU = 
     */
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
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void displayMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
/*public void displayMenu() {
 //Display all of the text wanted
        
 //Then capture the character the user input
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
/*public void display() {
 String value;
        
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
        
 return " ";
 }
 */
/*@Override
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
 */

@Override
        public boolean doAction(Object obj){        

        String value = (String) obj;
        value = value.toUpperCase(); //Convert to all upper case
   
