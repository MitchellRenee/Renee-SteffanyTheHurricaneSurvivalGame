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
/*public class TimeException extends Exception {

    
    public TimeException() {
    }

    public TimeException(String message) {
        super(message);
    }

    public TimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TimeException(Throwable cause) {
        super(cause);
    }

    public TimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }   
}
*/
//EX#2: create a method taking an argument of strings 
public class TimeException extends Exception {

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
            //ADD A FINALLY STATEMENT HERE
        }

    }

    public TimeException(String time_cannot_be_less_than_0) {
        throw new UnsupportedOperationException("Total start time cannot be less than 48 hours."); 
    }
}


    
