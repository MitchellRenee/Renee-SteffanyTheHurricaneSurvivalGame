/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;


import java.io.PrintWriter;
import thehurricanesurvivalgame.TheHurricaneSurvivalGame;

/**
 *
 * @author Renee
 */
public class ErrorView {

    private static final PrintWriter errorFile = TheHurricaneSurvivalGame.getOutFile();
    private static final PrintWriter logFile = TheHurricaneSurvivalGame.getLogFile();

    public static void display(String className, String errorMessage) {
        String Message = null;

        errorFile.println(
                "---------------------------------------------"
                + "\n- ERROR - " + errorMessage
                + "\n- SUCCESS - " + Message
                + "\n-------------------------------------------");
        String successMessage = null;

        //log error
        logFile.println(className + " - " + errorMessage + successMessage);
    }

    static void display(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
