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
public class DeliveryException extends Exception {

    public DeliveryException() {
    }

    public DeliveryException(String message) {
        super(message);
    }

    public DeliveryException(String message, Throwable cause) {
        super(message, cause);
    }

    public DeliveryException(Throwable cause) {
        super(cause);
    }

    public DeliveryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public static void main(String args[]) {

        // the action of the stringList will be null 
        ArrayList<String> stringList = new ArrayList<>();

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
