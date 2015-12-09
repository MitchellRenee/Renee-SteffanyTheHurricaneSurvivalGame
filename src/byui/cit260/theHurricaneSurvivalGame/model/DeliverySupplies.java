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
public class DeliverySupplies implements Serializable {

    //class instance variables
    private String moveToDeliveryLocation;
    private int deliveryTime;
    private double deliverCost;
    private String deliverSupplies;

    public DeliverySupplies() {
    }

    public String getMoveToDeliveryLocation() {
        return moveToDeliveryLocation;
    }

    public void setMoveToDeliveryLocation(String moveToDeliveryLocation) {
        this.moveToDeliveryLocation = moveToDeliveryLocation;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getDeliverCost() {
        return deliverCost;
    }

    public void setDeliverCost(double deliverCost) {
        this.deliverCost = deliverCost;
    }

    public String getDeliverSupplies() {
        return deliverSupplies;
    }

    public void setDeliverSupplies(String deliverSupplies) {
        this.deliverSupplies = deliverSupplies;
    }

    @Override
    public String toString() {
        return "DeliverySupplies{" + "moveToDeliveryLocation=" + moveToDeliveryLocation + ", deliveryTime=" + deliveryTime + ", deliverCost=" + deliverCost + ", deliverSupplies=" + deliverSupplies + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.moveToDeliveryLocation);
        hash = 59 * hash + this.deliveryTime;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.deliverCost) ^ (Double.doubleToLongBits(this.deliverCost) >>> 32));
        hash = 59 * hash + Objects.hashCode(this.deliverSupplies);
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
        final DeliverySupplies other = (DeliverySupplies) obj;
        if (!Objects.equals(this.moveToDeliveryLocation, other.moveToDeliveryLocation)) {
            return false;
        }
        if (this.deliveryTime != other.deliveryTime) {
            return false;
        }
        if (Double.doubleToLongBits(this.deliverCost) != Double.doubleToLongBits(other.deliverCost)) {
            return false;
        }
        if (!Objects.equals(this.deliverSupplies, other.deliverSupplies)) {
            return false;
        }
        return true;
    }

}
