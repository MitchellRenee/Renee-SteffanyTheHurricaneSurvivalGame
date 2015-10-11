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
public class RoomList implements Serializable{
    
    
    private String kitchen;
    private String bedroom;
    private String bathroom;
    private String closet;
    private String basement;
    private String garage;

    public RoomList() {
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.kitchen);
        hash = 89 * hash + Objects.hashCode(this.bedroom);
        hash = 89 * hash + Objects.hashCode(this.bathroom);
        hash = 89 * hash + Objects.hashCode(this.closet);
        hash = 89 * hash + Objects.hashCode(this.basement);
        hash = 89 * hash + Objects.hashCode(this.garage);
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
        final RoomList other = (RoomList) obj;
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
        return true;
    }

    @Override
    public String toString() {
        return "RoomList{" + "kitchen=" + kitchen + ", bedroom=" + bedroom + ", bathroom=" + bathroom + ", closet=" + closet + ", basement=" + basement + ", garage=" + garage + '}';
    }
    
    
    
}
