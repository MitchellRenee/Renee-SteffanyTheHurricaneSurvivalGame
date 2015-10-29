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
public class MegaStoreItems implements Serializable{
    
    //class instance variables
    private String nameProtien;
    private String nameSnacks;
    private String nameSugarySweets;
    private String nameCarbs;
    private String nameToiletries;
    private String nameFirstaid;
    private String namePrescribedMedicine;
    private String nameUnPrescribedMedicine;
    private String nameClothing;
    private String nameBlankets;
    private String nameWater;
    private String GameMenu;

    public MegaStoreItems() {
    }
    
    public String getNameProtien() {
        return nameProtien;
    }

    public void setNameProtien(String nameProtien) {
        this.nameProtien = nameProtien;
    }

    public String getNameSnacks() {
        return nameSnacks;
    }

    public void setNameSnacks(String nameSnacks) {
        this.nameSnacks = nameSnacks;
    }

    public String getNameSugarySweets() {
        return nameSugarySweets;
    }

    public void setNameSugarySweets(String nameSugarySweets) {
        this.nameSugarySweets = nameSugarySweets;
    }

    public String getNameCarbs() {
        return nameCarbs;
    }

    public void setNameCarbs(String nameCarbs) {
        this.nameCarbs = nameCarbs;
    }

    public String getNameToiletries() {
        return nameToiletries;
    }

    public void setNameToiletries(String nameToiletries) {
        this.nameToiletries = nameToiletries;
    }

    public String getNameFirstaid() {
        return nameFirstaid;
    }

    public void setNameFirstaid(String nameFirstaid) {
        this.nameFirstaid = nameFirstaid;
    }

    public String getNamePrescribedMedicine() {
        return namePrescribedMedicine;
    }

    public void setNamePrescribedMedicine(String namePrescribedMedicine) {
        this.namePrescribedMedicine = namePrescribedMedicine;
    }

    public String getNameUnPrescribedMedicine() {
        return nameUnPrescribedMedicine;
    }

    public void setNameUnPrescribedMedicine(String nameUnPrescribedMedicine) {
        this.nameUnPrescribedMedicine = nameUnPrescribedMedicine;
    }

    public String getNameClothing() {
        return nameClothing;
    }

    public void setNameClothing(String nameClothing) {
        this.nameClothing = nameClothing;
    }

    public String getNameBlankets() {
        return nameBlankets;
    }

    public void setNameBlankets(String nameBlankets) {
        this.nameBlankets = nameBlankets;
    }

    public String getNameWater() {
        return nameWater;
    }

    public void setNameWater(String nameWater) {
        this.nameWater = nameWater;
    }

    public String getGameMenu() {
        return GameMenu;
    }

    public void setGameMenu(String GameMenu) {
        this.GameMenu = GameMenu;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nameProtien);
        hash = 67 * hash + Objects.hashCode(this.nameSnacks);
        hash = 67 * hash + Objects.hashCode(this.nameSugarySweets);
        hash = 67 * hash + Objects.hashCode(this.nameCarbs);
        hash = 67 * hash + Objects.hashCode(this.nameToiletries);
        hash = 67 * hash + Objects.hashCode(this.nameFirstaid);
        hash = 67 * hash + Objects.hashCode(this.namePrescribedMedicine);
        hash = 67 * hash + Objects.hashCode(this.nameUnPrescribedMedicine);
        hash = 67 * hash + Objects.hashCode(this.nameClothing);
        hash = 67 * hash + Objects.hashCode(this.nameBlankets);
        hash = 67 * hash + Objects.hashCode(this.nameWater);
        hash = 67 * hash + Objects.hashCode(this.GameMenu);
        return hash;
    }

    @Override
    public String toString() {
        return "MegaStoreItemsModel{" + "nameProtien=" + nameProtien + ", nameSnacks=" + nameSnacks + ", nameSugarySweets=" + nameSugarySweets + ", nameCarbs=" + nameCarbs + ", nameToiletries=" + nameToiletries + ", nameFirstaid=" + nameFirstaid + ", namePrescribedMedicine=" + namePrescribedMedicine + ", nameUnPrescribedMedicine=" + nameUnPrescribedMedicine + ", nameClothing=" + nameClothing + ", nameBlankets=" + nameBlankets + ", nameWater=" + nameWater + ", GameMenu=" + GameMenu + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MegaStoreItems other = (MegaStoreItems) obj;
        if (!Objects.equals(this.nameProtien, other.nameProtien)) {
            return false;
        }
        if (!Objects.equals(this.nameSnacks, other.nameSnacks)) {
            return false;
        }
        if (!Objects.equals(this.nameSugarySweets, other.nameSugarySweets)) {
            return false;
        }
        if (!Objects.equals(this.nameCarbs, other.nameCarbs)) {
            return false;
        }
        if (!Objects.equals(this.nameToiletries, other.nameToiletries)) {
            return false;
        }
        if (!Objects.equals(this.nameFirstaid, other.nameFirstaid)) {
            return false;
        }
        if (!Objects.equals(this.namePrescribedMedicine, other.namePrescribedMedicine)) {
            return false;
        }
        if (!Objects.equals(this.nameUnPrescribedMedicine, other.nameUnPrescribedMedicine)) {
            return false;
        }
        if (!Objects.equals(this.nameClothing, other.nameClothing)) {
            return false;
        }
        if (!Objects.equals(this.nameBlankets, other.nameBlankets)) {
            return false;
        }
        if (!Objects.equals(this.nameWater, other.nameWater)) {
            return false;
        }
        if (!Objects.equals(this.GameMenu, other.GameMenu)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
