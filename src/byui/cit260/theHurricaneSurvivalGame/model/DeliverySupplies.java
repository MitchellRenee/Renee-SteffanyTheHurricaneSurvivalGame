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
    private String playerEntersResponse;
    private String gameMenu;
    private String deliverSupplies;
    private String chooseValidDeliveryLocation;
    private String validResponseDisplayMessage;
    private String returnToGameMenu;
    private int deliveryTime;
    private double deliverCost;

    public double getDeliverCost() {
        return deliverCost;
    }

    public void setDeliverCost(double deliverCost) {
        this.deliverCost = deliverCost;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public DeliverySupplies() {
    }

    public String getMoveToDeliveryLocation() {
        return moveToDeliveryLocation;
    }

    public void setMoveToDeliveryLocation(String moveToDeliveryLocation) {
        this.moveToDeliveryLocation = moveToDeliveryLocation;
    }

    public String getPlayerEntersResponse() {
        return playerEntersResponse;
    }

    public void setPlayerEntersResponse(String playerEntersResponse) {
        this.playerEntersResponse = playerEntersResponse;
    }

    public String getGameMenu() {
        return gameMenu;
    }

    public void setGameMenu(String gameMenu) {
        this.gameMenu = gameMenu;
    }

    public String getDeliverSupplies() {
        return deliverSupplies;
    }

    public void setDeliverSupplies(String deliverSupplies) {
        this.deliverSupplies = deliverSupplies;
    }

    public String getChooseValidDeliveryLocation() {
        return chooseValidDeliveryLocation;
    }

    public void setChooseValidDeliveryLocation(String chooseValidDeliveryLocation) {
        this.chooseValidDeliveryLocation = chooseValidDeliveryLocation;
    }

    public String getValidResponseDisplayMessage() {
        return validResponseDisplayMessage;
    }

    public void setValidResponseDisplayMessage(String validResponseDisplayMessage) {
        this.validResponseDisplayMessage = validResponseDisplayMessage;
    }

    public String getReturnToGameMenu() {
        return returnToGameMenu;
    }

    public void setReturnToGameMenu(String returnToGameMenu) {
        this.returnToGameMenu = returnToGameMenu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.moveToDeliveryLocation);
        hash = 29 * hash + Objects.hashCode(this.playerEntersResponse);
        hash = 29 * hash + Objects.hashCode(this.gameMenu);
        hash = 29 * hash + Objects.hashCode(this.deliverSupplies);
        hash = 29 * hash + Objects.hashCode(this.chooseValidDeliveryLocation);
        hash = 29 * hash + Objects.hashCode(this.validResponseDisplayMessage);
        hash = 29 * hash + Objects.hashCode(this.returnToGameMenu);
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
        if (!Objects.equals(this.playerEntersResponse, other.playerEntersResponse)) {
            return false;
        }
        if (!Objects.equals(this.gameMenu, other.gameMenu)) {
            return false;
        }
        if (!Objects.equals(this.deliverSupplies, other.deliverSupplies)) {
            return false;
        }
        if (!Objects.equals(this.chooseValidDeliveryLocation, other.chooseValidDeliveryLocation)) {
            return false;
        }
        if (!Objects.equals(this.validResponseDisplayMessage, other.validResponseDisplayMessage)) {
            return false;
        }
        return Objects.equals(this.returnToGameMenu, other.returnToGameMenu);
    }

    @Override
    public String toString() {
        return "DeliverySupplies{" + "moveToDeliveryLocation=" + moveToDeliveryLocation + ", playerEntersResponse=" + playerEntersResponse + ", gameMenu=" + gameMenu + ", deliverSupplies=" + deliverSupplies + ", chooseValidDeliveryLocation=" + chooseValidDeliveryLocation + ", validResponseDisplayMessage=" + validResponseDisplayMessage + ", returnToGameMenu=" + returnToGameMenu + '}';
    }

}
