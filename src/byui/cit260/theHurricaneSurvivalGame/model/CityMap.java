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
public class CityMap implements Serializable {

    //class instance variables
    private String home;
    private String megaStore;
    private String deliveryCenter;
    private String nursingHome;
    private String prison;
    private String coordinates;

    public CityMap() {
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
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

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "CityMap{" + "home=" + home + ", megaStore=" + megaStore + ", deliveryCenter=" + deliveryCenter + ", nursingHome=" + nursingHome + ", prison=" + prison + ", coordinates=" + coordinates + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.home);
        hash = 29 * hash + Objects.hashCode(this.megaStore);
        hash = 29 * hash + Objects.hashCode(this.deliveryCenter);
        hash = 29 * hash + Objects.hashCode(this.nursingHome);
        hash = 29 * hash + Objects.hashCode(this.prison);
        hash = 29 * hash + Objects.hashCode(this.coordinates);
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
        final CityMap other = (CityMap) obj;
        if (!Objects.equals(this.home, other.home)) {
            return false;
        }
        if (!Objects.equals(this.megaStore, other.megaStore)) {
            return false;
        }
        if (!Objects.equals(this.deliveryCenter, other.deliveryCenter)) {
            return false;
        }
        if (!Objects.equals(this.nursingHome, other.nursingHome)) {
            return false;
        }
        if (!Objects.equals(this.prison, other.prison)) {
            return false;
        }
        if (!Objects.equals(this.coordinates, other.coordinates)) {
            return false;
        }
        return true;
    }

    

}
