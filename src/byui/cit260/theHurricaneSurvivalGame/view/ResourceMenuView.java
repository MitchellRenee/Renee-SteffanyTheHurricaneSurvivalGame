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
public class ResourceMenuView extends View {

    public ResourceMenuView() {
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

    public boolean doAction(Object selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
