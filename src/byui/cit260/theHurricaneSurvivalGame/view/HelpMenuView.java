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
public class HelpMenuView {

    private final String MENU = "\n"
            + "\n------------------------------------"
            + "\n| Resource Menu                     "
            + "\n------------------------------------"
            + "\nG - Start resource list                     "
            + "\nH - Get help on how to inventory resource"
            + "\nS - Save resource list"
            + "\nE - Exit"
            + "\n------------------------------------";

    public String display() {
        String value;

        char selection = ' ';
        do {

            System.out.println(MENU);
            //Display the main menu

            //Then capture the character the user input
            String input = this.getInput();
            //Get user's selection
            selection = input.charAt(0);
            //Get first character of string

            this.doAction(selection);
            //Do action based on selection

        } while (selection != 'E');
        //An selection is no "Exit"

        return " ";
    }

    /**
     * This just gets the player's input
     *
     * @return
     */
    public String getInput() {

        Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        boolean valid = true;
        String input = "";

        //while a valid input has not been entered
        while (!valid) {

            //Get the input value entered from the keyboard 
            String selection = keyboard.nextLine();
            selection = selection.trim();

            //If invalid input entered (not less than one character in length))
            if (selection.length() < 1) {
                System.out.println("\n*** Invalid selection *** Please try again");
                //and repeat again 
                continue;
            }
            // Out of the (exit) repetition
            break;
        }
        String selection = "resource menu selection";

        //Return the name
        return selection;
    }

    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

/*public HelpMenuView(){
    }     
    public void displayMenu(){ 
    //super("A - About this game\n");         
    System.out.println("Please select an option:");
    System.out.println("G - What is the goal of this game?");
    System.out.println("S - How do I view supplies needed?");
    System.out.println("I - How do I view current inventory?");
    System.out.println("P - How do I view survival points earned?");
    System.out.println("M - How do I move locations?");
    System.out.println("A - How do I make money?");
    System.out.println("D - How do I deliver supplies?");
    System.out.println("B - How do I buy supplies?");
    System.out.println("V - How do I view what each location has?");
    System.out.println("X - Close Help Menu");      
    
    public char getInput(){
        
    Scanner in = new Scanner (System.in);
        
    String input = "";
    char rtn = 0;
        
    while(input.length() < 1){
    displayMenu();
    input = in.nextLine();
            
    if(input() < 1){
    System.out.println("Please select an option.");
    displayMenu();
     
            
    rtn = input.toUpperCase().charAt(0);
            
    if(rtn != 'G' || rtn != 'S' || rtn != 'I' || rtn != 'P' || rtn != 'M' || rtn != 'A' || rtn != 'D' || rtn != 'B' || rtn != 'V' || rtn != 'X'){
    System.out.println("Please select a valid menu item.");
    input = "";
            
    return rtn;
      
    public void doAction (char input){
        
    }

    private int input() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    

   
    public boolean doAction(String input) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
*/

