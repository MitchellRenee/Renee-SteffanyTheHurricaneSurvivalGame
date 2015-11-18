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
 * @author SteffanyFaldmo
 */
public class Map implements Serializable{
    
    //class instance variables
    private String location;
    private double coordinates;
    private String houseLocation;
    private String megaStore;
    private String deliveryCenter;
    private String nursingHome;
    private String prison;

    public Map() {
    }   
    @Override
    public String toString() {
        return "map{" + "location=" + location + ", coordinates=" + coordinates + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.location);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.coordinates) ^ (Double.doubleToLongBits(this.coordinates) >>> 32));
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
        final Map other = (Map) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        return Double.doubleToLongBits(this.coordinates) == Double.doubleToLongBits(other.coordinates);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double coordinates) {
        this.coordinates = coordinates;
    }

    public String getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(String houseLocation) {
        this.houseLocation = houseLocation;
    }

    public String getMegaStore() {
        return megaStore;
    }

    public void setMegaStore(String megaStore) {
        this.megaStore = megaStore;
    }

    public String getDeliveryCenter() {
        return deliveryCenter;
    }

    public void setDeliveryCenter(String deliveryCenter) {
        this.deliveryCenter = deliveryCenter;
    }

    public String getNursingHome() {
        return nursingHome;
    }

    public void setNursingHome(String nursingHome) {
        this.nursingHome = nursingHome;
    }

    public String getPrison() {
        return prison;
    }

    public void setPrison(String prison) {
        this.prison = prison;
    }    
    
}
