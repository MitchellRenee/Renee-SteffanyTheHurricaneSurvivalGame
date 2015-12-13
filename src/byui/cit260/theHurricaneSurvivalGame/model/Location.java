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
public class Location implements Serializable {

    private int row;
    private int column;
    private Aisle aisle;
    private String visited;
    private LocationType locationType;

    private MegaStore megaStore;
    int length;

    public Location() {
    }

    public Aisle getAisle() {
        return aisle;
    }

    public void setAisle(Aisle aisle) {
        this.aisle = aisle;
    }
    
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getVisited() {
        return visited;
    }

    public void setVisited(String visited) {
        this.visited = visited;
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;

    }

    public MegaStore getMegaStore() {
        return megaStore;
    }

    public void setMegaStore(MegaStore megaStore) {
        this.megaStore = megaStore;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", locationType=" + locationType + ", megaStore=" + megaStore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.row;
        hash = 83 * hash + this.column;
        hash = 83 * hash + Objects.hashCode(this.aisle);
        hash = 83 * hash + Objects.hashCode(this.visited);
        hash = 83 * hash + Objects.hashCode(this.locationType);
        hash = 83 * hash + Objects.hashCode(this.megaStore);
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
        final Location other = (Location) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        if (!Objects.equals(this.aisle, other.aisle)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (this.locationType != other.locationType) {
            return false;
        }
        if (!Objects.equals(this.megaStore, other.megaStore)) {
            return false;
        }
        return true;
    }
    void setAisle(int aisle) {
        System.out.println("Create new aisle.");
    }
     public static boolean exists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean open() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
