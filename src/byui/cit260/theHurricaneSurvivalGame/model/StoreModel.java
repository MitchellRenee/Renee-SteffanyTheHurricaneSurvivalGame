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
public class StoreModel implements Serializable{
    
    //class instance variables
    private String location;
    private String aisles;
    private String shelves;
    private String grabItems;
    private String buyItems;
    private String deliverItems;

    public StoreModel() {
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

    public String getShelves() {
        return shelves;
    }

    public void setShelves(String shelves) {
        this.shelves = shelves;
    }

    public String getGrabItems() {
        return grabItems;
    }

    public void setGrabItems(String grabItems) {
        this.grabItems = grabItems;
    }

    public String getBuyItems() {
        return buyItems;
    }

    public void setBuyItems(String buyItems) {
        this.buyItems = buyItems;
    }

    public String getDeliverItems() {
        return deliverItems;
    }

    public void setDeliverItems(String deliverItems) {
        this.deliverItems = deliverItems;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.location);
        hash = 29 * hash + Objects.hashCode(this.aisles);
        hash = 29 * hash + Objects.hashCode(this.shelves);
        hash = 29 * hash + Objects.hashCode(this.grabItems);
        hash = 29 * hash + Objects.hashCode(this.buyItems);
        hash = 29 * hash + Objects.hashCode(this.deliverItems);
        return hash;
    }

    @Override
    public String toString() {
        return "StoreModel{" + "location=" + location + ", aisles=" + aisles + ", shelves=" + shelves + ", grabItems=" + grabItems + ", buyItems=" + buyItems + ", deliverItems=" + deliverItems + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final StoreModel other = (StoreModel) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.aisles, other.aisles)) {
            return false;
        }
        if (!Objects.equals(this.shelves, other.shelves)) {
            return false;
        }
        if (!Objects.equals(this.grabItems, other.grabItems)) {
            return false;
        }
        if (!Objects.equals(this.buyItems, other.buyItems)) {
            return false;
        }
        if (!Objects.equals(this.deliverItems, other.deliverItems)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
