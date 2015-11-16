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
    
    //class instance variables
    private String deliverWater;
    private String deliverSuppliesToNursingHome;
    private String deliverSuppliesToPrisonp;
    private String DeliveryOrder;
    private String totalTimeOfDelivery;
    private String totalCostofDelivery;

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

    public String getDeliverSuppliesToPrisonp() {
        return deliverSuppliesToPrisonp;
    }

    public void setDeliverSuppliesToPrisonp(String deliverSuppliesToPrisonp) {
        this.deliverSuppliesToPrisonp = deliverSuppliesToPrisonp;
    }

    public String getDeliveryOrder() {
        return DeliveryOrder;
    }

    public void setDeliveryOrder(String DeliveryOrder) {
        this.DeliveryOrder = DeliveryOrder;
    }

    public String getTotalTimeOfDelivery() {
        return totalTimeOfDelivery;
    }

    public void setTotalTimeOfDelivery(String totalTimeOfDelivery) {
        this.totalTimeOfDelivery = totalTimeOfDelivery;
    }

    public String getTotalCostofDelivery() {
        return totalCostofDelivery;
    }

    public void setTotalCostofDelivery(String totalCostofDelivery) {
        this.totalCostofDelivery = totalCostofDelivery;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.deliverWater);
        hash = 17 * hash + Objects.hashCode(this.deliverSuppliesToNursingHome);
        hash = 17 * hash + Objects.hashCode(this.deliverSuppliesToPrisonp);
        hash = 17 * hash + Objects.hashCode(this.DeliveryOrder);
        hash = 17 * hash + Objects.hashCode(this.totalTimeOfDelivery);
        hash = 17 * hash + Objects.hashCode(this.totalCostofDelivery);
        return hash;
    }

    @Override
    public String toString() {
        return "DeliveryCenter{" + "deliverWater=" + deliverWater + ", deliverSuppliesToNursingHome=" + deliverSuppliesToNursingHome + ", deliverSuppliesToPrisonp=" + deliverSuppliesToPrisonp + ", DeliveryOrder=" + DeliveryOrder + ", totalTimeOfDelivery=" + totalTimeOfDelivery + ", totalCostofDelivery=" + totalCostofDelivery + '}';
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
        if (!Objects.equals(this.deliverSuppliesToPrisonp, other.deliverSuppliesToPrisonp)) {
            return false;
        }
        if (!Objects.equals(this.DeliveryOrder, other.DeliveryOrder)) {
            return false;
        }
        if (!Objects.equals(this.totalTimeOfDelivery, other.totalTimeOfDelivery)) {
            return false;
        }
        if (!Objects.equals(this.totalCostofDelivery, other.totalCostofDelivery)) {
            return false;
        }
        return true;
    }

    public void setDeliverSuppliesToPrison(String yes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
    
    
}
