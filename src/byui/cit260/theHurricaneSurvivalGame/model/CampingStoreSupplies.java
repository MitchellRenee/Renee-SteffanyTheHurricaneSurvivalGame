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
public class CampingStoreSupplies implements Serializable{
    
    //class instance variables
    private String tentSize;
    private String canopySize;
    private String flashlightSize;
    private String batterySizes;
    private String candleSize;
    private String ledLantern;
    private String matchesAndLighter;
    private String crankRadio;
    private String cookingStove;
    private String fuel;
    private String rainGear;
    private String gameMenu;

    public CampingStoreSupplies() {
    }
    
    public String getTentSize() {
        return tentSize;
    }

    public void setTentSize(String tentSize) {
        this.tentSize = tentSize;
    }

    public String getCanopySize() {
        return canopySize;
    }

    public void setCanopySize(String canopySize) {
        this.canopySize = canopySize;
    }

    public String getFlashlightSize() {
        return flashlightSize;
    }

    public void setFlashlightSize(String flashlightSize) {
        this.flashlightSize = flashlightSize;
    }

    public String getBatterySizes() {
        return batterySizes;
    }

    public void setBatterySizes(String batterySizes) {
        this.batterySizes = batterySizes;
    }

    public String getCandleSize() {
        return candleSize;
    }

    public void setCandleSize(String candleSize) {
        this.candleSize = candleSize;
    }

    public String getLedLantern() {
        return ledLantern;
    }

    public void setLedLantern(String ledLantern) {
        this.ledLantern = ledLantern;
    }

    public String getMatchesAndLighter() {
        return matchesAndLighter;
    }

    public void setMatchesAndLighter(String matchesAndLighter) {
        this.matchesAndLighter = matchesAndLighter;
    }

    public String getCrankRadio() {
        return crankRadio;
    }

    public void setCrankRadio(String crankRadio) {
        this.crankRadio = crankRadio;
    }

    public String getCookingStove() {
        return cookingStove;
    }

    public void setCookingStove(String cookingStove) {
        this.cookingStove = cookingStove;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getRainGear() {
        return rainGear;
    }

    public void setRainGear(String rainGear) {
        this.rainGear = rainGear;
    }

    public String getGameMenu() {
        return gameMenu;
    }

    public void setGameMenu(String gameMenu) {
        this.gameMenu = gameMenu;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.tentSize);
        hash = 97 * hash + Objects.hashCode(this.canopySize);
        hash = 97 * hash + Objects.hashCode(this.flashlightSize);
        hash = 97 * hash + Objects.hashCode(this.batterySizes);
        hash = 97 * hash + Objects.hashCode(this.candleSize);
        hash = 97 * hash + Objects.hashCode(this.ledLantern);
        hash = 97 * hash + Objects.hashCode(this.matchesAndLighter);
        hash = 97 * hash + Objects.hashCode(this.crankRadio);
        hash = 97 * hash + Objects.hashCode(this.cookingStove);
        hash = 97 * hash + Objects.hashCode(this.fuel);
        hash = 97 * hash + Objects.hashCode(this.rainGear);
        hash = 97 * hash + Objects.hashCode(this.gameMenu);
        return hash;
    }

    @Override
    public String toString() {
        return "CampingStoreSuppliesModel{" + "tentSize=" + tentSize + ", canopySize=" + canopySize + ", flashlightSize=" + flashlightSize + ", batterySizes=" + batterySizes + ", candleSize=" + candleSize + ", ledLantern=" + ledLantern + ", matchesAndLighter=" + matchesAndLighter + ", crankRadio=" + crankRadio + ", cookingStove=" + cookingStove + ", fuel=" + fuel + ", rainGear=" + rainGear + ", gameMenu=" + gameMenu + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CampingStoreSupplies other = (CampingStoreSupplies) obj;
        if (!Objects.equals(this.tentSize, other.tentSize)) {
            return false;
        }
        if (!Objects.equals(this.canopySize, other.canopySize)) {
            return false;
        }
        if (!Objects.equals(this.flashlightSize, other.flashlightSize)) {
            return false;
        }
        if (!Objects.equals(this.batterySizes, other.batterySizes)) {
            return false;
        }
        if (!Objects.equals(this.candleSize, other.candleSize)) {
            return false;
        }
        if (!Objects.equals(this.ledLantern, other.ledLantern)) {
            return false;
        }
        if (!Objects.equals(this.matchesAndLighter, other.matchesAndLighter)) {
            return false;
        }
        if (!Objects.equals(this.crankRadio, other.crankRadio)) {
            return false;
        }
        if (!Objects.equals(this.cookingStove, other.cookingStove)) {
            return false;
        }
        if (!Objects.equals(this.fuel, other.fuel)) {
            return false;
        }
        if (!Objects.equals(this.rainGear, other.rainGear)) {
            return false;
        }
        if (!Objects.equals(this.gameMenu, other.gameMenu)) {
            return false;
        }
        return true;
    }
    
    

    
    
    
    
    
}
