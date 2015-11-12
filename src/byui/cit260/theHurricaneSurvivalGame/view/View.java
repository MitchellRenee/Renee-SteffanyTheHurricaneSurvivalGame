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
    
    private String menu;

    //Set parameters to pass into constructor
    public View(String menuString) {
        menu = menuString;
    }

    @Override
    public void display() {
        boolean cont;

        do {
            System.out.println(menu);
        //Display all of the text wanted

            //Then capture the character the user input
            String in = getInput();
            //Then perform the action
            cont = doAction(in);
        } while (cont);
    }

    /**
     * This just gets the player's input
     *
     * @return
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
                System.out.println("Invalid input value - the input must not be blank");
                continue; //and repeat again        
            }
            break;// Out of the (exit) the repetition
        }
        return input;
    }
}
