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
/*public class ViewException extends  Exception {

    public ViewException() {
    }

    public ViewException(String message) {
        super(message);
    }

    public ViewException(String message, Throwable cause) {
        super(message, cause);
    }

    public ViewException(Throwable cause) {
        super(cause);
    }

    public ViewException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }    
}
*/
    public class ViewException extends Exception {
    
    public static void main(String args[]){
        
        // the action of the stringList will be null 
        ArrayList<String> stringList = null; 
       
        try {               
            stringList.add("Sample");
        } catch (NullPointerException nullException){//try/catch statement needs input parameters in the catch
            //footnote: ADD A NULLPOINTER EXCEPTION HERE
            System.out.println("Exception: " + nullException.toString());//message will be nullPointer exception
        }    
    }
}
   

