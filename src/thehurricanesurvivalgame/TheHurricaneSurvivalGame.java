
package thehurricanesurvivalgame;

import byui.cit260.theHurricaneSurvivalGame.model.CampingStoreModel;
import byui.cit260.theHurricaneSurvivalGame.model.HurricaneSurvivalGameModel;
import byui.cit260.theHurricaneSurvivalGame.model.MapModel;

/**
 *
 * @author SteffanyFaldmo
 */
public class TheHurricaneSurvivalGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MapModel mainMap = new MapModel();
            
        mainMap.setLocation("House");
        mainMap.setCoordinates(7);
            
        String mapInfo = mainMap.toString();
        System.out.println(mainMap);
        
        
        CampingStoreModel department = new CampingStoreModel();
        
        department.setTentAndCanopyAisle("Aisle 2");
        department.setLightingAisle("Aisle 5");
        department.setCookingSupplyAisle("Aisle 1");
        department.setGearAisle("Aisle 4");
        department.setGeneratorsAisle("Aisle 3");
        
        String campingStoreInfo = department.toString();
        System.out.println(campingStoreInfo);
        
        HurricaneSurvivalGameModel access = new HurricaneSurvivalGameModel();
        
        access.setAccessProgram("Computer starts game program");
        access.setTotalTime(12);
        access.setGameTime(48);
        
        String hurricaneSurvivalGameInfo = access.toString();
        System.out.println(hurricaneSurvivalGameInfo);
        
        
        
        
        
        
         }  
    }
    
    
