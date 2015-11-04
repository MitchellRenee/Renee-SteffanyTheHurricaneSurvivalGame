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
    private String namePlayer;
    private boolean bestTime;
    private boolean playerLocation;
    private boolean items;
    private double moneyAccount;
    private boolean status;
    
    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String namePlayer) {
        this.namePlayer = namePlayer;
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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.bestTime ? 1 : 0);
        hash = 67 * hash + (this.playerLocation ? 1 : 0);
        hash = 67 * hash + (this.items ? 1 : 0);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.moneyAccount) ^ (Double.doubleToLongBits(this.moneyAccount) >>> 32));
        hash = 67 * hash + (this.status ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "namePlayer=" + namePlayer + ", bestTime=" + bestTime + ", playerLocation=" + playerLocation + ", items=" + items + ", moneyAccount=" + moneyAccount + ", status=" + status + '}';
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
        if (this.namePlayer != other.namePlayer) {
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
        if (this.status != other.status) {
            return false;
        }
        return true;
    }

    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setName(String playerName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    
    
  
        
   
    
    
    
    
    
    
    

    