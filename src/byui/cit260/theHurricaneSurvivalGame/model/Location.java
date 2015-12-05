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

    public static boolean exists() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int row;
    private int column;
    private String visited;
    private LocationType locationType;

    private StoreModel storeModel;
    private MegaStore megaStore;

    public Location() {
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

    public StoreModel getStoreModel() {
        return storeModel;
    }

    public void setStoreModel(StoreModel storeModel) {
        this.storeModel = storeModel;
    }

    public MegaStore getMegaStore() {
        return megaStore;
    }

    public void setMegaStore(MegaStore megaStore) {
        this.megaStore = megaStore;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", locationType=" + locationType + ", storeModel=" + storeModel + ", megaStore=" + megaStore + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.row;
        hash = 79 * hash + this.column;
        hash = 79 * hash + Objects.hashCode(this.visited);
        hash = 79 * hash + Objects.hashCode(this.locationType);
        hash = 79 * hash + Objects.hashCode(this.storeModel);
        hash = 79 * hash + Objects.hashCode(this.megaStore);
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
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        if (this.locationType != other.locationType) {
            return false;
        }
        if (!Objects.equals(this.storeModel, other.storeModel)) {
            return false;
        }
        if (!Objects.equals(this.megaStore, other.megaStore)) {
            return false;
        }
        return true;
    }

}
