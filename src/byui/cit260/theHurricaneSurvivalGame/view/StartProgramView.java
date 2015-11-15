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
        this.display();

        //Prompt the player to enter their name. Retriever the name of the player
        String playersName = this.getPlayersName();

        //Create and save the player object
        Player player = ProgramControl.createPlayer(playersName);

        //Display a personalized welcome message
        this.displayWelcomeMessage(player);

        //Display the Main menu
        MainMenuView mainMenu = new MainMenuView(" ");

        mainMenu.display();

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
            if (playersName.length() < 1) {
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

    private void display() {
        System.out.println("display startProgramView");//??????? 
    }

    class startProgramView {

        //void displayMenu() {
        //System.out.println("***MainMenuView.displayMenu() function called***");
        private final String MENU = "\n"
                + "\n------------------------------------"
                + "\n| MainMenu"
                + "\n------------------------------------"
                + "\nG - Start game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n------------------------------------";
        private boolean displayMessage;

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

        //MoveView m = new moveView(;
        //m.display();
        //implement controllers here to change direction of view
        public boolean doAction(Object obj) {

            String value = (String) obj;

            value = value.toUpperCase();// Convert to all upper case
            char choice = value.charAt(0); // Get first charater entered

            //public boolean display() {
            //String value = " ";
            boolean done = true;

            do {
                System.out.println(this.displayMessage); //Print message
                value = this.getInput(); //Get the user's selection
                done = this.doAction(value); //Do action based on selection
            } while (!done);
            return false;
        }

        private char charAt(int i) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private void startNewGame() {
            System.out.println("*** startNewGame function called ***");
        }

        private void startExistingGame() {
            System.out.println("*** startExistingGame function called ***");
        }

        private void displayHelpMenu() {
            System.out.println("*** saveGame function called ***");
        }

        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }

        private void exitGame() {
            System.out.println("*** exit out of the game ***");
        }
    }
}