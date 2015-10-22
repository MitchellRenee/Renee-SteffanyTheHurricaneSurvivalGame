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
public class Player implements Serializable{

    public static boolean canMove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //class instance variable
    private String name;
    private boolean bestTime;
    private boolean playerLocation;
    private boolean items;
    private double moneyAccount;

    public Player() {
    }    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBestTime() {
        return bestTime;
    }

    public void setBestTime(boolean bestTime) {
        this.bestTime = bestTime;
    }

    public boolean isPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(boolean playerLocation) {
        this.playerLocation = playerLocation;
    }

    public boolean isItems() {
        return items;
    }

    public void setItems(boolean items) {
        this.items = items;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + (this.bestTime ? 1 : 0);
        hash = 31 * hash + (this.playerLocation ? 1 : 0);
        hash = 31 * hash + (this.items ? 1 : 0);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.moneyAccount) ^ (Double.doubleToLongBits(this.moneyAccount) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "name=" + name + ", bestTime=" + bestTime + ", playerLocation=" + playerLocation + ", items=" + items + ", moneyAccount=" + moneyAccount + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.bestTime != other.bestTime) {
            return false;
        }
        if (this.playerLocation != other.playerLocation) {
            return false;
        }
        if (this.items != other.items) {
            return false;
        }
        if (Double.doubleToLongBits(this.moneyAccount) != Double.doubleToLongBits(other.moneyAccount)) {
            return false;
        }
        return true;
    }
}    
    
    
    
    
    
    
    

    