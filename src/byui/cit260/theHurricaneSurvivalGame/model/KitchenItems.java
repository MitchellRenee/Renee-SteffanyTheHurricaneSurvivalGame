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
public class KitchenItems implements Serializable{
    
    //class instance variables
    private String protein;
    private String carbohydrates;
    private String snack;
    private String sugarySweets;

    public KitchenItems() {
    }
    
    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getSugarySweets() {
        return sugarySweets;
    }

    public void setSugarySweets(String sugarySweets) {
        this.sugarySweets = sugarySweets;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.protein);
        hash = 79 * hash + Objects.hashCode(this.carbohydrates);
        hash = 79 * hash + Objects.hashCode(this.snack);
        hash = 79 * hash + Objects.hashCode(this.sugarySweets);
        return hash;
    }

    @Override
    public String toString() {
        return "KitchenItemsModel{" + "protein=" + protein + ", carbohydrates=" + carbohydrates + ", snack=" + snack + ", sugarySweets=" + sugarySweets + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final KitchenItems other = (KitchenItems) obj;
        if (!Objects.equals(this.protein, other.protein)) {
            return false;
        }
        if (!Objects.equals(this.carbohydrates, other.carbohydrates)) {
            return false;
        }
        if (!Objects.equals(this.snack, other.snack)) {
            return false;
        }
        if (!Objects.equals(this.sugarySweets, other.sugarySweets)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
