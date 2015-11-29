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
public class Harvest implements Serializable{
    
    //class instance variables
    public boolean harvestItem;
    public boolean harvestSupplies;

    public Harvest() {
    }    
    
    public boolean isHarvesttem() {
        return harvestItem;
    }

    public void setHarvesttem(boolean harvesttem) {
        this.harvestItem = harvesttem;
    }

    public boolean isHarvestSupplies() {
        return harvestSupplies;
    }

    public void setHarvestSupplies(boolean harvestSupplies) {
        this.harvestSupplies = harvestSupplies;
    }

    @Override
    public String toString() {
        return "Harvest{" + "harvesttem=" + harvestItem + ", harvestSupplies=" + harvestSupplies + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (this.harvestItem ? 1 : 0);
        hash = 29 * hash + (this.harvestSupplies ? 1 : 0);
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
        final Harvest other = (Harvest) obj;
        if (this.harvestItem != other.harvestItem) {
            return false;
        }
        if (this.harvestSupplies != other.harvestSupplies) {
            return false;
        }
        return true;
    }

      
}
