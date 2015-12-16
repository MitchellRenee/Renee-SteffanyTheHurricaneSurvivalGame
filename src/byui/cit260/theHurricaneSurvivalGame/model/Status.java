/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.model;

import java.io.Serializable;

/**
 *
 * @author Renee
 */
public class Status implements Serializable{
    
    private int totalPercent;
    private int percentCompleted;
    private int percentRemaining;

    public Status() {
    }
    
    public int getTotalPercent() {
        return totalPercent;
    }

    public void setTotalPercent(int totalPercent) {
        this.totalPercent = totalPercent;
    }

    public int getPercentCompleted() {
        return percentCompleted;
    }

    public void setPercentCompleted(int percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    public int getPercentRemaining() {
        return percentRemaining;
    }

    public void setPercentRemaining(int percentRemaining) {
        this.percentRemaining = percentRemaining;
    }

    @Override
    public String toString() {
        return "Status{" + "totalPercent=" + totalPercent + ", percentCompleted=" + percentCompleted + ", percentRemaining=" + percentRemaining + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.totalPercent;
        hash = 11 * hash + this.percentCompleted;
        hash = 11 * hash + this.percentRemaining;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Status other = (Status) obj;
        if (this.totalPercent != other.totalPercent) {
            return false;
        }
        if (this.percentCompleted != other.percentCompleted) {
            return false;
        }
        if (this.percentRemaining != other.percentRemaining) {
            return false;
        }
        return true;
    }
    
    
    
    
}
