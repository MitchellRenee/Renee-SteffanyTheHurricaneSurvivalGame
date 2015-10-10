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
public class BedroomItemsModel implements Serializable{
    
    //class instance variables
    private String clothes;
    private String shoes;
    private String blankets;

    public BedroomItemsModel() {
    }
    
    public String getClothes() {
        return clothes;
    }

    public void setClothes(String clothes) {
        this.clothes = clothes;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

    public String getBlankets() {
        return blankets;
    }

    public void setBlankets(String blankets) {
        this.blankets = blankets;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.clothes);
        hash = 97 * hash + Objects.hashCode(this.shoes);
        hash = 97 * hash + Objects.hashCode(this.blankets);
        return hash;
    }

    @Override
    public String toString() {
        return "BedroomItemsModel{" + "clothes=" + clothes + ", shoes=" + shoes + ", blankets=" + blankets + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BedroomItemsModel other = (BedroomItemsModel) obj;
        if (!Objects.equals(this.clothes, other.clothes)) {
            return false;
        }
        if (!Objects.equals(this.shoes, other.shoes)) {
            return false;
        }
        if (!Objects.equals(this.blankets, other.blankets)) {
            return false;
        }
        return true;
    }
    
    
    
    
     
}
