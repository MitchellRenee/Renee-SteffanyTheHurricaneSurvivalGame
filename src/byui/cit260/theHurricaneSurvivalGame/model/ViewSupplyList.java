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
public class ViewSupplyList implements Serializable{
    
    //class instance variables
    private String proteinPoints;
    private String carbohydratePoints;
    private String sweetsAndSugarPoints;
    private String clothesPoints;
    private String shoesPoints;
    private String blanketsPoints;
    private String hygeinalKitsPoints;
    private String toiletPaperPoints;
    private String prescribedMedicationPoints;
    private String unprescribedMedicationPoints;
    private String firstAidKitPoints;
    private String ledLanternPoints;
    private String mylarBlanketsPoints;
    private String crankRadioPoints;
    private String matchesPoints;
    private String candlesPoints;
    private String flashlightPoints;
    private String batteriesPoints;
    private String waterPoints;
    private String tentPoints;
    private String cookingStovePoints;
    private String canopyPoints;

    public ViewSupplyList() {
    }
    
    
    

    public String getProteinPoints() {
        return proteinPoints;
    }

    public void setProteinPoints(String proteinPoints) {
        this.proteinPoints = proteinPoints;
    }

    public String getCarbohydratePoints() {
        return carbohydratePoints;
    }

    public void setCarbohydratePoints(String carbohydratePoints) {
        this.carbohydratePoints = carbohydratePoints;
    }

    public String getSweetsAndSugarPoints() {
        return sweetsAndSugarPoints;
    }

    public void setSweetsAndSugarPoints(String sweetsAndSugarPoints) {
        this.sweetsAndSugarPoints = sweetsAndSugarPoints;
    }

    public String getClothesPoints() {
        return clothesPoints;
    }

    public void setClothesPoints(String clothesPoints) {
        this.clothesPoints = clothesPoints;
    }

    public String getShoesPoints() {
        return shoesPoints;
    }

    public void setShoesPoints(String shoesPoints) {
        this.shoesPoints = shoesPoints;
    }

    public String getBlanketsPoints() {
        return blanketsPoints;
    }

    public void setBlanketsPoints(String blanketsPoints) {
        this.blanketsPoints = blanketsPoints;
    }

    public String getHygeinalKitsPoints() {
        return hygeinalKitsPoints;
    }

    public void setHygeinalKitsPoints(String hygeinalKitsPoints) {
        this.hygeinalKitsPoints = hygeinalKitsPoints;
    }

    public String getToiletPaperPoints() {
        return toiletPaperPoints;
    }

    public void setToiletPaperPoints(String toiletPaperPoints) {
        this.toiletPaperPoints = toiletPaperPoints;
    }

    public String getPrescribedMedicationPoints() {
        return prescribedMedicationPoints;
    }

    public void setPrescribedMedicationPoints(String prescribedMedicationPoints) {
        this.prescribedMedicationPoints = prescribedMedicationPoints;
    }

    public String getUnprescribedMedicationPoints() {
        return unprescribedMedicationPoints;
    }

    public void setUnprescribedMedicationPoints(String unprescribedMedicationPoints) {
        this.unprescribedMedicationPoints = unprescribedMedicationPoints;
    }

    public String getFirstAidKitPoints() {
        return firstAidKitPoints;
    }

    public void setFirstAidKitPoints(String firstAidKitPoints) {
        this.firstAidKitPoints = firstAidKitPoints;
    }

    public String getLedLanternPoints() {
        return ledLanternPoints;
    }

    public void setLedLanternPoints(String ledLanternPoints) {
        this.ledLanternPoints = ledLanternPoints;
    }

    public String getMylarBlanketsPoints() {
        return mylarBlanketsPoints;
    }

    public void setMylarBlanketsPoints(String mylarBlanketsPoints) {
        this.mylarBlanketsPoints = mylarBlanketsPoints;
    }

    public String getCrankRadioPoints() {
        return crankRadioPoints;
    }

    public void setCrankRadioPoints(String crankRadioPoints) {
        this.crankRadioPoints = crankRadioPoints;
    }

    public String getMatchesPoints() {
        return matchesPoints;
    }

    public void setMatchesPoints(String matchesPoints) {
        this.matchesPoints = matchesPoints;
    }

    public String getCandlesPoints() {
        return candlesPoints;
    }

    public void setCandlesPoints(String candlesPoints) {
        this.candlesPoints = candlesPoints;
    }

    public String getFlashlightPoints() {
        return flashlightPoints;
    }

    public void setFlashlightPoints(String flashlightPoints) {
        this.flashlightPoints = flashlightPoints;
    }

    public String getBatteriesPoints() {
        return batteriesPoints;
    }

    public void setBatteriesPoints(String batteriesPoints) {
        this.batteriesPoints = batteriesPoints;
    }

    public String getWaterPoints() {
        return waterPoints;
    }

    public void setWaterPoints(String waterPoints) {
        this.waterPoints = waterPoints;
    }

    public String getTentPoints() {
        return tentPoints;
    }

    public void setTentPoints(String tentPoints) {
        this.tentPoints = tentPoints;
    }

    public String getCookingStovePoints() {
        return cookingStovePoints;
    }

    public void setCookingStovePoints(String cookingStovePoints) {
        this.cookingStovePoints = cookingStovePoints;
    }

    public String getCanopyPoints() {
        return canopyPoints;
    }

