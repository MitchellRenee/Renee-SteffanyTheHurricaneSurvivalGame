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
//now create an nullpoint exception
public class CityMapException  extends Exception {

    public CityMapException() {
    }

    public CityMapException(String message) {
        super(message);
    }

    public CityMapException(String message, Throwable cause) {
        super(message, cause);
    }

    public CityMapException(Throwable cause) {
        super(cause);
    }

    public CityMapException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    

    public static void main(String args[]) {

        ArrayList<String> stringList = new ArrayList<>();

        stringList = mapControlException(stringList);

        System.out.println("List: " + stringList);
    }

    public static ArrayList<String> mapControlException(ArrayList<String> stringList) {

        try {
            stringList.add("Sample");

            System.out.println("No Exception");

        } catch (NullPointerException nullException) {
            /**nullException.printStackTrace();
            System.out.println("Exception: " + nullException.getMessage());
            another way to write an exception is with a String.
            System.out.println("Exception: " + nullException.toString());
            */
            stringList = new ArrayList<>();//initialize the local reference stringlist
            stringList.add("Sample Exception");

            System.out.println("Exception");

            return null;
        
        }catch (Exception e){

        } finally {
            stringList.add("Second");
    
         return stringList;
        }
    }
}

    

        
