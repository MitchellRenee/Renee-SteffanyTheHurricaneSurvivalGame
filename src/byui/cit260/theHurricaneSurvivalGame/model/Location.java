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
public class Location implements Serializable{

    public static boolean exists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    //class instance variables
    private String displayLocations;
    private String enterLocationCoordinates;
    private String invalidCoordinates;
    private String validCoordinates;
    private String newLocationDisplaysInstructions;
    private String mainMapDisplayLocationCoordinates;
    private String row;
    private String column;
    private String visited;
    private String exists;
    private String move;

    public Location() {
    }
    
    public String getDisplayLocations() {
        return displayLocations;
    }

    public void setDisplayLocations(String displayLocations) {
        this.displayLocations = displayLocations;
    }

    public String getEnterLocationCoordinates() {
        return enterLocationCoordinates;
    }

    public void setEnterLocationCoordinates(String enterLocationCoordinates) {
        this.enterLocationCoordinates = enterLocationCoordinates;
    }

    public String getInvalidCoordinates() {
        return invalidCoordinates;
    }

    public void setInvalidCoordinates(String invalidCoordinates) {
        this.invalidCoordinates = invalidCoordinates;
    }

    public String getValidCoordinates() {
        return validCoordinates;
    }

    public void setValidCoordinates(String validCoordinates) {
        this.validCoordinates = validCoordinates;
    }

    public String getNewLocationDisplaysInstructions() {
        return newLocationDisplaysInstructions;
    }

    public void setNewLocationDisplaysInstructions(String newLocationDisplaysInstructions) {
        this.newLocationDisplaysInstructions = newLocationDisplaysInstructions;
    }

    public String getMainMapDisplayLocationCoordinates() {
        return mainMapDisplayLocationCoordinates;
    }

    public void setMainMapDisplayLocationCoordinates(String mainMapDisplayLocationCoordinates) {
        this.mainMapDisplayLocationCoordinates = mainMapDisplayLocationCoordinates;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public String getExists() {
        return exists;
    }

    public void setExists(String exists) {
        this.exists = exists;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.displayLocations);
        hash = 97 * hash + Objects.hashCode(this.enterLocationCoordinates);
        hash = 97 * hash + Objects.hashCode(this.invalidCoordinates);
        hash = 97 * hash + Objects.hashCode(this.validCoordinates);
        hash = 97 * hash + Objects.hashCode(this.newLocationDisplaysInstructions);
        hash = 97 * hash + Objects.hashCode(this.mainMapDisplayLocationCoordinates);
        hash = 97 * hash + Objects.hashCode(this.row);
        hash = 97 * hash + Objects.hashCode(this.column);
        hash = 97 * hash + Objects.hashCode(this.visited);
        hash = 97 * hash + Objects.hashCode(this.exists);
        hash = 97 * hash + Objects.hashCode(this.move);
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "displayLocations=" + displayLocations + ", enterLocationCoordinates=" + enterLocationCoordinates + ", invalidCoordinates=" + invalidCoordinates + ", validCoordinates=" + validCoordinates + ", newLocationDisplaysInstructions=" + newLocationDisplaysInstructions + ", mainMapDisplayLocationCoordinates=" + mainMapDisplayLocationCoordinates + ", row=" + row + ", column=" + column + ", visited=" + visited + ", exists=" + exists + ", move=" + move + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (!Objects.equals(this.displayLocations, other.displayLocations)) {
            return false;
        }
        if (!Objects.equals(this.enterLocationCoordinates, other.enterLocationCoordinates)) {
            return false;
        }
        if (!Objects.equals(this.invalidCoordinates, other.invalidCoordinates)) {
            return false;
        }
        if (!Objects.equals(this.validCoordinates, other.validCoordinates)) {
            return false;
        }
        if (!Objects.equals(this.newLocationDisplaysInstructions, other.newLocationDisplaysInstructions)) {
            return false;
        }
        if (!Objects.equals(this.mainMapDisplayLocationCoordinates, other.mainMapDisplayLocationCoordinates)) {
            return false;
        }
        if (!Objects.equals(this.row, other.row)) {
            return false;
        }
        if (!Objects.equals(this.column, other.column)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (!Objects.equals(this.exists, other.exists)) {
            return false;
        }
        return Objects.equals(this.move, other.move);
    }
    
}    
    

    