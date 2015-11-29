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
    public boolean harvestInventoryItems;
    public boolean harvestInventorySupplies;

    public Harvest() {
    }
    
    public boolean isHarvestInventoryItems() {
        return harvestInventoryItems;
    }

    public void setHarvestInventoryItems(boolean harvestInventoryItems) {
        this.harvestInventoryItems = harvestInventoryItems;
    }

    public boolean isHarvestInventorySupplies() {
        return harvestInventorySupplies;
    }

    public void setHarvestInventorySupplies(boolean harvestInventorySupplies) {
        this.harvestInventorySupplies = harvestInventorySupplies;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (this.harvestInventoryItems ? 1 : 0);
        hash = 53 * hash + (this.harvestInventorySupplies ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Harvest{" + "harvestInventoryItems=" + harvestInventoryItems + ", harvestInventorySupplies=" + harvestInventorySupplies + '}';
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
        if (this.harvestInventoryItems != other.harvestInventoryItems) {
            return false;
        }
        if (this.harvestInventorySupplies != other.harvestInventorySupplies) {
            return false;
        }
        return true;
    }    
}

