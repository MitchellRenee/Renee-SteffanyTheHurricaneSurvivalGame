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
public class ViewInventory implements Serializable{
    
    //class instance variables
    private String viewSupplyList;

    public ViewInventory() {
    }
       

    public String getViewSupplyList() {
        return viewSupplyList;
    }

    public void setViewSupplyList(String viewSupplyList) {
        this.viewSupplyList = viewSupplyList;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.viewSupplyList);
        return hash;
    }

    @Override
    public String toString() {
        return "ViewInventoryModel{" + "viewSupplyList=" + viewSupplyList + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ViewInventory other = (ViewInventory) obj;
        if (!Objects.equals(this.viewSupplyList, other.viewSupplyList)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
