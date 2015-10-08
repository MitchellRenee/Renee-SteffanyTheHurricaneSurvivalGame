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
public class CampingStoreModel implements Serializable {
    
    //class instance variables
    private String tentAndCanopyAisle;
    private String lightingAisle;
    private String cookingSupplyAisle;
    private String gearAisle;
    private String generatorsAisle;

    public CampingStoreModel() {
    }
    
    

    public String getTentAndCanopyAisle() {
        return tentAndCanopyAisle;
    }

    public void setTentAndCanopyAisle(String tentAndCanopyAisle) {
        this.tentAndCanopyAisle = tentAndCanopyAisle;
    }

    public String getLightingAisle() {
        return lightingAisle;
    }

    public void setLightingAisle(String lightingAisle) {
        this.lightingAisle = lightingAisle;
    }

    public String getCookingSupplyAisle() {
        return cookingSupplyAisle;
    }

    public void setCookingSupplyAisle(String cookingSupplyAisle) {
        this.cookingSupplyAisle = cookingSupplyAisle;
    }

    public String getGearAisle() {
        return gearAisle;
    }

    public void setGearAisle(String gearAisle) {
        this.gearAisle = gearAisle;
    }

    public String getGeneratorsAisle() {
        return generatorsAisle;
    }

    public void setGeneratorsAisle(String generatorsAisle) {
        this.generatorsAisle = generatorsAisle;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.tentAndCanopyAisle);
        hash = 43 * hash + Objects.hashCode(this.lightingAisle);
        hash = 43 * hash + Objects.hashCode(this.cookingSupplyAisle);
        hash = 43 * hash + Objects.hashCode(this.gearAisle);
        hash = 43 * hash + Objects.hashCode(this.generatorsAisle);
        return hash;
        
        
    }

    @Override
    public String toString() {
        return "CampingStoreModel{" + "tentAndCanopyAisle=" + tentAndCanopyAisle + ", lightingAisle=" + lightingAisle + ", cookingSupplyAisle=" + cookingSupplyAisle + ", gearAisle=" + gearAisle + ", generatorsAisle=" + generatorsAisle + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CampingStoreModel other = (CampingStoreModel) obj;
        if (!Objects.equals(this.tentAndCanopyAisle, other.tentAndCanopyAisle)) {
            return false;
        }
        if (!Objects.equals(this.lightingAisle, other.lightingAisle)) {
            return false;
        }
        if (!Objects.equals(this.cookingSupplyAisle, other.cookingSupplyAisle)) {
            return false;
        }
        if (!Objects.equals(this.gearAisle, other.gearAisle)) {
            return false;
        }
        if (!Objects.equals(this.generatorsAisle, other.generatorsAisle)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
