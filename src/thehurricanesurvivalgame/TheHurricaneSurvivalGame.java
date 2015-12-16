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
import byui.cit260.theHurricaneSurvivalGame.view.MainMenuView;
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

/**
 * @param args the command line arguments
 */
public class TheHurricaneSurvivalGame {

    //private static final Game currentGame = null;
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

            MainMenuView mainMenuView = new MainMenuView();
            mainMenuView.display();

        } catch (Exception e) {
           

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());

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

}
