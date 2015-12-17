/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Renee
 */
public class Item implements Serializable {

    public static boolean located() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String name;
    private double weight;
    private double survivalPoints;
    private double quantityInStock;
    private double requiredAmount;

    public Item() {
    }

    private Item(String protein, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public double getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(double quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public double getRequiredAmount() {
        return requiredAmount;
    }

    public void setRequiredAmount(double requiredAmount) {
        this.requiredAmount = requiredAmount;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", weight=" + weight + ", survivalPoints=" + survivalPoints + ", quantityInStock=" + quantityInStock + ", requiredAmount=" + requiredAmount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.name);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.weight) ^ (Double.doubleToLongBits(this.weight) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.survivalPoints) ^ (Double.doubleToLongBits(this.survivalPoints) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.quantityInStock) ^ (Double.doubleToLongBits(this.quantityInStock) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.requiredAmount) ^ (Double.doubleToLongBits(this.requiredAmount) >>> 32));
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
        if (Double.doubleToLongBits(this.quantityInStock) != Double.doubleToLongBits(other.quantityInStock)) {
            return false;
        }
        if (Double.doubleToLongBits(this.requiredAmount) != Double.doubleToLongBits(other.requiredAmount)) {
            return false;
        }
        return true;
    }

    public ArrayList<Item> addInventoryItems() {

        ArrayList<Item> inventory = new ArrayList<>();

        
        Item protein = new Item("protein", 0);
        inventory.add(protein);

        inventory.add(new Item("protein", 1));
        inventory.add(new Item("carbs", 3));
        inventory.add(new Item("toiletries", 4));
        inventory.add(new Item("overTheCounterMeds", 7));
        inventory.add(new Item("clothing", 8));
        inventory.add(new Item("blankets", 9));
        inventory.add(new Item("flashlight", 13));
        inventory.add(new Item("batteries", 15));
        
        inventory.add(1, new Item ("waterPurifierKit", 24));
        
        
        return inventory;
    }
    public void iteratesTheIndex(ArrayList<Item> inventoryItems){
        
        for (int i =0; i < inventoryItems.size(); i++){
        
            Item item = inventoryItems.get(i);
            System.out.println("\n\tItem: "  + item.getName() +
                                "\n\tQuantity: "  + item.getQuantityInStock());
        }
    }
    
}
