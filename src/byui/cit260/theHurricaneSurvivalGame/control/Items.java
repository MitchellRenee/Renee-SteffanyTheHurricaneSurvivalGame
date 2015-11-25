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
public class Items implements Serializable{

    public static boolean located() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    //class instance variables
    private Object proteins;
    private Object snacks;
    private Object sweets;
    private Object carbs;
    private Object toiletries;
    private Object firstAid;
    private Object prescibedMeds;
    private Object overTheCounterMeds; 
    private Object clothing;
    private Object blankets;
    private Object water;
    private Object tent;
    private Object canopy;
    private Object flashlight;
    private Object batteries;
    private Object candles;
    private Object ledLantern;
    private Object matches;
    private Object crankRadio; 
    private Object cookingStove;
    private Object fuel;
    private Object rainParker;
    private Object rainBoots;

    public Items() {
    }
    
    public Object getProteins() {
        return proteins;
    }

    public void setProteins(Object proteins) {
        this.proteins = proteins;
    }

    public Object getSnacks() {
        return snacks;
    }

    public void setSnacks(Object snacks) {
        this.snacks = snacks;
    }

    public Object getSweets() {
        return sweets;
    }

    public void setSweets(Object sweets) {
        this.sweets = sweets;
    }

    public Object getCarbs() {
        return carbs;
    }

    public void setCarbs(Object carbs) {
        this.carbs = carbs;
    }

    public Object getToiletries() {
        return toiletries;
    }

    public void setToiletries(Object toiletries) {
        this.toiletries = toiletries;
    }

    public Object getFirstAid() {
        return firstAid;
    }

    public void setFirstAid(Object firstAid) {
        this.firstAid = firstAid;
    }

    public Object getPrescibedMeds() {
        return prescibedMeds;
    }

    public void setPrescibedMeds(Object prescibedMeds) {
        this.prescibedMeds = prescibedMeds;
    }

    public Object getOverTheCounterMeds() {
        return overTheCounterMeds;
    }

    public void setOverTheCounterMeds(Object overTheCounterMeds) {
        this.overTheCounterMeds = overTheCounterMeds;
    }

    public Object getClothing() {
        return clothing;
    }

    public void setClothing(Object clothing) {
        this.clothing = clothing;
    }

    public Object getBlankets() {
        return blankets;
    }

    public void setBlankets(Object blankets) {
        this.blankets = blankets;
    }

    public Object getWater() {
        return water;
    }

    public void setWater(Object water) {
        this.water = water;
    }

    public Object getTent() {
        return tent;
    }

    public void setTent(Object tent) {
        this.tent = tent;
    }

    public Object getCanopy() {
        return canopy;
    }

    public void setCanopy(Object canopy) {
        this.canopy = canopy;
    }

    public Object getFlashlight() {
        return flashlight;
    }

    public void setFlashlight(Object flashlight) {
        this.flashlight = flashlight;
    }

    public Object getBatteries() {
        return batteries;
    }

    public void setBatteries(Object batteries) {
        this.batteries = batteries;
    }

    public Object getCandles() {
        return candles;
    }

    public void setCandles(Object candles) {
        this.candles = candles;
    }

    public Object getLedLantern() {
        return ledLantern;
    }

    public void setLedLantern(Object ledLantern) {
        this.ledLantern = ledLantern;
    }

    public Object getMatches() {
        return matches;
    }

    public void setMatches(Object matches) {
        this.matches = matches;
    }

    public Object getCrankRadio() {
        return crankRadio;
    }

    public void setCrankRadio(Object crankRadio) {
        this.crankRadio = crankRadio;
    }

    public Object getCookingStove() {
        return cookingStove;
    }

    public void setCookingStove(Object cookingStove) {
        this.cookingStove = cookingStove;
    }

    public Object getFuel() {
        return fuel;
    }

    public void setFuel(Object fuel) {
        this.fuel = fuel;
    }

    public Object getRainParker() {
        return rainParker;
    }

    public void setRainParker(Object rainParker) {
        this.rainParker = rainParker;
    }

    public Object getRainBoots() {
        return rainBoots;
    }

    public void setRainBoots(Object rainBoots) {
        this.rainBoots = rainBoots;
    }

