/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.model;

import java.io.Serializable;

/**
 * This calls a method based on the input
 *
 * @param input
 */
/**
 *
 * @author Renee
 */
public class Aisle implements Serializable {

    public static void calAisle(HurricaneSurvivalGame instance) {
        System.out.println("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // make this a list or a single array
    //class instance variables
    private int aisle1;
    private int aisle2;
    private int aisle3;
    private int aisle4;
    private int aisle5;

    public int getAisle1() {
        return aisle1;
    }

    public void setAisle1(int aisle1) {
        this.aisle1 = aisle1;
    }

    public int getAisle2() {
        return aisle2;
    }

    public void setAisle2(int aisle2) {
        this.aisle2 = aisle2;
    }

    public int getAisle3() {
        return aisle3;
    }

    public void setAisle3(int aisle3) {
        this.aisle3 = aisle3;
    }

    public int getAisle4() {
        return aisle4;
    }

    public void setAisle4(int aisle4) {
        this.aisle4 = aisle4;
    }

    public int getAisle5() {
        return aisle5;
    }

    public void setAisle5(int aisle5) {
        this.aisle5 = aisle5;
    }

    @Override
    public String toString() {
        return "Aisle{" + "aisle1=" + aisle1 + ", aisle2=" + aisle2 + ", aisle3=" + aisle3 + ", aisle4=" + aisle4 + ", aisle5=" + aisle5 + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.aisle1;
        hash = 97 * hash + this.aisle2;
        hash = 97 * hash + this.aisle3;
        hash = 97 * hash + this.aisle4;
        hash = 97 * hash + this.aisle5;
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
        final Aisle other = (Aisle) obj;
        if (this.aisle1 != other.aisle1) {
            return false;
        }
        if (this.aisle2 != other.aisle2) {
            return false;
        }
        if (this.aisle3 != other.aisle3) {
            return false;
        }
        if (this.aisle4 != other.aisle4) {
            return false;
        }
        if (this.aisle5 != other.aisle5) {
            return false;
        }
        return true;
    }
//Create a single array
private Location[] locationMatrix;
    public static int getMapDisplay;

        public Aisle() {
        locationMatrix = new Location[5];
        }

    public void init() {

        for (int aisle = 0; aisle < locationMatrix.length; aisle++) {
            for (int a = 0; a < locationMatrix[0].length; a++) {
                Location tempLocation = new Location();// creating new location
                tempLocation.setAisle(aisle); //give the aisle a temporary location with a setter
                tempLocation.setLocationType(LocationType.Empty);// set an empty location for the empty locations on the map.

                locationMatrix[aisle] = tempLocation;
            }

            locationMatrix[0].setLocationType(LocationType.Aisle1);

            locationMatrix[1].setLocationType(LocationType.Aisle2);

            locationMatrix[2].setLocationType(LocationType.Aisle3);

            locationMatrix[3].setLocationType(LocationType.Aisle4);

            locationMatrix[4].setLocationType(LocationType.Aisle5);

            locationMatrix[5].setLocationType(LocationType.Empty);

        }
    }

    public Location[] getLocationMatrix() {
        return locationMatrix;
    }

    public void setLocationMatrix(Location[] locationMatrix) {
        this.locationMatrix = locationMatrix;
    }

    public Location getAisleLocation() {
        for (Location locationMatrix1 : locationMatrix) {
            if (locationMatrix1.getLocationType() == LocationType.Aisle1) {
                return locationMatrix1;
            }
        }

        return null;
    }

    void setProtein(String aisle_1) {
        System.out.println("Protein is located in aisle 1.");
    }

    void setSnacks(String aisle_1) {
        System.out.println("Snacks is located in aisle 1.");
    }

    void setSweets(String aisle_1) {
        System.out.println("Sweets is located in aisle 1.");
    }

    void setCarbs(String aisle1) {
        System.out.println("Carbs is located in aisle 1.");
    }

    void setWater(String aisle1) {
        System.out.println("Water is located in aisle 1.");
    }

    void setBatteries(String aisle_2) {
        System.out.println("Batteries is located in aisle 1.");
    }

    void setFlashlight(String aisle2) {
        System.out.println("Flashlight is located in aisle 1.");
    }

    void setCandles(String aisle2) {
        System.out.println("Candles is located in aisle 1.");
    }

    void setLedLantern(String aisle2) {
        System.out.println("LedLantern is located in aisle 1.");
    }

    void setMatches(String aisle2) {
        System.out.println("Matches is located in aisle 1.");
    }

    void setTent(String aisle3) {
        System.out.println("Tent is located in aisle 1.");
    }

    void setCanopy(String aisle3) {
        System.out.println("Canopy is located in aisle 1.");
    }

    void setRainBoots(String aisle3) {
        System.out.println("RainBoots is located in aisle 1.");
    }

    void setRainParker(String aisle3) {
        System.out.println("RainParker is located in aisle 1.");
    }

    void setBlanket(String aisle_3) {
        System.out.println("Blanket is located in aisle 1.");
    }

    void setPrescribedMeds(String aisle4) {
        System.out.println("PrescribedMeds is located in aisle 1.");
    }

    void setOverTheCounterMeds(String aisle4) {
        System.out.println("OverTheCounterMeds is located in aisle 1.");
    }

    void setFirstAidKit(String aisle4) {
        System.out.println("FirstAidKit is located in aisle 1.");
    }

    void setToiletries(String aisle4) {
        System.out.println("Toiletries is located in aisle 1.");
    }

    void setCrankRadio(String aisle5) {
        System.out.println("CrankRadio is located in aisle 1.");
    }

    void setCookingStove(String aisle5) {
        System.out.println(" CookingStoveis located in aisle 1.");
    }

    void setGenerator(String aisle5) {
        System.out.println("Generator is located in aisle 1.");
    }

    void setFuel(String aisle5) {
        System.out.println("Fuel is located in aisle 1.");
    }

    void setEmpty(String this_is_not_an_Aisle) {
        System.out.println("EmptyItem is located in aisle 1.");
    }

    public int getLocationType() {
        System.out.println("Retrieve aisle location type.");
        return 0;
    }

    public void setAisle() {
        System.out.println("Aisles are predetermined.");

        Aisle department = new Aisle();

        department.setProtein("Aisle1");
        department.setSnacks("Aisle1");
        department.setSweets("Aisle1");
        department.setCarbs("Aisle1");
        department.setWater("Aisle1");
        department.setBatteries("Aisle2");
        department.setFlashlight("Aisle2");
        department.setCandles("Aisle2");
        department.setLedLantern("Aisle2");
        department.setMatches("Aisle2");
        department.setTent("Aisle3");
        department.setCanopy("Aisle3");
        department.setRainBoots("Aisle3");
        department.setRainParker("Aisle3");
        department.setBlanket("Aisle 3");
        department.setPrescribedMeds("Aisle4");
        department.setOverTheCounterMeds("Aisle4");
        department.setFirstAidKit("Aisle4");
        department.setToiletries("Aisle4");
        department.setCrankRadio("Aisle5");
        department.setCookingStove("Aisle5");
        department.setGenerator("Aisle5");
        department.setFuel("Aisle5");
        department.setEmpty("This is not an Aisle.");
    }

    private static class locationMatrix {

        public locationMatrix() {
        }
    }
}
