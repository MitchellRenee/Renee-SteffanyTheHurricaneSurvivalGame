/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

import byui.cit260.theHurricaneSurvivalGame.Exception.PlayerException;
import byui.cit260.theHurricaneSurvivalGame.Exception.StatusException;


/*
 *
 * @author Renee
 */
public class StatusControl {

    public int calPercentageCompletedInGame(int totalPercent, int percentRemaining, int percentCompleted)
            throws StatusException {
        if (percentCompleted < 100) { // TotalPercent must start at 100 for the beginning of the game.        
            return 0;
        }

        if (percentCompleted < 100 || totalPercent <= 100) {
            throw new StatusException("Percentage completed cannot be less than one hundred to win game.");
        }

        return percentCompleted;
    }

    public int calAmountOfResourcesCollected(int resourcesRemaining, int totalResources, int resourcesCollected)
            throws StatusException {
        if (resourcesCollected < 100) {
            return 0;
        }

        if (resourcesCollected < 100 || totalResources <= 100) {
            throw new StatusException("Completed resources cannot be less than 100 percent.");
        }
        return resourcesCollected;
    }
 
    public int calAmountOfDeliveriesRemaining (int deliveriesRemaining, int totalDeliveries, int deliveriesCompleted)  
            throws StatusException {        
        if(deliveriesCompleted < 100) {
            return 0;
        }

        if(deliveriesCompleted < 100 || totalDeliveries <= 100){
            throw new StatusException("Completed deliveries cannot be less than 100 percent.");
        }
        return deliveriesCompleted;
    }
}
        
