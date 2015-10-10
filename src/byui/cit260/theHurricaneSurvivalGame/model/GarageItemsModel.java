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
public class GarageItemsModel implements Serializable{
    
    //class instance variables
    private String tent;
    private String canopy;
    private String cookingStove;
    private String generator;

    public GarageItemsModel() {
    }
    
    public String getTent() {
        return tent;
    }

    public void setTent(String tent) {
        this.tent = tent;
    }

    public String getCanopy() {
        return canopy;
    }

    public void setCanopy(String canopy) {
        this.canopy = canopy;
    }

    public String getCookingStove() {
        return cookingStove;
    }

    public void setCookingStove(String cookingStove) {
        this.cookingStove = cookingStove;
    }

    public String getGenerator() {
        return generator;
    }

    public void setGenerator(String generator) {
        this.generator = generator;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.tent);
        hash = 53 * hash + Objects.hashCode(this.canopy);
        hash = 53 * hash + Objects.hashCode(this.cookingStove);
        hash = 53 * hash + Objects.hashCode(this.generator);
        return hash;
    }

    @Override
    public String toString() {
        return "GarageItemsModel{" + "tent=" + tent + ", canopy=" + canopy + ", cookingStove=" + cookingStove + ", generator=" + generator + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final GarageItemsModel other = (GarageItemsModel) obj;
        if (!Objects.equals(this.tent, other.tent)) {
            return false;
        }
        if (!Objects.equals(this.canopy, other.canopy)) {
            return false;
        }
        if (!Objects.equals(this.cookingStove, other.cookingStove)) {
            return false;
        }
        if (!Objects.equals(this.generator, other.generator)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
