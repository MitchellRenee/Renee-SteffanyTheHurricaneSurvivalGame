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
public class BasementItemsModel implements Serializable{
      
    //class instance variables
    private String water;
    private String foodStorage;

    public BasementItemsModel() {
    }    

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getFoodStorage() {
        return foodStorage;
    }

    public void setFoodStorage(String foodStorage) {
        this.foodStorage = foodStorage;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.water);
        hash = 29 * hash + Objects.hashCode(this.foodStorage);
        return hash;
    }

    @Override
    public String toString() {
        return "BasementItemsModel{" + "water=" + water + ", foodStorage=" + foodStorage + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BasementItemsModel other = (BasementItemsModel) obj;
        if (!Objects.equals(this.water, other.water)) {
            return false;
        }
        if (!Objects.equals(this.foodStorage, other.foodStorage)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
