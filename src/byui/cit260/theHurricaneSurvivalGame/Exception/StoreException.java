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
/* public class StoreException extends Exception {

   public StoreException() {
    }

    public StoreException(String message) {
        super(message);
    }

    public StoreException(String message, Throwable cause) {
        super(message, cause);
    }

    public StoreException(Throwable cause) {
        super(cause);
    }

    public StoreException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }  
*/       
 // the action of the stringList will be null 

public class StoreException extends Exception {
    
    public static void main(String args[]){
        
        // the action of the stringList will be null 
        ArrayList<String> stringList = null; 
       
        try {               
            stringList.add("Sample");
        } catch (NullPointerException nullException){     
            System.out.println("Exception: " + nullException.getMessage());//message will be null
            System.out.println("Exception: " + nullException.toString());//message will be nullPointer exception
        } finally {
            System.out.close();        
        }    
    }

    public StoreException(String cannot_move_west) {
        System.out.println("Not supported yet.");
    }
}