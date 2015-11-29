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
public class ViewDeliveries implements Serializable{
    
    //class instance variables
    private String deliveryAmount;
    private String deliveryLocations;

    public ViewDeliveries() {
    }
    
    
    

    public String getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(String deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public String getDeliveryLocations() {
        return deliveryLocations;
    }

    public void setDeliveryLocations(String deliveryLocations) {
        this.deliveryLocations = deliveryLocations;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.deliveryAmount);
        hash = 79 * hash + Objects.hashCode(this.deliveryLocations);
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
        final ViewDeliveries other = (ViewDeliveries) obj;
        if (!Objects.equals(this.deliveryAmount, other.deliveryAmount)) {
            return false;
        }
        if (!Objects.equals(this.deliveryLocations, other.deliveryLocations)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ViewDeliveries{" + "deliveryAmount=" + deliveryAmount + ", deliveryLocations=" + deliveryLocations + '}';
    }
    
    
    
    
}

