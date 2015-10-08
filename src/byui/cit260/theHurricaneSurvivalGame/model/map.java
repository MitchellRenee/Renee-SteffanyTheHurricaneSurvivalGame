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
public class map implements Serializable{
    
    //class instance variables
    private String location;
    private double coordinates;

    public map() {
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
        final map other = (map) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (Double.doubleToLongBits(this.coordinates) != Double.doubleToLongBits(other.coordinates)) {
            return false;
        }
        return true;
    }
    
    
}
