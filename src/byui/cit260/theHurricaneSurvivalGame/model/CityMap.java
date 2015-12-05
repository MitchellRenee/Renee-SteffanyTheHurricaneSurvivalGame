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
public class CityMap implements Serializable {

    private Location[][] locationMatrix;
    public boolean getMapDisplay;

    public CityMap() {
        locationMatrix = new Location[5][5];
    }

    public void init() {

        for (int row = 0; row < locationMatrix.length; row++) {
            for (int col = 0; col < locationMatrix[0].length; col++) {
                Location tempLocation = new Location();
                tempLocation.setRow(row);
                tempLocation.setColumn(col);
                tempLocation.setLocationType(LocationType.Empty);

                locationMatrix[row][col] = tempLocation;
            }
        }

        locationMatrix[0][1].setLocationType(LocationType.Home);

        locationMatrix[4][2].setLocationType(LocationType.MegaStore);

        locationMatrix[0][4].setLocationType(LocationType.DeliveryCenter);

        locationMatrix[1][3].setLocationType(LocationType.NursingHome);

        locationMatrix[4][4].setLocationType(LocationType.Prison);

        locationMatrix[2][3].setLocationType(LocationType.Empty);

    }

    public Location[][] getLocationMatrix() {
        return locationMatrix;
    }

    public void setLocationMatrix(Location[][] locationMatrix) {
        this.locationMatrix = locationMatrix;
    }

    public Location getHomeLocation() {
        for (int row = 0; row < locationMatrix.length; row++) {
            for (int col = 0; col < locationMatrix[0].length; col++) {
                if (locationMatrix[row][col].getLocationType() == LocationType.Home) {
                    return locationMatrix[row][col];
                }
            }
        }

        return null;
    }

    public Location getLocation(int row, int col) {
        if (row < 0 || row > locationMatrix.length) {
            return null;
        }
        if (col < 0 || col > locationMatrix[0].length) {
            return null;
        }

        return locationMatrix[row][col];
    }

    public String getMapDisplay() {

        String rtn = "";

        for (int row = 0; row < locationMatrix.length; row++) {
            for (int col = 0; col < locationMatrix[0].length; col++) {
                rtn += "[" + locationMatrix[row][col].getLocationType() + "]";
            }
            rtn += "\n";
        }

        return rtn;
    }

}
