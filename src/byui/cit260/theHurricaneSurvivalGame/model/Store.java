/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.model;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Objects;

/**
 *
 * @author Renee
 */
public class Store implements Serializable{
    
    //class instance variables
    private double location;
    private double aisles;
    private Array items;  
    private int amount;
    private float moneyAccount;

    public Store() {
    }
    
    
    public double getLocation() {
        return location;
    }

    public void setLocation(double location) {
        this.location = location;
    }

    public double getAisles() {
        return aisles;
    }

    public void setAisles(double aisles) {
        this.aisles = aisles;
    }

    public Array getItems() {
        return items;
    }

    public void setItems(Array items) {
        this.items = items;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(float moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    @Override
    public String toString() {
        return "StoreModel{" + "location=" + location + ", aisles=" + aisles + ", items=" + items + ", amount=" + amount + ", moneyAccount=" + moneyAccount + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.location) ^ (Double.doubleToLongBits(this.location) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.aisles) ^ (Double.doubleToLongBits(this.aisles) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.items);
        hash = 29 * hash + this.amount;
        hash = 29 * hash + Float.floatToIntBits(this.moneyAccount);
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
        final Store other = (Store) obj;
        if (Double.doubleToLongBits(this.location) != Double.doubleToLongBits(other.location)) {
            return false;
        }
        if (Double.doubleToLongBits(this.aisles) != Double.doubleToLongBits(other.aisles)) {
            return false;
        }
        if (!Objects.equals(this.items, other.items)) {
            return false;
        }
        if (this.amount != other.amount) {
            return false;
        }
        if (Float.floatToIntBits(this.moneyAccount) != Float.floatToIntBits(other.moneyAccount)) {
            return false;
        }
        return true;
    }
    
    
    
    

   

    
    
}
