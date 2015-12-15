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
public class HelpMenuView extends View {

    boolean display;
    private boolean MENU;

    public HelpMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Resource Menu                     "
                + "\n------------------------------------"
                + "\nG - Start resource list                     "
                + "\nH - Get help on how to inventory resource"
                + "\nS - Save resource list"
                + "\nE - Exit"
                + "\n------------------------------------");
    }

    /**
     * This just gets the player's input
     *
     * @param obj
     * @return
     */
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

            System.out.print("Error reading input: " + e.getMessage());
            ErrorView.display(this.getClass().getName());

            return true;
        }
    }

    private void startResourceList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void inventoryHelp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void saveResourceList() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void exitHelpMenu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