    public void setCanopyPoints(String canopyPoints) {
        this.canopyPoints = canopyPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.proteinPoints);
        hash = 71 * hash + Objects.hashCode(this.carbohydratePoints);
        hash = 71 * hash + Objects.hashCode(this.sweetsAndSugarPoints);
        hash = 71 * hash + Objects.hashCode(this.clothesPoints);
        hash = 71 * hash + Objects.hashCode(this.shoesPoints);
        hash = 71 * hash + Objects.hashCode(this.blanketsPoints);
        hash = 71 * hash + Objects.hashCode(this.hygeinalKitsPoints);
        hash = 71 * hash + Objects.hashCode(this.toiletPaperPoints);
        hash = 71 * hash + Objects.hashCode(this.prescribedMedicationPoints);
        hash = 71 * hash + Objects.hashCode(this.unprescribedMedicationPoints);
        hash = 71 * hash + Objects.hashCode(this.firstAidKitPoints);
        hash = 71 * hash + Objects.hashCode(this.ledLanternPoints);
        hash = 71 * hash + Objects.hashCode(this.mylarBlanketsPoints);
        hash = 71 * hash + Objects.hashCode(this.crankRadioPoints);
        hash = 71 * hash + Objects.hashCode(this.matchesPoints);
        hash = 71 * hash + Objects.hashCode(this.candlesPoints);
        hash = 71 * hash + Objects.hashCode(this.flashlightPoints);
        hash = 71 * hash + Objects.hashCode(this.batteriesPoints);
        hash = 71 * hash + Objects.hashCode(this.waterPoints);
        hash = 71 * hash + Objects.hashCode(this.tentPoints);
        hash = 71 * hash + Objects.hashCode(this.cookingStovePoints);
        hash = 71 * hash + Objects.hashCode(this.canopyPoints);
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
        final ViewSupplyList other = (ViewSupplyList) obj;
        if (!Objects.equals(this.proteinPoints, other.proteinPoints)) {
            return false;
        }
        if (!Objects.equals(this.carbohydratePoints, other.carbohydratePoints)) {
            return false;
        }
        if (!Objects.equals(this.sweetsAndSugarPoints, other.sweetsAndSugarPoints)) {
            return false;
        }
        if (!Objects.equals(this.clothesPoints, other.clothesPoints)) {
            return false;
        }
        if (!Objects.equals(this.shoesPoints, other.shoesPoints)) {
            return false;
        }
        if (!Objects.equals(this.blanketsPoints, other.blanketsPoints)) {
            return false;
        }
        if (!Objects.equals(this.hygeinalKitsPoints, other.hygeinalKitsPoints)) {
            return false;
        }
        if (!Objects.equals(this.toiletPaperPoints, other.toiletPaperPoints)) {
            return false;
        }
        if (!Objects.equals(this.prescribedMedicationPoints, other.prescribedMedicationPoints)) {
            return false;
        }
        if (!Objects.equals(this.unprescribedMedicationPoints, other.unprescribedMedicationPoints)) {
            return false;
        }
        if (!Objects.equals(this.firstAidKitPoints, other.firstAidKitPoints)) {
            return false;
        }
        if (!Objects.equals(this.ledLanternPoints, other.ledLanternPoints)) {
            return false;
        }
        if (!Objects.equals(this.mylarBlanketsPoints, other.mylarBlanketsPoints)) {
            return false;
        }
        if (!Objects.equals(this.crankRadioPoints, other.crankRadioPoints)) {
            return false;
        }
        if (!Objects.equals(this.matchesPoints, other.matchesPoints)) {
            return false;
        }
        if (!Objects.equals(this.candlesPoints, other.candlesPoints)) {
            return false;
        }
        if (!Objects.equals(this.flashlightPoints, other.flashlightPoints)) {
            return false;
        }
        if (!Objects.equals(this.batteriesPoints, other.batteriesPoints)) {
            return false;
        }
        if (!Objects.equals(this.waterPoints, other.waterPoints)) {
            return false;
        }
        if (!Objects.equals(this.tentPoints, other.tentPoints)) {
            return false;
        }
        if (!Objects.equals(this.cookingStovePoints, other.cookingStovePoints)) {
            return false;
        }
        if (!Objects.equals(this.canopyPoints, other.canopyPoints)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ViewSupplyList{" + "proteinPoints=" + proteinPoints + ", carbohydratePoints=" + carbohydratePoints + ", sweetsAndSugarPoints=" + sweetsAndSugarPoints + ", clothesPoints=" + clothesPoints + ", shoesPoints=" + shoesPoints + ", blanketsPoints=" + blanketsPoints + ", hygeinalKitsPoints=" + hygeinalKitsPoints + ", toiletPaperPoints=" + toiletPaperPoints + ", prescribedMedicationPoints=" + prescribedMedicationPoints + ", unprescribedMedicationPoints=" + unprescribedMedicationPoints + ", firstAidKitPoints=" + firstAidKitPoints + ", ledLanternPoints=" + ledLanternPoints + ", mylarBlanketsPoints=" + mylarBlanketsPoints + ", crankRadioPoints=" + crankRadioPoints + ", matchesPoints=" + matchesPoints + ", candlesPoints=" + candlesPoints + ", flashlightPoints=" + flashlightPoints + ", batteriesPoints=" + batteriesPoints + ", waterPoints=" + waterPoints + ", tentPoints=" + tentPoints + ", cookingStovePoints=" + cookingStovePoints + ", canopyPoints=" + canopyPoints + '}';
    }
    
    
    
    
}
