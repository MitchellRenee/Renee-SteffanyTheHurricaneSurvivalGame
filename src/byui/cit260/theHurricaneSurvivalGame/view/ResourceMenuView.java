/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.Exception.MoveException;
import byui.cit260.theHurricaneSurvivalGame.model.Item;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame;

/**
 *
 * @author Renee
 */
public class ResourceMenuView extends View {
    
    private static final PrintWriter outFile = null;
    //private static final Buffered inFile = null;
    
    private static final PrintWriter logFile = null;

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        TheHurricaneSurvivalGame.logFile = logFile;
    }

    public ResourceMenuView(String message) {
        super(message);
    }

    //Ref pg 8
    //Link: https://content.byui.edu/file/2a20357d-883f-4256-bfe5-8297c455549b/1/Lesson%2011%20-%20Team%20Assignment.pdf
    
    //Reference pg. 9 
    //Link: https://content.byui.edu/file/2a20357d-883f-4256-bfe5-8297c455549b/1/Lesson%2011%20-%20Team%20Assignment.pdf
    //To print in Windows directory: C:\Users\Document\tmp\logfile.txt
    String filePath = "log.txt";

    //This is implemented in the main(String [] args) of Line 67-68
    //TheHurricaneSurvivalGame.logFile = new PrintWriter(filePath);
    
    //Menu Option
    public ResourceMenuView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Resource Menu                          "
                + "\n-----------------------------------------"
                + "\nG - Start resource list                  "
                + "\nH - Get help on how to inventory resource"
                + "\nS - Save resource list                   "
                + "\nE - Exit                                 "
                + "\n-----------------------------------------"); 
    }        
        /*Add code to doActon()function to
        selection the report menu option
        call a view layer function that prints the report.
        Ref pg 3
        Link: https://content.byui.edu/file/2a20357d-883f-4256-bfe5-8297c455549b/1/Lesson%2011%20-%20Individual%20Assignment.pdf
        */

        public boolean doAction(Object obj) {
        Item item;
        
        try {
        String value = (String) obj;

        value = value.toUpperCase(); // Convert to all upper case
        char choice = value.charAt(0); // Get first character entered

        switch (choice) {
            case 'N': // Create and start a new game
             this.startNewGame();
             break;             
            case 'S': // Get and start an exiting game
                this.selectReportMenu();
                break;
            case 'R': //Lets the player view the player's location
                this.displayReportMenu();
                break;
            case 'V': // Display the help menu
                this.callResourceMenuViewFunction();
                break;
            case 'D': // Save the current game view 
                this.displayResourceMenuView();
                break;
            case 'Q': // Quit the program
                return true;
            default:
                System.out.println("\n*** This is an invalid selection *** Please try again");
                break;
        }
        return false;
        
        }catch(Exception e) {
            
            System.out.print("Error reading input: " + e.getMessage());
                ErrorView.display(this.getClass().getName());
    
        return true;
    }
}    
        private void selectReportMenu() {
             System.out.println("Select report menu");
        }

        private void displayReportMenu() {
             System.out.println("View of report menu displays."); 
        }

        private void callResourceViewLayerFunction() {
              System.out.println("View of report menu displays.");
        }

        private void displayResourceViewLayer() {
             System.out.println("View of report menu displays.");
        }

        private void displayResourceMenuView() {
              System.out.println("View of report menu displays.");
        }

        private void callResourceMenuViewFunction() {
              System.out.println("View of report menu displays.");
        }

        public void write(int b) throws IOException {
             System.out.println("View of report menu displays."); 
        }

    public void printResourceMenuViewReport(ArrayList<Item> resourceItems,
                                            String outputLocaton) {
    } 

    private void startNewGame() {
        System.out.println("View of report menu displays."); 
   }
}
   


  

    
        
     
