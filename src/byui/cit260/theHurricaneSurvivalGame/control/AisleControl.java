/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.Exception.AisleException;

import byui.cit260.theHurricaneSurvivalGame.model.Aisle;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGame;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.LocationType;

/**
 *
 * @author Renee
 */
public class AisleControl {
       
    public static int calAisle(Aisle a, int a1, int a2, int a3, int a4, int a5, int aisle) throws AisleException {
         try {
        
        if (a1 < 0 || a2 < 0 || a3 < 0 || a4 < 0 || a5 < 0) {        
            
            int returnValue = 0;
            if (a == null) {
                return 0;
            
            }   
            aisle = a.getAisle1();
            aisle = a.getAisle2();
            aisle = a.getAisle3();
            aisle = a.getAisle4();
            aisle = a.getAisle5();

            int totalAisle = a1 + a2 + a3 + a4 + a5;
            if (aisle < 1) {
                throw new AisleException("Aisle cannot be less than 1.");
          
            }
            return 0;
        }
        Aisle.calAisle(HurricaneSurvivalGame.getInstance());   
        }catch (AisleException ae) {
                System.out.println(ae.getMessage());
                return 0;
        } catch (Throwable te) { 
                System.out.println(te.getMessage());    
                te.printStackTrace();
            }finally {
                 System.out.close();    
            }   
        return 0;
        }      

    static int aisle(Aisle a, int a1, int a2, int a3, int a4, int a5, int aisle) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean valid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static boolean open() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}    

