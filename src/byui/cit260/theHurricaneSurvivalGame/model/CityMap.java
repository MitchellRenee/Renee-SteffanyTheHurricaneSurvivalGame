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
public class CityMap implements Serializable{
    
    //class instance variables
    private String megaStore;
    private String campingStore;
    private String deliveryCenter;

    public CityMap() {
    }
    
    
    

    public String getMegaStore() {
        return megaStore;
    }

    public void setMegaStore(String megaStore) {
        this.megaStore = megaStore;
    }

    public String getCampingStore() {
        return campingStore;
    }

    public void setCampingStore(String campingStore) {
        this.campingStore = campingStore;
    }

    public String getDeliveryCenter() {
        return deliveryCenter;
    }

    public void setDeliveryCenter(String deliveryCenter) {
        this.deliveryCenter = deliveryCenter;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.megaStore);
        hash = 37 * hash + Objects.hashCode(this.campingStore);
        hash = 37 * hash + Objects.hashCode(this.deliveryCenter);
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
        if (!Objects.equals(this.megaStore, other.megaStore)) {
            return false;
        }
        if (!Objects.equals(this.campingStore, other.campingStore)) {
            return false;
        }
        if (!Objects.equals(this.deliveryCenter, other.deliveryCenter)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CityMap{" + "megaStore=" + megaStore + ", campingStore=" + campingStore + ", deliveryCenter=" + deliveryCenter + '}';
    }
    
   
    
    
}
