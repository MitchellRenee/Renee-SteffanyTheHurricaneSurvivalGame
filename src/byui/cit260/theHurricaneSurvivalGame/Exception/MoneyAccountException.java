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
/*public class MoneyAccountException  extends Exception {

 public MoneyAccountException() {
 }

 public MoneyAccountException(String message) {
 super(message);
 }

 public MoneyAccountException(String message, Throwable cause) {
 super(message, cause);
 }

 public MoneyAccountException(Throwable cause) {
 super(cause);
 }

 public MoneyAccountException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
 super(message, cause, enableSuppression, writableStackTrace);
 }  
 }
 */
public class MoneyAccountException extends Exception {

    public static void main(String args[]) {

        ArrayList<String> stringList = new ArrayList<>();

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

    public MoneyAccountException(String player_cannot_buy_item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
