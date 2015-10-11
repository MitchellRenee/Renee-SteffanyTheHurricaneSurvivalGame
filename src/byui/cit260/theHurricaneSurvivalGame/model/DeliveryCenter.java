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
public class DeliveryCenter implements Serializable{
    
    
    private String deliverWater;
    private String deliverSuppliesToNursingHome;
    private String deliverSuppliesToPrison;

    public DeliveryCenter() {
    }
    
    
    

    public String getDeliverWater() {
        return deliverWater;
    }

    public void setDeliverWater(String deliverWater) {
        this.deliverWater = deliverWater;
    }

    public String getDeliverSuppliesToNursingHome() {
        return deliverSuppliesToNursingHome;
    }

    public void setDeliverSuppliesToNursingHome(String deliverSuppliesToNursingHome) {
        this.deliverSuppliesToNursingHome = deliverSuppliesToNursingHome;
    }

    public String getDeliverSuppliesToPrison() {
        return deliverSuppliesToPrison;
    }

    public void setDeliverSuppliesToPrison(String deliverSuppliesToPrison) {
        this.deliverSuppliesToPrison = deliverSuppliesToPrison;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.deliverWater);
        hash = 61 * hash + Objects.hashCode(this.deliverSuppliesToNursingHome);
        hash = 61 * hash + Objects.hashCode(this.deliverSuppliesToPrison);
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
        final DeliveryCenter other = (DeliveryCenter) obj;
        if (!Objects.equals(this.deliverWater, other.deliverWater)) {
            return false;
        }
        if (!Objects.equals(this.deliverSuppliesToNursingHome, other.deliverSuppliesToNursingHome)) {
            return false;
        }
        if (!Objects.equals(this.deliverSuppliesToPrison, other.deliverSuppliesToPrison)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DeliveryCenter{" + "deliverWater=" + deliverWater + ", deliverSuppliesToNursingHome=" + deliverSuppliesToNursingHome + ", deliverSuppliesToPrison=" + deliverSuppliesToPrison + '}';
    }
    
    
    
    
}
