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
public class GameMenu implements Serializable {

    //class instance variables
    private double mapOfTown;
    private String supplyList;
    private String inventoryList;
    private Location newLocation;
    private double deliverSupplies;
    private String viewDeliveries;
    private String whatLocationHas;
    private double moneyAccount;
    private double survivalPointsEarned;
    private double timeBeforeHurricane;
    private String help;
    private String mainMenu;

    public GameMenu() {
    }

    public double getMapOfTown() {
        return mapOfTown;
    }

    public void setMapOfTown(double mapOfTown) {
        this.mapOfTown = mapOfTown;
    }

    public String getSupplyList() {
        return supplyList;
    }

    public void setSupplyList(String supplyList) {
        this.supplyList = supplyList;
    }

    public String getInventoryList() {
        return inventoryList;
    }

    public void setInventoryList(String inventoryList) {
        this.inventoryList = inventoryList;
    }

    public Location getNewLocation() {
        return newLocation;
    }

    public void setNewLocation(Location newLocation) {
        this.newLocation = newLocation;
    }

    public double getDeliverSupplies() {
        return deliverSupplies;
    }

    public void setDeliverSupplies(double deliverSupplies) {
        this.deliverSupplies = deliverSupplies;
    }

    public String getViewDeliveries() {
        return viewDeliveries;
    }

    public void setViewDeliveries(String viewDeliveries) {
        this.viewDeliveries = viewDeliveries;
    }

    public String getWhatLocationHas() {
        return whatLocationHas;
    }

    public void setWhatLocationHas(String whatLocationHas) {
        this.whatLocationHas = whatLocationHas;
    }

    public double getMoneyAccount() {
        return moneyAccount;
    }

    public void setMoneyAccount(double moneyAccount) {
        this.moneyAccount = moneyAccount;
    }

    public double getSurvivalPointsEarned() {
        return survivalPointsEarned;
    }

    public void setSurvivalPointsEarned(double survivalPointsEarned) {
        this.survivalPointsEarned = survivalPointsEarned;
    }

    public double getTimeBeforeHurricane() {
        return timeBeforeHurricane;
    }

    public void setTimeBeforeHurricane(double timeBeforeHurricane) {
        this.timeBeforeHurricane = timeBeforeHurricane;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(String mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public String toString() {
        return "GameMenu{" + "mapOfTown=" + mapOfTown + ", supplyList=" + supplyList + ", inventoryList=" + inventoryList + ", newLocation=" + newLocation + ", deliverSupplies=" + deliverSupplies + ", viewDeliveries=" + viewDeliveries + ", whatLocationHas=" + whatLocationHas + ", moneyAccount=" + moneyAccount + ", survivalPointsEarned=" + survivalPointsEarned + ", timeBeforeHurricane=" + timeBeforeHurricane + ", help=" + help + ", mainMenu=" + mainMenu + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.mapOfTown);
        hash = 11 * hash + Objects.hashCode(this.supplyList);
        hash = 11 * hash + Objects.hashCode(this.inventoryList);
        hash = 11 * hash + Objects.hashCode(this.newLocation);
        hash = 11 * hash + Objects.hashCode(this.deliverSupplies);
        hash = 11 * hash + Objects.hashCode(this.viewDeliveries);
        hash = 11 * hash + Objects.hashCode(this.whatLocationHas);
        hash = 11 * hash + Objects.hashCode(this.moneyAccount);
        hash = 11 * hash + Objects.hashCode(this.survivalPointsEarned);
        hash = 11 * hash + Objects.hashCode(this.timeBeforeHurricane);
        hash = 11 * hash + Objects.hashCode(this.help);
        hash = 11 * hash + Objects.hashCode(this.mainMenu);
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
        final GameMenu other = (GameMenu) obj;
        if (!Objects.equals(this.mapOfTown, other.mapOfTown)) {
            return false;
        }
        if (!Objects.equals(this.supplyList, other.supplyList)) {
            return false;
        }
        if (!Objects.equals(this.inventoryList, other.inventoryList)) {
            return false;
        }
        if (!Objects.equals(this.newLocation, other.newLocation)) {
            return false;
        }
        if (!Objects.equals(this.deliverSupplies, other.deliverSupplies)) {
            return false;
        }
        if (!Objects.equals(this.viewDeliveries, other.viewDeliveries)) {
            return false;
        }
        if (!Objects.equals(this.whatLocationHas, other.whatLocationHas)) {
            return false;
        }
        if (!Objects.equals(this.moneyAccount, other.moneyAccount)) {
            return false;
        }
        if (!Objects.equals(this.survivalPointsEarned, other.survivalPointsEarned)) {
            return false;
        }
        if (!Objects.equals(this.timeBeforeHurricane, other.timeBeforeHurricane)) {
            return false;
        }
        if (!Objects.equals(this.help, other.help)) {
            return false;
        }
        if (!Objects.equals(this.mainMenu, other.mainMenu)) {
            return false;
        }
        return true;
    }

}
