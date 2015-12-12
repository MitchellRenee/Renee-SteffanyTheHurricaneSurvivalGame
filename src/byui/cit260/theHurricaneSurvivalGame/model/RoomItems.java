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
public class RoomItems implements Serializable {
    
    private Location home;
    private Location room;
    private Location basement;
    private Location bathroom;
    private Location bedroom;
    private Location closet;
    private Location garage;
    private Location kitchen;
    private String inventory;
    private String supplies;

    public RoomItems() {
    }  

    public Location getHome() {
        return home;
    }

    public void setHome(Location home) {
        this.home = home;
    }

    public Location getRoom() {
        return room;
    }

    public void setRoom(Location room) {
        this.room = room;
    }

    public Location getBasement() {
        return basement;
    }

    public void setBasement(Location basement) {
        this.basement = basement;
    }

    public Location getBathroom() {
        return bathroom;
    }

    public void setBathroom(Location bathroom) {
        this.bathroom = bathroom;
    }

    public Location getBedroom() {
        return bedroom;
    }

    public void setBedroom(Location bedroom) {
        this.bedroom = bedroom;
    }

    public Location getCloset() {
        return closet;
    }

    public void setCloset(Location closet) {
        this.closet = closet;
    }

    public Location getGarage() {
        return garage;
    }

    public void setGarage(Location garage) {
        this.garage = garage;
    }

    public Location getKitchen() {
        return kitchen;
    }

    public void setKitchen(Location kitchen) {
        this.kitchen = kitchen;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }

    public String getSupplies() {
        return supplies;
    }

    public void setSupplies(String supplies) {
        this.supplies = supplies;
    }

    @Override
    public String toString() {
        return "RoomItems{" + "home=" + home + ", room=" + room + ", basement=" + basement + ", bathroom=" + bathroom + ", bedroom=" + bedroom + ", closet=" + closet + ", garage=" + garage + ", kitchen=" + kitchen + ", inventory=" + inventory + ", supplies=" + supplies + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.home);
        hash = 79 * hash + Objects.hashCode(this.room);
        hash = 79 * hash + Objects.hashCode(this.basement);
        hash = 79 * hash + Objects.hashCode(this.bathroom);
        hash = 79 * hash + Objects.hashCode(this.bedroom);
        hash = 79 * hash + Objects.hashCode(this.closet);
        hash = 79 * hash + Objects.hashCode(this.garage);
        hash = 79 * hash + Objects.hashCode(this.kitchen);
        hash = 79 * hash + Objects.hashCode(this.inventory);
        hash = 79 * hash + Objects.hashCode(this.supplies);
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
        final RoomItems other = (RoomItems) obj;
        if (!Objects.equals(this.home, other.home)) {
            return false;
        }
        if (!Objects.equals(this.room, other.room)) {
            return false;
        }
        if (!Objects.equals(this.basement, other.basement)) {
            return false;
        }
        if (!Objects.equals(this.bathroom, other.bathroom)) {
            return false;
        }
        if (!Objects.equals(this.bedroom, other.bedroom)) {
            return false;
        }
        if (!Objects.equals(this.closet, other.closet)) {
            return false;
        }
        if (!Objects.equals(this.garage, other.garage)) {
            return false;
        }
        if (!Objects.equals(this.kitchen, other.kitchen)) {
            return false;
        }
        if (!Objects.equals(this.inventory, other.inventory)) {
            return false;
        }
        if (!Objects.equals(this.supplies, other.supplies)) {
            return false;
        }
        return true;
    }
    
    
}