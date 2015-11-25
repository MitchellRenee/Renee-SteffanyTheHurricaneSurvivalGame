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
public class Item implements Serializable{

    public static boolean located() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String name;
    private double weight;
    private double survivalPoints;
    private String protein;

    public Item() {
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSurvivalPoints() {
        return survivalPoints;
    }

    public void setSurvivalPoints(double survivalPoints) {
        this.survivalPoints = survivalPoints;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", weight=" + weight + ", survivalPoints=" + survivalPoints + ", protein=" + protein + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.name);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.survivalPoints) ^ (Double.doubleToLongBits(this.survivalPoints) >>> 32));
        hash = 31 * hash + Objects.hashCode(this.protein);
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
        final Item other = (Item) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (Double.doubleToLongBits(this.weight) != Double.doubleToLongBits(other.weight)) {
            return false;
        }
        if (Double.doubleToLongBits(this.survivalPoints) != Double.doubleToLongBits(other.survivalPoints)) {
            return false;
        }
        if (!Objects.equals(this.protein, other.protein)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
