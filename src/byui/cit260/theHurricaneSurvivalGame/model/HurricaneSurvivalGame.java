/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Renee
 */
public class HurricaneSurvivalGame implements Serializable{
    
    //class instance variables
    private String accessProgram;
    private double totalTime;
    private double gameTime;

    public HurricaneSurvivalGame() {
    }
    
    
    public String getAccessProgram() {
        return accessProgram;
    }

    public void setAccessProgram(String accessProgram) {
        this.accessProgram = accessProgram;
    }

    public double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(double totalTime) {
        this.totalTime = totalTime;
    }

    public double getGameTime() {
        return gameTime;
    }

    public void setGameTime(double gameTime) {
        this.gameTime = gameTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.accessProgram);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.gameTime) ^ (Double.doubleToLongBits(this.gameTime) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "HurricaneSurvivalGameModel{" + "accessProgram=" + accessProgram + ", totalTime=" + totalTime + ", gameTime=" + gameTime + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HurricaneSurvivalGame other = (HurricaneSurvivalGame) obj;
        if (!Objects.equals(this.accessProgram, other.accessProgram)) {
            return false;
        }
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.gameTime) != Double.doubleToLongBits(other.gameTime)) {
            return false;
        }
        return true;
    }
    
    
    
}    
    