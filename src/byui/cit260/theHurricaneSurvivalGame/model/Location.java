/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.model;

import java.io.Serializable;

/**
 *
 * @author SteffanyFaldmo
 */
public class Location implements Serializable {

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
    
}
