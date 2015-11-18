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
public abstract class MovePlayerView extends View {

    public MovePlayerView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Move Player View                     "
                + "\n------------------------------------"
                + "\nG - Start player view menu                     "
                + "\nH - Get help on how to view move"
                + "\nS - Save view menu"
                + "\nE - Exit"
                + "\n------------------------------------");
    }

    public boolean doAction(Object selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
