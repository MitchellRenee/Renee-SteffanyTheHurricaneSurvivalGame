/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.Exception;

import java.util.ArrayList;

/**
 *
 * @author Renee
 */
public class PlayerException extends Exception {

    public PlayerException() {
    }

    public PlayerException(String message) {
        super(message);
    }

    public PlayerException(String message, Throwable cause) {
        super(message, cause);
    }

    public PlayerException(Throwable cause) {
        super(cause);
    }

    public PlayerException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void main(String args[]) {

        // the action of the stringList will be null 
        ArrayList<String> stringList = new ArrayList<>();

        //pass stringList call the method
        stringList = PlayerException(stringList);

        System.out.println("List: " + stringList);
    }

    public static ArrayList<String> PlayerException(ArrayList<String> stringList) {

        try {
            stringList.add("Sample");
            System.out.println("No Exception");
        } catch (NullPointerException nullException) {
            stringList = new ArrayList<>();  //The stringList is null; initialize stringList.
            stringList.add("Sample Exception");

            System.out.println("Exception");

            return null;

        } finally {
            stringList.add("Exception #2");
            
            return stringList;
        }

    }
}
