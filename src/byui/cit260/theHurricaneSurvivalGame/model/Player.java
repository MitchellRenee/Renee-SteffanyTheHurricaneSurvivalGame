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
public class Player implements Serializable {

    //class instance variable
    private String namePlayer;
    private boolean bestTime;
    private Location playerLocation;
    private boolean items;
    private double moneyAccount;
    private boolean status;
    private String description;

    public Player() {
    }

    public String getName() {
        return namePlayer;
    }

    public void setName(String namePlayer) {
        this.namePlayer = namePlayer;
    }

    public boolean isBestTime() {
        return bestTime;
    }

    public void setBestTime(boolean bestTime) {
        this.bestTime = bestTime;
    }

    public Location getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(Location playerLocation) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.namePlayer);
        hash = 67 * hash + (this.bestTime ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.playerLocation);
        hash = 67 * hash + (this.items ? 1 : 0);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.moneyAccount) ^ (Double.doubleToLongBits(this.moneyAccount) >>> 32));
        hash = 67 * hash + (this.status ? 1 : 0);
        hash = 67 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "namePlayer=" + namePlayer + ", bestTime=" + bestTime + ", playerLocation=" + playerLocation + ", items=" + items + ", moneyAccount=" + moneyAccount + ", status=" + status + ", description=" + description + '}';
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
        if (!Objects.equals(this.namePlayer, other.namePlayer)) {
            return false;
        }
        if (this.bestTime != other.bestTime) {
            return false;
        }
        if (!Objects.equals(this.playerLocation, other.playerLocation)) {
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
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
        //To change body of generated methods, choose Tools | Templates.
    }

    public Object getLocation() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public void setLocation(Location newLoc) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public static boolean move() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    public static boolean exists() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }    
}
    