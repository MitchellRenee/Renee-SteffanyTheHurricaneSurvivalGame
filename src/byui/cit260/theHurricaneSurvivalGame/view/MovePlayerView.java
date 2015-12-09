/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import java.util.Scanner;

/**
 *
 * @author Steffany
 */
public abstract class MovePlayerView extends View {

     public MovePlayerView(String message) {

        super("Please make a selection:\n"
                + "N - Move North\n"
                + "E - Move East\n"
                + "S - Move South\n"
                + "W - Move West\n"
                + "I - Search for item\n"
                + "G - Save Game\n"
                + "Q - Quit to Main Menu\n");

    }

    public boolean doAction(Object selection) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
