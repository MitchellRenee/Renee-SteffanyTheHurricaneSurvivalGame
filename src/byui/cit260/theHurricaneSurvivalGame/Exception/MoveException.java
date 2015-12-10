/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.Exception;

import java.util.ArrayList;

import byui.cit260.theHurricaneSurvivalGame.Exception.MoveException;

public class MoveException extends Exception {

    public static void main(String args[]) {

        // the action of the stringList will be null 
        ArrayList<String> stringList = null;

        //Another way to write line 58
        //Pass in a new array list so the the stringList is not null.
        //ArrayList<String> stringList =  new ArrayList<>();
        //pass stringList call the method
        stringList = MoveException(stringList);

        System.out.println("List: " + stringList);
    }

    public static ArrayList<String> MoveException(ArrayList<String> stringList) {

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

    public MoveException(String player_cannot_leave_map_locaation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean getMessag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  

    public MoveException() {
       
    }
}
   

/**
 *
 * @author Renee
 */
/*public class MoveException extends Exception {

 public MoveException() {
 }

 public MoveException(String message) {
 super(message);
 }

 public MoveException(String message, Throwable cause) {
 super(message, cause);
 }

 public MoveException(Throwable cause) {
 super(cause);
 }

 public MoveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
 super(message, cause, enableSuppression, writableStackTrace);
 }
 */