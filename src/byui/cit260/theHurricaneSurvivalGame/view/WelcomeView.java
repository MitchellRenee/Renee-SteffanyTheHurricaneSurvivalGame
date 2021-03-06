/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author Renee
 */
public class WelcomeView {

    public WelcomeView() {

    }

    public void display() {

        System.out.println("\n\n*********************************************************************************************************************");

        System.out.println("*                                                                                                                       *"
                + "\n* Welcome to The Hurricane Survival Game                                                                                 *"
                + "\n* You have just discover there's a level 8 hurricane coming, with winds up to 120 miles per hour                         *"
                + "\n* However, you are low on supplies, and need to gather enough supplies to weather out the storm                          *"
                + "\n* And to make matters interesting you have you are an emergency community voluteer and. . .                              *"
                + "\n* you just recieved a text to come in and help deliver emergency supplies to the local nursing home and prison           *"
                + "\n* Delivering supplies to the community will take up a significant amount of your time . . .                              *"
                + "\n* but,gives you the opportunity to earn money by making deliveries to both locations                                     *"
                + "\n* You have a limited budget which will not cover all purchases                                                           *"
                + "\n* You will need to visit different locations to check on your supplies, acquire more, and increase your budget           *"
                + "\n* Some locations will only require a visit to incrase a particular item, while. . .                                      *"
                + "\n* others items must be purchased which requires a visit to the stores                                                    *"
                + "\n* Be aware that there are different categories of supplie, each with survival points.                                    *"
                + "\n* To reach the required number of survival points in each category, you must acquire items specific to the category.     *"
                + "\n* Your items may already be in your inventory list, or you may need to purchase them.                                    *"
                + "\n* Once you have matched the survival points in all categories, you are prepared for Hurricane Merlin                     *"
                + "\n* Once you start the game, you'll find yourself in town, so you must make your way home to start preparing               *"
                + "\n* All of this has to be done in less than 48 hours                                                                       *"
                + "\n* The clock is ticking and there's no time to waist                                                                      *");

        System.out.println("*                                                                                                                       *"
                + "\n* Dont' forget the clock is ticking                                                                                      *"
                + "\n* Be ever vigilant                                                                                                       *"
                + "\n*                                                                                                                        *");

        System.out.println("*************************************************************************************************************************");

    }

    public String getPlayerName() {

        Scanner in = new Scanner(System.in);
        String name = "";

        while (name.length() < 2) {
            System.out.println("Please enter your name:");
            name = in.nextLine();

            if (name.length() < 2) {
                System.out.println("Please enter a name with at least 2 characters:");
            }
        }

        return name;

    }

    public void displayPlayerNameBanner(Player p) {
        //Display the banner screen
        System.out.println("*******************************");
        //Create a new player
        System.out.println("Welcome " + p.getName() + "");
        //Display a customized welcome message
        System.out.println("DISPLAY Best of Luck!");
        //
        System.out.println("DISPLAY main menu.");
        System.out.println("*******************************");
    }

    public void displayBannner(boolean MENU) {
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

            // A selection is not "Exit"
        } while (selection != 'E');

    }

    public boolean doAction(char selection) {
        try {
            switch (selection) {
                case 'M': // Display main menu
                    this.startDisplayMainMenu();
                    break;
                case 'G': // Get user's input
                    this.getInput();
                    break;
                case 'H': // Retrieve first character of string
                    this.inputCharAt(0);
                    break;
                case 'S': // Do action based on selection 
                    this.performAction();
                    break;
                case 'Q': // Quit 
                    return true;
                default:
                    System.out.println("\n*** This is an invalid selection *** Please try again");
                    break;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();

            System.out.print("Error reading input: " + e.getMessage());
            ErrorView.display(this.getClass().getName());

            return true;
        }
    }

    private String getInput() {
        System.out.println("Retrieve input.");
        return null;
    }

    private void startDisplayMainMenu() {
        System.out.println("Display main menu.");
    }

    private void inputCharAt(int i) {
        System.out.println("User.");
    }

    private void performAction() {
        System.out.println("Retrieve input.");
    }
}
