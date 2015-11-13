/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import java.util.Scanner;

/**
 *
 * @author Renee
 */
public abstract class MovePlayerView {
    
    private final String VIEW;

    public MovePlayerView() {
        this.VIEW = "\n"
                + "\n------------------------------------"
                + "\n| Move Player View                     "
                + "\n------------------------------------"
                + "\nG - Start player view menu                     "
                + "\nH - Get help on how to view move"
                + "\nS - Save view menu"
                + "\nE - Exit"
                + "\n------------------------------------";
    }

    /*public void display() {
        
        char selection =  ' ';
        do {
            System.out.println(VIEW);
            //Display the player's move view menu

            //Then capture the character the user input
            String input = this.getInput();
            //Get user's selection
            selection = input.charAt(0);
            //Get first character of string
            
            this.doAction(selection);
            //Do action based on selection
           
        } while (selection != 'E');
        //An selection is no "Exit"
    }

    /**
     * This just gets the player's input
     *
     * @return
     */
      /*public String getInput() {

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
        String selection = "player view selection";

        //Return the name
        return selection;
    }
*/
    private void doAction(char selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
    

