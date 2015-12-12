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
/*public class LocationException extends Exception {

 public LocationException() {
 }

 public LocationException(String message) {
 super(message);
 }

 public LocationException(String message, Throwable cause) {
 super(message, cause);
 }

 public LocationException(Throwable cause) {
 super(cause);
 }

 public LocationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
 super(message, cause, enableSuppression, writableStackTrace);
 }
 */
public class LocationException extends Exception {

    public static void main(String args[]) {

        // the action of the stringList will be null 
        ArrayList<String> stringList = new ArrayList<>();

        //pass stringList call the method
        stringList = LocationException(stringList);

        System.out.println("List: " + stringList);
    }

    public static ArrayList<String> LocationException(ArrayList<String> stringList) {

        try {
            stringList.add("Sample");
            System.out.println("No Exception");
            //ADD NULLPOINTEREXCEPTION
        } catch (NullPointerException nullException) {
            stringList = new ArrayList<>();  //The stringList is null; initialize stringList.
            stringList.add("Sample Exception");

            System.out.println("Exception");

            return null;

        } finally {
            stringList.add("No.2 Exception");
            //ADD A FINALLY STATEMENT
            return stringList;
        }

    }

    public LocationException(String player_cannot_leave_map_location) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
