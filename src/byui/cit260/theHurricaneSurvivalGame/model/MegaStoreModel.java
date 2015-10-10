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
public class MegaStoreModel implements Serializable{
    
    //class instance variables
    private String protien;
    private String snacks;
    private String sweets;
    private String carbs;
    private String toiletries;
    private String firstaid;
    private String clothing;
    private String blankets;
    private String water;
    private String location;
    private String aisles;
    private String storeSize;
    private String gameMenu;

    public MegaStoreModel() {
    }
    
    public String getProtien() {
        return protien;
    }

    public void setProtien(String protien) {
        this.protien = protien;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    public String getSweets() {
        return sweets;
    }

    public void setSweets(String sweets) {
        this.sweets = sweets;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public String getToiletries() {
        return toiletries;
    }

    public void setToiletries(String toiletries) {
        this.toiletries = toiletries;
    }

    public String getFirstaid() {
        return firstaid;
    }

    public void setFirstaid(String firstaid) {
        this.firstaid = firstaid;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getBlankets() {
        return blankets;
    }

    public void setBlankets(String blankets) {
        this.blankets = blankets;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
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
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.protien);
        hash = 71 * hash + Objects.hashCode(this.snacks);
        hash = 71 * hash + Objects.hashCode(this.sweets);
        hash = 71 * hash + Objects.hashCode(this.carbs);
        hash = 71 * hash + Objects.hashCode(this.toiletries);
        hash = 71 * hash + Objects.hashCode(this.firstaid);
        hash = 71 * hash + Objects.hashCode(this.clothing);
        hash = 71 * hash + Objects.hashCode(this.blankets);
        hash = 71 * hash + Objects.hashCode(this.water);
        hash = 71 * hash + Objects.hashCode(this.location);
        hash = 71 * hash + Objects.hashCode(this.aisles);
        hash = 71 * hash + Objects.hashCode(this.storeSize);
        hash = 71 * hash + Objects.hashCode(this.gameMenu);
        return hash;
    }

    @Override
    public String toString() {
        return "MegaStoreModel{" + "protien=" + protien + ", snacks=" + snacks + ", sweets=" + sweets + ", carbs=" + carbs + ", toiletries=" + toiletries + ", firstaid=" + firstaid + ", clothing=" + clothing + ", blankets=" + blankets + ", water=" + water + ", location=" + location + ", aisles=" + aisles + ", storeSize=" + storeSize + ", gameMenu=" + gameMenu + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MegaStoreModel other = (MegaStoreModel) obj;
        if (!Objects.equals(this.protien, other.protien)) {
            return false;
        }
        if (!Objects.equals(this.snacks, other.snacks)) {
            return false;
        }
        if (!Objects.equals(this.sweets, other.sweets)) {
            return false;
        }
        if (!Objects.equals(this.carbs, other.carbs)) {
            return false;
        }
        if (!Objects.equals(this.toiletries, other.toiletries)) {
            return false;
        }
        if (!Objects.equals(this.firstaid, other.firstaid)) {
            return false;
        }
        if (!Objects.equals(this.clothing, other.clothing)) {
            return false;
        }
        if (!Objects.equals(this.blankets, other.blankets)) {
            return false;
        }
        if (!Objects.equals(this.water, other.water)) {
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
