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
public class CampingStore implements Serializable {
    
    //class instance variables
    private String tentAndCanopyAisle;
    private String lightingAisle;
    private String cookingSupplyAisle;
    private String gearAisle;
    private String generatorsAisle;
    private String location;
    private String aisles;
    private String storeSize;
    private String gameMenu;

    public CampingStore() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAisles() {
        return aisles;
    }

    public void setAisles(String aisles) {
        this.aisles = aisles;
    }

    public String getStoreSize() {
        return storeSize;
    }

    public void setStoreSize(String storeSize) {
        this.storeSize = storeSize;
    }

    public String getGameMenu() {
        return gameMenu;
    }

    public void setGameMenu(String gameMenu) {
        this.gameMenu = gameMenu;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.tentAndCanopyAisle);
        hash = 71 * hash + Objects.hashCode(this.lightingAisle);
        hash = 71 * hash + Objects.hashCode(this.cookingSupplyAisle);
        hash = 71 * hash + Objects.hashCode(this.gearAisle);
        hash = 71 * hash + Objects.hashCode(this.generatorsAisle);
        hash = 71 * hash + Objects.hashCode(this.location);
        hash = 71 * hash + Objects.hashCode(this.aisles);
        hash = 71 * hash + Objects.hashCode(this.storeSize);
        hash = 71 * hash + Objects.hashCode(this.gameMenu);
        return hash;
    }

    @Override
    public String toString() {
        return "CampingStoreModel{" + "tentAndCanopyAisle=" + tentAndCanopyAisle + ", lightingAisle=" + lightingAisle + ", cookingSupplyAisle=" + cookingSupplyAisle + ", gearAisle=" + gearAisle + ", generatorsAisle=" + generatorsAisle + ", location=" + location + ", aisles=" + aisles + ", storeSize=" + storeSize + ", gameMenu=" + gameMenu + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CampingStore other = (CampingStore) obj;
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
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.aisles, other.aisles)) {
            return false;
        }
        if (!Objects.equals(this.storeSize, other.storeSize)) {
            return false;
        }
        if (!Objects.equals(this.gameMenu, other.gameMenu)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
