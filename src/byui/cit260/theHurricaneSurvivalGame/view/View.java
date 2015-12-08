/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame;

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
    public View(String message) {
        this.displayMessage = message;
    }
    private String message;

    protected final BufferedReader keyboard = TheHurricaneSurvivalGame.getInFile();
    protected final PrintWriter console = TheHurricaneSurvivalGame.getOutFile();

    //Set parameters to pass into constructor
    @Override
    public void display() {
        String value = "";
        //boolean cont;
        boolean done = false;

        do {
            this.console.println(this.displayMessage); // Print message
            value = this.getInput(); //Get the users's selection
            done = this.doAction(value); //do action base on selection
        } while (!done);
    }

    /**
     * This just gets the player's input
     *
     * @return
     */
    @Override
    public String getInput() {
        //Scanner keyboard = new Scanner(System.in); //Keyboard input stream
        boolean valid = false; // Indicates the input has been retrieved
        String selection = "";

        while (!valid) { //while a valid has not been entered

            //Prompt for the player's input
            System.out.println("Enter the input value below:");

            //Get the value entered from the keyboard and trim off the blanks at the end of value
            selection = this.keyboard.
            );
            selection = selection.trim();

            //If invalid input entered (blank value entered)
            if (selection.length() < 1) {
                ErrorView.display(this.getClass().getName(),
                        "You must enter a value.");
                continue; //and repeat again        
            }
            break;// Out of the (exit) the repetition
        }       
  
} catch (Exception e) {

    ErrorView.display(this.getClass().getName(),
                "Error reading input:" + e.getMessage());
    return null;
    }
}
