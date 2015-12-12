package thehurricanesurvivalgame;

import byui.cit260.theHurricaneSurvivalGame.control.GameControl;
import static byui.cit260.theHurricaneSurvivalGame.control.GameControl.createNewGame;
import static byui.cit260.theHurricaneSurvivalGame.control.PlayerControl.player;
import byui.cit260.theHurricaneSurvivalGame.control.ProgramControl;
import byui.cit260.theHurricaneSurvivalGame.model.CityMap;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Item;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import byui.cit260.theHurricaneSurvivalGame.view.StartProgramView;
import byui.cit260.theHurricaneSurvivalGame.view.WelcomeView;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame.MainMenuView;

/**
 * @param args the command line arguments
 */
public class TheHurricaneSurvivalGame {

    private static final Game currentGame = null;
    private static final Location location = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    public static PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    //Ex: of output stream
    //ref pg 8
    public static void setLogFile(PrintWriter logFile) {
        TheHurricaneSurvivalGame.logFile = logFile;
        //The output stream is assigned to the log file instance variable here.
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        TheHurricaneSurvivalGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        TheHurricaneSurvivalGame.inFile = inFile;
    }

    private static final Player player = null;

    public static void main(String[] args) {

        try {
            TheHurricaneSurvivalGame.inFile = new BufferedReader(new InputStreamReader(System.in));

            TheHurricaneSurvivalGame.outFile = new PrintWriter(System.out, true);

            String filePath = "log.txt";
            TheHurricaneSurvivalGame.logFile = new PrintWriter(filePath);
            //overload constructor allows you to pass in the file path of the file that is being written to.
            //This is the file path it can be change to a different directory
            //C:\Users\Documents\tmp\logfile.txt (Windows)

            StartProgramView startProgramView = new StartProgramView();
            startProgramView.display();

        } catch (Exception e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

            e.printStackTrace();
        } finally {
            try {
                if (TheHurricaneSurvivalGame.inFile != null) {
                    TheHurricaneSurvivalGame.inFile.close();
                }

                if (TheHurricaneSurvivalGame.outFile != null) {
                    TheHurricaneSurvivalGame.outFile.close();
                }

                if (TheHurricaneSurvivalGame.logFile != null) {
                    TheHurricaneSurvivalGame.logFile.close();
                }

                //Ref pg 9
                //Link: https://content.byui.edu/file/2a20357d-883f-4256-bfe5-8297c455549b/1/Lesson%2011%20-%20Team%20Assignment.pdf
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
    }

    public static GameControl getCurrentGame() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //ERROR
    //Ask Steffany why is this here
    //public static void setCurrentGame(GameControl.Game game) {
    //  System.out.println("Not supported yet.");    

    public class MainMenuView {

        private final String MENU = "\n"
                + "\n------------------------------------"
                + "\n| MainMenu"
                + "\n------------------------------------"
                + "\nG - Start game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nE - Exit"
                + "\n------------------------------------";

        public void displayMenu() {

            char selection = 'S';
            do {
                boolean MENU = false;

                System.out.println(MENU); //Display the main menu

                String input = this.getInput(); // Get the user's selection
                selection = input.charAt(0); // Get first character of string

                this.doAction(selection); // Do action based on selection

            } while (selection != 'E'); // An selection is not "Exit"
        }

        public String getInput() {

            boolean valid = false; // Indicates the input has been retrieved
            String getInput = null;
            Scanner keyboard = new Scanner(System.in); //Keyboard input stream

            while (!valid) {//while a valid input has not been entered

                //Prompt for the player's input
                System.out.println("Enter the input value below:");

                //Get the input value entered from the keyboard and trim off the blanks at the end of value
                String input = keyboard.nextLine();
                input = input.trim();

                //If invalid input entered (not less than one character in length))
                if (input.length() < 1) {
                    System.out.println("Invalid input value - the input must not be blank");
                    continue; //and repeat again        
                }
                break;// Out of the (exit) the repetition
            }
            return null;
        }

        public void doAction(char choice) {

            switch (choice) {
                case 'N': // Create and start a new game
                    this.startNewGame();
                case 'G': // Get and start an exiting game
                    this.startExistingGame();
                case 'H': // Display the help menu
                    this.displayHelpMenu();
                case 'S': // Save the current game 
                    this.saveGame();
                case 'E': // Exit the program
                    return;
                default:
                    System.out.println("\n*** This is an invalid selection *** Please try again");
                    break;
            }
        }

        private void startNewGame() {
            System.out.println("*** startNewGame function called ***");
        }

        private void startExistingGame() {
            System.out.println("*** startExistingGame function called ***");
        }

        private void displayHelpMenu() {
            System.out.println("*** displayHelpMenu funtion called ***");
        }

        private void saveGame() {
            System.out.println("*** saveGame function called ***");
        }
        public static GameControl getCurrentGame() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

        public static void setCurrentGame() {
            System.out.println("Retreive current game.");
        }       

        public static Player getPlayer() {
            throw new UnsupportedOperationException("Not supported yet.");
        }     

        public static void setCurrentGame(byui.cit260.theHurricaneSurvivalGame.Game game) {
            //close the output file

        TheHurricaneSurvivalGame.setCurrentGame(game);

        }

        public static void startNewGame() {

            Game = new game.GameControl.createNewGame();

        }

        public void write(int b) throws IOException {
            System.out.println("Write to file and throw IOException if error.");
        }
        public static class setCurrentGame {

            public setCurrentGame() {
            }
        }

        private static class game {

            public game() {
            }

            private static class GameControl {

                public GameControl() {
                }
            }
        }

        private static class Create {

            public Create() {
            }
        }

        class Game {

            public Game() {
            }
        }
    }
}
