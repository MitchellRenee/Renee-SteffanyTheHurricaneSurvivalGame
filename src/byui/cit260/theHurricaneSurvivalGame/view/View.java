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
public abstract class View implements ViewInterface {
    // Asbract classes are partial classes
    // It gets the programmer partially there to a completed program
    // It gave us the display and getInput
    // Now the programmer has to implement the doAction's methods and variables.
    
    Scanner keyboard = new Scanner(System.in);
    protected String displayMessage;
    //Add the definition of class variables common to all of the view layers
      public View (String message){
          this.displayMessage = message;
      }
    private String menu;

    //Set parameters to pass into constructor
    
    

    @Override
    public void display() {
        String value = "";
        boolean cont;
        boolean done;

        do {
            System.out.println(this.displayMessage); // Print message
            value = this.getInput(); //Get the users's selection
            done = this.doAction(value); //do action base on selection
        }    
        while (!done);            
    }

    /**
     * This just gets the player's input
     *
     * @return
     */
    @Override
    public String getInput() {
        boolean valid = false; // Indicates the input has been retrieved
        String selection = "";
        //Scanner keyboard = new Scanner(System.in); //Keyboard input stream

        while (!valid) { //while a valid has not been entered

            //Prompt for the player's input
            System.out.println("Enter the input value below:");

            //Get the value entered from the keyboard and trim off the blanks at the end of value
            selection = keyboard.nextLine();
            selection = selection.trim();

            //If invalid input entered (blank value entered)
            if (selection.length() < 1) {
                System.out.println("You must enter a value.");
                continue; //and repeat again        
            }
            break;// Out of the (exit) the repetition
        }
        return selection;
    }
}