    @Override
    public String toString() {
        return "Items{" + "proteins=" + proteins + ", snacks=" + snacks + ", sweets=" + sweets + ", carbs=" + carbs + ", toiletries=" + toiletries + ", firstAid=" + firstAid + ", prescibedMeds=" + prescibedMeds + ", overTheCounterMeds=" + overTheCounterMeds + ", clothing=" + clothing + ", blankets=" + blankets + ", water=" + water + ", tent=" + tent + ", canopy=" + canopy + ", flashlight=" + flashlight + ", batteries=" + batteries + ", candles=" + candles + ", ledLantern=" + ledLantern + ", matches=" + matches + ", crankRadio=" + crankRadio + ", cookingStove=" + cookingStove + ", fuel=" + fuel + ", rainParker=" + rainParker + ", rainBoots=" + rainBoots + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.proteins);
        hash = 23 * hash + Objects.hashCode(this.snacks);
        hash = 23 * hash + Objects.hashCode(this.sweets);
        hash = 23 * hash + Objects.hashCode(this.carbs);
        hash = 23 * hash + Objects.hashCode(this.toiletries);
        hash = 23 * hash + Objects.hashCode(this.firstAid);
        hash = 23 * hash + Objects.hashCode(this.prescibedMeds);
        hash = 23 * hash + Objects.hashCode(this.overTheCounterMeds);
        hash = 23 * hash + Objects.hashCode(this.clothing);
        hash = 23 * hash + Objects.hashCode(this.blankets);
        hash = 23 * hash + Objects.hashCode(this.water);
        hash = 23 * hash + Objects.hashCode(this.tent);
        hash = 23 * hash + Objects.hashCode(this.canopy);
        hash = 23 * hash + Objects.hashCode(this.flashlight);
        hash = 23 * hash + Objects.hashCode(this.batteries);
        hash = 23 * hash + Objects.hashCode(this.candles);
        hash = 23 * hash + Objects.hashCode(this.ledLantern);
        hash = 23 * hash + Objects.hashCode(this.matches);
        hash = 23 * hash + Objects.hashCode(this.crankRadio);
        hash = 23 * hash + Objects.hashCode(this.cookingStove);
        hash = 23 * hash + Objects.hashCode(this.fuel);
        hash = 23 * hash + Objects.hashCode(this.rainParker);
        hash = 23 * hash + Objects.hashCode(this.rainBoots);
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
        final Items other = (Items) obj;
        if (!Objects.equals(this.proteins, other.proteins)) {
            return false;
        }
        if (!Objects.equals(this.snacks, other.snacks)) {
            return false;
        }
        if (!Objects.equals(this.sweets, other.sweets)) {
            return false;
        }
        if (!Objects.equals(this.carbs, other.carbs)) {
            return false;
        }
        if (!Objects.equals(this.toiletries, other.toiletries)) {
            return false;
        }
        if (!Objects.equals(this.firstAid, other.firstAid)) {
            return false;
        }
        if (!Objects.equals(this.prescibedMeds, other.prescibedMeds)) {
            return false;
        }
        if (!Objects.equals(this.overTheCounterMeds, other.overTheCounterMeds)) {
            return false;
        }
        if (!Objects.equals(this.clothing, other.clothing)) {
            return false;
        }
        if (!Objects.equals(this.blankets, other.blankets)) {
            return false;
        }
        if (!Objects.equals(this.water, other.water)) {
            return false;
        }
        if (!Objects.equals(this.tent, other.tent)) {
            return false;
        }
        if (!Objects.equals(this.canopy, other.canopy)) {
            return false;
        }
        if (!Objects.equals(this.flashlight, other.flashlight)) {
            return false;
        }
        if (!Objects.equals(this.batteries, other.batteries)) {
            return false;
        }
        if (!Objects.equals(this.candles, other.candles)) {
            return false;
        }
        if (!Objects.equals(this.ledLantern, other.ledLantern)) {
            return false;
        }
        if (!Objects.equals(this.matches, other.matches)) {
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
        if (!Objects.equals(this.rainParker, other.rainParker)) {
            return false;
        }
        if (!Objects.equals(this.rainBoots, other.rainBoots)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
