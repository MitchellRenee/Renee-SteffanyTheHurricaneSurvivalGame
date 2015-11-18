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
public class HouseMap implements Serializable{
    
    //class instance variables
    private String kitchen;
    private String bedroom;
    private String bathroom;
    private String closet;
    private String basement;
    private String garage;
    private String coordinates;    

    public HouseMap() {
    }

    @Override
    public String toString() {
        return "HouseMap{" + "kitchen=" + kitchen + ", bedroom=" + bedroom + ", bathroom=" + bathroom + ", closet=" + closet + ", basement=" + basement + ", garage=" + garage + ", coordinates=" + coordinates + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.kitchen);
        hash = 79 * hash + Objects.hashCode(this.bedroom);
        hash = 79 * hash + Objects.hashCode(this.bathroom);
        hash = 79 * hash + Objects.hashCode(this.closet);
        hash = 79 * hash + Objects.hashCode(this.basement);
        hash = 79 * hash + Objects.hashCode(this.garage);
        hash = 79 * hash + Objects.hashCode(this.coordinates);
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
        final HouseMap other = (HouseMap) obj;
        if (!Objects.equals(this.kitchen, other.kitchen)) {
            return false;
        }
        if (!Objects.equals(this.bedroom, other.bedroom)) {
            return false;
        }
        if (!Objects.equals(this.bathroom, other.bathroom)) {
            return false;
        }
        if (!Objects.equals(this.closet, other.closet)) {
            return false;
        }
        if (!Objects.equals(this.basement, other.basement)) {
            return false;
        }
        if (!Objects.equals(this.garage, other.garage)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }
    
    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getBedroom() {
        return bedroom;
    }

    public void setBedroom(String bedroom) {
        this.bedroom = bedroom;
    }

    public String getBathroom() {
        return bathroom;
    }

    public void setBathroom(String bathroom) {
        this.bathroom = bathroom;
    }

    public String getCloset() {
        return closet;
    }

    public void setCloset(String closet) {
        this.closet = closet;
    }

    public String getBasement() {
        return basement;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }    
}    
    
    

   
   
    
    
    
    

