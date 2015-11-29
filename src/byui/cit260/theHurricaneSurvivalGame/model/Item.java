/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.model;

import java.io.Serializable;

/**
 *
 * @author Renee
 */
public class Item implements Serializable{
    
    private String name;
    private double weight;
    private double survivalPoints;

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
    
    
    
    
    
}
