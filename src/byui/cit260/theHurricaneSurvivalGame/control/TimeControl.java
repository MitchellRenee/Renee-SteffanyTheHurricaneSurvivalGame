/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.control;

/**
 *
 * @author Steffany
 */
public class TimeControl {

    /**
     * <h2>Time:</h2>
     * <p>
     * Calculate the time left in the game.</p>
     *
     * @param TimeSpent is the time spent in game
     * @param TotalTime is the total time
     * @return What is the time remaining?
     */
    //Did not pass test
    public double calcTimeRemainingInGame(double TimeSpent, double TotalTime) {
        if (TotalTime < 48) { // TotalTime must always be 48 hours 
            return 0;
        }

        double TimeRemaining = TotalTime - TimeSpent;

        return TimeRemaining;
    }
}
