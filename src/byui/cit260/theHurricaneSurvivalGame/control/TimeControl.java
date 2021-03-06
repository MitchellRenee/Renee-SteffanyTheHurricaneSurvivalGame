/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;
    /**
     * <h2>Time:</h2>
     * <p>
     * Calculate the time left in the game.</p>
     *
     * @param TimeSpent is the time spent in game
     * @param TotalTime is the total time
     * @param TimeRemaining
     * @return What is the time remaining?
     * @throws Exception.TimeException
     */
import byui.cit260.theHurricaneSurvivalGame.Exception.TimeException;

/**
 *
 * @author Steffany
 */
public class TimeControl {


    //Did not pass test

    public double calcTimeRemainingInGame(double timeSpent, double totalTime)
            throws TimeException {
        if (totalTime < 48) { // TotalTime must always be 48 hours 
            return 0;
        }

        double timeRemaining = totalTime - timeSpent;

        if (timeRemaining < 0 || timeSpent <= 0) {

            throw new TimeException("Time cannot be less than 0.");
        }
        return timeRemaining;
    }
}


