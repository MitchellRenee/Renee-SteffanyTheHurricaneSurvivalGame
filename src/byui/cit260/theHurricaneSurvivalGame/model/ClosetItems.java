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
public class ClosetItems implements Serializable{
    
    //class instance variables
    private String ledLantern;
    private String mylarBlankets;
    private String crankRadio;
    private String matches;
    private String candles;
    private String flashlight;
    private String batteries;

    public ClosetItems() {
    }
    
    public String getLedLantern() {
        return ledLantern;
    }

    public void setLedLantern(String ledLantern) {
        this.ledLantern = ledLantern;
    }

    public String getMylarBlankets() {
        return mylarBlankets;
    }

    public void setMylarBlankets(String mylarBlankets) {
        this.mylarBlankets = mylarBlankets;
    }

    public String getCrankRadio() {
        return crankRadio;
    }

    public void setCrankRadio(String crankRadio) {
        this.crankRadio = crankRadio;
    }

    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
        this.matches = matches;
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }

    public String getFlashlight() {
        return flashlight;
    }

    public void setFlashlight(String flashlight) {
        this.flashlight = flashlight;
    }

    public String getBatteries() {
        return batteries;
    }

    public void setBatteries(String batteries) {
        this.batteries = batteries;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.ledLantern);
        hash = 89 * hash + Objects.hashCode(this.mylarBlankets);
        hash = 89 * hash + Objects.hashCode(this.crankRadio);
        hash = 89 * hash + Objects.hashCode(this.matches);
        hash = 89 * hash + Objects.hashCode(this.candles);
        hash = 89 * hash + Objects.hashCode(this.flashlight);
        hash = 89 * hash + Objects.hashCode(this.batteries);
        return hash;
    }

    @Override
    public String toString() {
        return "ClosetItemsModel{" + "ledLantern=" + ledLantern + ", mylarBlankets=" + mylarBlankets + ", crankRadio=" + crankRadio + ", matches=" + matches + ", candles=" + candles + ", flashlight=" + flashlight + ", batteries=" + batteries + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClosetItems other = (ClosetItems) obj;
        if (!Objects.equals(this.ledLantern, other.ledLantern)) {
            return false;
        }
        if (!Objects.equals(this.mylarBlankets, other.mylarBlankets)) {
            return false;
        }
        if (!Objects.equals(this.crankRadio, other.crankRadio)) {
            return false;
        }
        if (!Objects.equals(this.matches, other.matches)) {
            return false;
        }
        if (!Objects.equals(this.candles, other.candles)) {
            return false;
        }
        if (!Objects.equals(this.flashlight, other.flashlight)) {
            return false;
        }
        if (!Objects.equals(this.batteries, other.batteries)) {
            return false;
        }
        return true;
    }
    
    
    
     
    
}
