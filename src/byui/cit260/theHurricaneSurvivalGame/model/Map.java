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
public class Map implements Serializable {

    //class instance variables
    private Location location;
    private double coordinates;
    private Location houseLocation;
    private Location  megaStore;
    private Location  deliveryCenter;
    private Location  nursingHome;
    private Location  prison;

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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double coordinates) {
        this.coordinates = coordinates;
    }

    public Location getHouseLocation() {
        return houseLocation;
    }

    public void setHouseLocation(Location  houseLocation) {
        this.houseLocation = houseLocation;
    }

    public Location  getMegaStore() {
        return megaStore;
    }

    public void setMegaStore(Location  megaStore) {
        this.megaStore = megaStore;
    }

    public Location getDeliveryCenter() {
        return deliveryCenter;
    }

    public void setDeliveryCenter(Location  deliveryCenter) {
        this.deliveryCenter = deliveryCenter;
    }

    public Location getNursingHome() {
        return nursingHome;
    }

    public void setNursingHome(Location nursingHome) {
        this.nursingHome = nursingHome;
    }

    public Location getPrison() {
        return prison;
    }

    public void setPrison(Location prison) {
        this.prison = prison;
    }

    public Location[][] getMatrix() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
