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
public class DeliverSupplies implements Serializable {

    //class instance variables
    private boolean item;
    private boolean purchased;
    private Location deliveryCenter;
    private boolean deliveryLocation;
    private double deliveryTime;

    public DeliverSupplies() {
    }
    
    public boolean isItem() {
        return item;
    }

    public void setItem(boolean item) {
        this.item = item;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public void setPurchased(boolean purchased) {
        this.purchased = purchased;
    }

    public Location getDeliveryCenter() {
        return deliveryCenter;
    }

    public void setDeliveryCenter(Location deliveryCenter) {
        this.deliveryCenter = deliveryCenter;
    }

    public boolean isDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(boolean deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }

    public double getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(double deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    @Override
    public String toString() {
        return "DeliverSupplies{" + "item=" + item + ", purchased=" + purchased + ", deliveryCenter=" + deliveryCenter + ", deliveryLocation=" + deliveryLocation + ", deliveryTime=" + deliveryTime + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + (this.item ? 1 : 0);
        hash = 19 * hash + (this.purchased ? 1 : 0);
        hash = 19 * hash + Objects.hashCode(this.deliveryCenter);
        hash = 19 * hash + (this.deliveryLocation ? 1 : 0);
        hash = 19 * hash + (int) (Double.doubleToLongBits(this.deliveryTime) ^ (Double.doubleToLongBits(this.deliveryTime) >>> 32));
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
        final DeliverSupplies other = (DeliverSupplies) obj;
        if (this.item != other.item) {
            return false;
        }
        if (this.purchased != other.purchased) {
            return false;
        }
        if (!Objects.equals(this.deliveryCenter, other.deliveryCenter)) {
            return false;
        }
        if (this.deliveryLocation != other.deliveryLocation) {
            return false;
        }
        if (Double.doubleToLongBits(this.deliveryTime) != Double.doubleToLongBits(other.deliveryTime)) {
            return false;
        }
        return true;
    }

    public double getDeliverCenterCost() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}