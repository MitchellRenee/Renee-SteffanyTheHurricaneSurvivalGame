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
public class HelpMenu implements Serializable {

    //class instance variables
    private String goalOfGame;
    private String viewSuppliesNeeded;
    private String viewCurrentInventory;
    private String viewSurvivalPointsEarned;
    private String moveToLocations;
    private String makeMoney;
    private String buySupplies;
    private String deliverSupplies;
    private String viewEachLocationInventory;
    private String closeHelpMenu;

    public HelpMenu() {
    }

    public String getGoalOfGame() {
        return goalOfGame;
    }

    public void setGoalOfGame(String goalOfGame) {
        this.goalOfGame = goalOfGame;
    }

    public String getViewSuppliesNeeded() {
        return viewSuppliesNeeded;
    }

    public void setViewSuppliesNeeded(String viewSuppliesNeeded) {
        this.viewSuppliesNeeded = viewSuppliesNeeded;
    }

    public String getViewCurrentInventory() {
        return viewCurrentInventory;
    }

    public void setViewCurrentInventory(String viewCurrentInventory) {
        this.viewCurrentInventory = viewCurrentInventory;
    }

    public String getViewSurvivalPointsEarned() {
        return viewSurvivalPointsEarned;
    }

    public void setViewSurvivalPointsEarned(String viewSurvivalPointsEarned) {
        this.viewSurvivalPointsEarned = viewSurvivalPointsEarned;
    }

    public String getMoveToLocations() {
        return moveToLocations;
    }

    public void setMoveToLocations(String moveToLocations) {
        this.moveToLocations = moveToLocations;
    }

    public String getMakeMoney() {
        return makeMoney;
    }

    public void setMakeMoney(String makeMoney) {
        this.makeMoney = makeMoney;
    }

    public String getBuySupplies() {
        return buySupplies;
    }

    public void setBuySupplies(String buySupplies) {
        this.buySupplies = buySupplies;
    }

    public String getDeliverSupplies() {
        return deliverSupplies;
    }

    public void setDeliverSupplies(String deliverSupplies) {
        this.deliverSupplies = deliverSupplies;
    }

    public String getViewEachLocationInventory() {
        return viewEachLocationInventory;
    }

    public void setViewEachLocationInventory(String viewEachLocationInventory) {
        this.viewEachLocationInventory = viewEachLocationInventory;
    }

    public String getCloseHelpMenu() {
        return closeHelpMenu;
    }

    public void setCloseHelpMenu(String closeHelpMenu) {
        this.closeHelpMenu = closeHelpMenu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.goalOfGame);
        hash = 17 * hash + Objects.hashCode(this.viewSuppliesNeeded);
        hash = 17 * hash + Objects.hashCode(this.viewCurrentInventory);
        hash = 17 * hash + Objects.hashCode(this.viewSurvivalPointsEarned);
        hash = 17 * hash + Objects.hashCode(this.moveToLocations);
        hash = 17 * hash + Objects.hashCode(this.makeMoney);
        hash = 17 * hash + Objects.hashCode(this.buySupplies);
        hash = 17 * hash + Objects.hashCode(this.deliverSupplies);
        hash = 17 * hash + Objects.hashCode(this.viewEachLocationInventory);
        hash = 17 * hash + Objects.hashCode(this.closeHelpMenu);
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
        final HelpMenu other = (HelpMenu) obj;
        if (!Objects.equals(this.goalOfGame, other.goalOfGame)) {
            return false;
        }
        if (!Objects.equals(this.viewSuppliesNeeded, other.viewSuppliesNeeded)) {
            return false;
        }
        if (!Objects.equals(this.viewCurrentInventory, other.viewCurrentInventory)) {
            return false;
        }
        if (!Objects.equals(this.viewSurvivalPointsEarned, other.viewSurvivalPointsEarned)) {
            return false;
        }
        if (!Objects.equals(this.moveToLocations, other.moveToLocations)) {
            return false;
        }
        if (!Objects.equals(this.makeMoney, other.makeMoney)) {
            return false;
        }
        if (!Objects.equals(this.buySupplies, other.buySupplies)) {
            return false;
        }
        if (!Objects.equals(this.deliverSupplies, other.deliverSupplies)) {
            return false;
        }
        if (!Objects.equals(this.viewEachLocationInventory, other.viewEachLocationInventory)) {
            return false;
        }
        if (!Objects.equals(this.closeHelpMenu, other.closeHelpMenu)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "HelpMenu{" + "goalOfGame=" + goalOfGame + ", viewSuppliesNeeded=" + viewSuppliesNeeded + ", viewCurrentInventory=" + viewCurrentInventory + ", viewSurvivalPointsEarned=" + viewSurvivalPointsEarned + ", moveToLocations=" + moveToLocations + ", makeMoney=" + makeMoney + ", buySupplies=" + buySupplies + ", deliverSupplies=" + deliverSupplies + ", viewEachLocationInventory=" + viewEachLocationInventory + ", closeHelpMenu=" + closeHelpMenu + '}';
    }

}
