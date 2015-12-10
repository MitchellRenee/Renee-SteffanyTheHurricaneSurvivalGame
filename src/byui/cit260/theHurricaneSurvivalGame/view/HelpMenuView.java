/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import java.util.Scanner;

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
        String value = (String) obj;

        value = value.toUpperCase(); // Convert to all upper case
        char choice = value.charAt(0); // Get first character entered

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
        return true;
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
