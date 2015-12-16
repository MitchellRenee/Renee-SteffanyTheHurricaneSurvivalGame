/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.Exception.MoveException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SteffanyFaldmo
 */
/**
 * This just gets the player's input
 *
 * @param obj
 * @return
 */
public class HelpMenuView extends View {

    boolean display;
    private boolean MENU;

    public HelpMenuView() {
        super("\n"
                + "\n-----------------------------------------"
                + "\n| Help Menu                              "
                + "\n-----------------------------------------"
                + "\nG - Start help menu                      "
                + "\nH - Get help to view inventory resources "
                + "\nS - Save help menu                       "
                + "\nE - Exit                                 "
                + "\n-----------------------------------------");
    }

    
    public boolean doAction(Object obj) {
        try {

            String value = (String) obj;
            value = value.toUpperCase();
            char choice = value.charAt(0);
            switch (choice) {
                case 'G':
                    this.startResourceList();
                    break;
                case 'H':
                    this.inventoryHelp();
                    break;
                case 'S':
                    this.saveResourceList();
                    break;
                case 'E':
                    this.exitHelpMenu();
                    break;
                case 'Q':
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

    private void startResourceList() {
        System.out.println("Retrieve resource list.");
    }

    private void inventoryHelp() {
        System.out.println("View help for inventory.");
    }

    private void saveResourceList() {
        System.out.println("Save resource list.");
    }

    private void exitHelpMenu() {
        System.out.println("Exit the help menu.");
    }

    @Override
    public String getInput() {
        System.out.println("Not supported yet."); 
        return null;
    }
}
