/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.control.ProgramControl;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author Renee
 */
public class StartProgramView {

    public StartProgramView() {
    }

    public void startProgram() {

        //Display the banner screen
        this.displayBanner();

        //Prompt the player to enter their name. Retriever the name of the player
        String playersName = this.getPlayersName();

        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        //Display a personalized welcome message
        this.displayWelcomeMessage(player);

        //Display the Main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayMenu();
    }

    private void displayBanner() {
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

    public String getPlayersName() {

        boolean valid = false; // Indicates if the name has been retrieved
        String playersName = null;
        Scanner keyboard = new Scanner(System.in); //Keyboard input stream

        while (!valid) {//while a valid name has not been retrieved

            //Prompt for the player's name
            System.out.println("Enter the player's name below:");

            //Get the name from the keyboard and trim off the blanks
            playersName = keyboard.nextLine();
            playersName = playersName.trim();

            //If the name is invalid (less than two characters in length))
            if (playersName.length() < 2) {
                System.out.println("Invalid name - the name must not be blank");
                continue; //and repeat again        
            }
            break;// Out of the (exit) the repetition
        }

        return playersName; // return the name

    }

    public void displayWelcomeMessage(Player player) {
        System.out.println("\n\n=================================================");
        System.out.println("\tWelcome to the game" + player.getName());
        System.out.println("\tDon't forget the clock is ticking, best of luck!");
        System.out.println("=====================================================");

    }

    public class MainMenuView {

        void displayMenu() {
            System.out.println("***MainMenuView.displayMenu() function called***");
        }
    }
}
