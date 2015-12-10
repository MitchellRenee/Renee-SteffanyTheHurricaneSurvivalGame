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
/*public class RoomException extends Exception {

 public RoomException() {
 }

 public RoomException(String message) {
 super(message);
 }

 public RoomException(String message, Throwable cause) {
 super(message, cause);
 }

 public RoomException(Throwable cause) {
 super(cause);
 }

 public RoomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
 super(message, cause, enableSuppression, writableStackTrace);
 }   
 }
 */
public class RoomException extends Exception {

    public static void main(String args[]) {

        // the action of the stringList will be null 
        ArrayList<String> stringList = null;

        try {
            stringList.add("Sample");
        } catch (NullPointerException nullException) {//try/catch statement needs input parameters in the catch
            //footnote: there are a variety of options of outputs from line 26-28 and more 
            //nullException.printStackTrace();
            //System.out.println("Exception: " + nullException.getMessage());//message will be null
            System.out.println("Exception: " + nullException.toString());//message will be nullPointer exception
        }
    }
}
