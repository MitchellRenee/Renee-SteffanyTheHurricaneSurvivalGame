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
/*public class ProgramException extends Exception {

 public ProgramException() {
 }

 public ProgramException(String message) {
 super(message);
 }

 public ProgramException(String message, Throwable cause) {
 super(message, cause);
 }

 public ProgramException(Throwable cause) {
 super(cause);
 }

 public ProgramException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
 super(message, cause, enableSuppression, writableStackTrace);
 }
 */
public class ProgramException extends Exception {

    public static void main(String args[]) {

        // the action of the stringList will be null 
        ArrayList<String> stringList = null;

        //Another way to write line 58
        //Pass in a new array list so the the stringList is not null.
        //ArrayList<String> stringList =  new ArrayList<>();
        //pass stringList call the method
        stringList = TimeException(stringList);

        System.out.println("List: " + stringList);
    }

    public static ArrayList<String> TimeException(ArrayList<String> stringList) {

        try {
            stringList.add("Sample");
            System.out.println("No Exception");
        } catch (NullPointerException nullException) {
            stringList = new ArrayList<String>();  //The stringList is null; initialize stringList.
            stringList.add("Sample Exception");

            System.out.println("Exception");

            return null;

        //Finally always executes.    
            //add finally statement; assure program file is closed.
        } finally {
            stringList.add("Second");

            return stringList;
        }

    }

    public ProgramException(String cannot_move_west) {
        System.out.println("Not supported yet."); 
    }

}
