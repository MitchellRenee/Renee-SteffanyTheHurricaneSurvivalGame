
package thehurricanesurvivalgame;

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
    }
    
}