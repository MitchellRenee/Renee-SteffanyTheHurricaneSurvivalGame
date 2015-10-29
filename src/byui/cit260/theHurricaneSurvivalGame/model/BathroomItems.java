/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.model;

import java.util.Objects;

/**
 *
 * @author Renee
 */
public class BathroomItems {
    
  //class instance variables
    private String hygienalKits;
    private String toiletPaper;
    private String prescribedMedicine;
    private String unprescribedMedicine;
    private String firstaidKit;

    public BathroomItems() {
    }
    
    public String getHygienalKits() {
        return hygienalKits;
    }

    public void setHygienalKits(String hygienalKits) {
        this.hygienalKits = hygienalKits;
    }

    public String getToiletPaper() {
        return toiletPaper;
    }

    public void setToiletPaper(String toiletPaper) {
        this.toiletPaper = toiletPaper;
    }

    public String getPrescribedMedicine() {
        return prescribedMedicine;
    }

    public void setPrescribedMedicine(String prescribedMedicine) {
        this.prescribedMedicine = prescribedMedicine;
    }

    public String getUnprescribedMedicine() {
        return unprescribedMedicine;
    }

    public void setUnprescribedMedicine(String unprescribedMedicine) {
        this.unprescribedMedicine = unprescribedMedicine;
    }

    public String getFirstaidKit() {
        return firstaidKit;
    }

    public void setFirstaidKit(String firstaidKit) {
        this.firstaidKit = firstaidKit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.hygienalKits);
        hash = 97 * hash + Objects.hashCode(this.toiletPaper);
        hash = 97 * hash + Objects.hashCode(this.prescribedMedicine);
        hash = 97 * hash + Objects.hashCode(this.unprescribedMedicine);
        hash = 97 * hash + Objects.hashCode(this.firstaidKit);
        return hash;
    }

    @Override
    public String toString() {
        return "BathroomItemsModel{" + "hygienalKits=" + hygienalKits + ", toiletPaper=" + toiletPaper + ", prescribedMedicine=" + prescribedMedicine + ", unprescribedMedicine=" + unprescribedMedicine + ", firstaidKit=" + firstaidKit + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BathroomItems other = (BathroomItems) obj;
        if (!Objects.equals(this.hygienalKits, other.hygienalKits)) {
            return false;
        }
        if (!Objects.equals(this.toiletPaper, other.toiletPaper)) {
            return false;
        }
        if (!Objects.equals(this.prescribedMedicine, other.prescribedMedicine)) {
            return false;
        }
        if (!Objects.equals(this.unprescribedMedicine, other.unprescribedMedicine)) {
            return false;
        }
        if (!Objects.equals(this.firstaidKit, other.firstaidKit)) {
            return false;
        }
        return true;
    }
    
    
    
}
