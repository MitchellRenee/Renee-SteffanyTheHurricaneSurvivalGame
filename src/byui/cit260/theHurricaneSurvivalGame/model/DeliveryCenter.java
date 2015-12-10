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
public class DeliveryCenter implements Serializable {

    public static boolean status(String will_have_delivery_order) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //class instance variables
    private Location deliveryToHome;
    private Location deliveryToNursingHome;
    private Location deliveryToPrison;
    private Location DeliveryOrder;
    private double totalTimeOfDelivery;
    private double totalCostofDelivery;

    private DeliverySupplies deliverySupplies;

    public DeliveryCenter() {
    }

    public Location getDeliveryToHome() {
        return deliveryToHome;
    }

    public void setDeliveryToHome(Location deliveryToHome) {
        this.deliveryToHome = deliveryToHome;
    }

    public Location getDeliveryToNursingHome() {
        return deliveryToNursingHome;
    }

    public void setDeliveryToNursingHome(Location deliveryToNursingHome) {
        this.deliveryToNursingHome = deliveryToNursingHome;
    }

    public Location getDeliveryToPrison() {
        return deliveryToPrison;
    }

    public void setDeliveryToPrison(Location deliveryToPrison) {
        this.deliveryToPrison = deliveryToPrison;
    }

    public Location getDeliveryOrder() {
        return DeliveryOrder;
    }

    public void setDeliveryOrder(Location DeliveryOrder) {
        this.DeliveryOrder = DeliveryOrder;
    }

    public double getTotalTimeOfDelivery() {
        return totalTimeOfDelivery;
    }

    public void setTotalTimeOfDelivery(double totalTimeOfDelivery) {
        this.totalTimeOfDelivery = totalTimeOfDelivery;
    }

    public double getTotalCostofDelivery() {
        return totalCostofDelivery;
    }

    public void setTotalCostofDelivery(double totalCostofDelivery) {
        this.totalCostofDelivery = totalCostofDelivery;
    }

    public DeliverySupplies getDeliverySupplies() {
        return deliverySupplies;
    }

    public void setDeliverySupplies(DeliverySupplies deliverySupplies) {
        this.deliverySupplies = deliverySupplies;
    }

    @Override
    public String toString() {
        return "DeliveryCenter{" + "deliveryToHome=" + deliveryToHome + ", deliveryToNursingHome=" + deliveryToNursingHome + ", deliveryToPrison=" + deliveryToPrison + ", DeliveryOrder=" + DeliveryOrder + ", totalTimeOfDelivery=" + totalTimeOfDelivery + ", totalCostofDelivery=" + totalCostofDelivery + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.deliveryToHome);
        hash = 41 * hash + Objects.hashCode(this.deliveryToNursingHome);
        hash = 41 * hash + Objects.hashCode(this.deliveryToPrison);
        hash = 41 * hash + Objects.hashCode(this.DeliveryOrder);
        hash = 41 * hash + Objects.hashCode(this.totalTimeOfDelivery);
        hash = 41 * hash + Objects.hashCode(this.totalCostofDelivery);
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
        if (!Objects.equals(this.deliveryToHome, other.deliveryToHome)) {
            return false;
        }
        if (!Objects.equals(this.deliveryToNursingHome, other.deliveryToNursingHome)) {
            return false;
        }
        if (!Objects.equals(this.deliveryToPrison, other.deliveryToPrison)) {
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

}
