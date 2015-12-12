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
public class Inventory implements Serializable {

    //class instance variables
    private int countListedItems;
    private String viewSupplyList;

    public Inventory() {
    }

    public int getCountListedItems() {
        return countListedItems;
    }

    public void setCountListedItems(int countListedItems) {
        this.countListedItems = countListedItems;
    }

    public String getViewSupplyList() {
        return viewSupplyList;
    }

    public void setViewSupplyList(String viewSupplyList) {
        this.viewSupplyList = viewSupplyList;
    }

    @Override
    public String toString() {
        return "Inventory{" + "countListedItems=" + countListedItems + ", viewSupplyList=" + viewSupplyList + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.countListedItems;
        hash = 17 * hash + Objects.hashCode(this.viewSupplyList);
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
        final Inventory other = (Inventory) obj;
        if (this.countListedItems != other.countListedItems) {
            return false;
        }
        if (!Objects.equals(this.viewSupplyList, other.viewSupplyList)) {
            return false;
        }
        return true;
    }

    public static boolean valid() {
        System.out.println("Item cannot be vaild unless it is listed on the supply list.");
        return true;
    }
}
