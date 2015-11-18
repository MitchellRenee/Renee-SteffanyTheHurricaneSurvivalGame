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
public class StoreModel implements Serializable{
    
    //class instance variables
    private String location;
    private String aisles;
    private String shelves;
    private String selectItems;
    private String buyItems;
    private String deliverItems;
    private String tent;
    private String canopy;
    private String flashlight;
    private String batteries;
    private String candle;
    private String ledLantern;
    private String matches;
    private String lighter;
    private String crankRadio;
    private String cookingStove;
    private String fuel;
    private String rainParker;
    private String rainBoots;
    private String protein;
    private String snacks;
    private String sweets;
    private String carbs;
    private String toiletries;
    private String firstaidKit;
    private String prescribedMeds;
    private String overTheCounterMeds;
    private String clothing;
    private String blankets;
    private String water;    
    private String gameMenu;

    public StoreModel() {
    }    

    @Override
    public String toString() {
        return "StoreModel{" + "location=" + location + ", aisles=" + aisles + ", shelves=" + shelves + ", selectItems=" + selectItems + ", buyItems=" + buyItems + ", deliverItems=" + deliverItems + ", tent=" + tent + ", canopy=" + canopy + ", flashlight=" + flashlight + ", batteries=" + batteries + ", candle=" + candle + ", ledLantern=" + ledLantern + ", matches=" + matches + ", lighter=" + lighter + ", crankRadio=" + crankRadio + ", cookingStove=" + cookingStove + ", fuel=" + fuel + ", rainParker=" + rainParker + ", rainBoots=" + rainBoots + ", protein=" + protein + ", snacks=" + snacks + ", sweets=" + sweets + ", carbs=" + carbs + ", toiletries=" + toiletries + ", firstaidKit=" + firstaidKit + ", prescribedMeds=" + prescribedMeds + ", overTheCounterMeds=" + overTheCounterMeds + ", clothing=" + clothing + ", blankets=" + blankets + ", water=" + water + ", gameMenu=" + gameMenu + '}';
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.location);
        hash = 71 * hash + Objects.hashCode(this.aisles);
        hash = 71 * hash + Objects.hashCode(this.shelves);
        hash = 71 * hash + Objects.hashCode(this.selectItems);
        hash = 71 * hash + Objects.hashCode(this.buyItems);
        hash = 71 * hash + Objects.hashCode(this.deliverItems);
        hash = 71 * hash + Objects.hashCode(this.tent);
        hash = 71 * hash + Objects.hashCode(this.canopy);
        hash = 71 * hash + Objects.hashCode(this.flashlight);
        hash = 71 * hash + Objects.hashCode(this.batteries);
        hash = 71 * hash + Objects.hashCode(this.candle);
        hash = 71 * hash + Objects.hashCode(this.ledLantern);
        hash = 71 * hash + Objects.hashCode(this.matches);
        hash = 71 * hash + Objects.hashCode(this.lighter);
        hash = 71 * hash + Objects.hashCode(this.crankRadio);
        hash = 71 * hash + Objects.hashCode(this.cookingStove);
        hash = 71 * hash + Objects.hashCode(this.fuel);
        hash = 71 * hash + Objects.hashCode(this.rainParker);
        hash = 71 * hash + Objects.hashCode(this.rainBoots);
        hash = 71 * hash + Objects.hashCode(this.protein);
        hash = 71 * hash + Objects.hashCode(this.snacks);
        hash = 71 * hash + Objects.hashCode(this.sweets);
        hash = 71 * hash + Objects.hashCode(this.carbs);
        hash = 71 * hash + Objects.hashCode(this.toiletries);
        hash = 71 * hash + Objects.hashCode(this.firstaidKit);
        hash = 71 * hash + Objects.hashCode(this.prescribedMeds);
        hash = 71 * hash + Objects.hashCode(this.overTheCounterMeds);
        hash = 71 * hash + Objects.hashCode(this.clothing);
        hash = 71 * hash + Objects.hashCode(this.blankets);
        hash = 71 * hash + Objects.hashCode(this.water);
        hash = 71 * hash + Objects.hashCode(this.gameMenu);
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
        final StoreModel other = (StoreModel) obj;
        if (!Objects.equals(this.location, other.location)) {
            return false;
        }
        if (!Objects.equals(this.aisles, other.aisles)) {
            return false;
        }
        if (!Objects.equals(this.shelves, other.shelves)) {
            return false;
        }
        if (!Objects.equals(this.selectItems, other.selectItems)) {
            return false;
        }
        if (!Objects.equals(this.buyItems, other.buyItems)) {
            return false;
        }
        if (!Objects.equals(this.deliverItems, other.deliverItems)) {
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
        if (!Objects.equals(this.candle, other.candle)) {
            return false;
        }
        if (!Objects.equals(this.ledLantern, other.ledLantern)) {
            return false;
        }
        if (!Objects.equals(this.matches, other.matches)) {
            return false;
        }
        if (!Objects.equals(this.lighter, other.lighter)) {
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
        if (!Objects.equals(this.protein, other.protein)) {
            return false;
        }
        if (!Objects.equals(this.snacks, other.snacks)) {
            return false;
        }
        if (!Objects.equals(this.sweets, other.sweets)) {
            return false;
        }
        if (!Objects.equals(this.toiletries, other.toiletries)) {
            return false;
        }
        if (!Objects.equals(this.firstaidKit, other.firstaidKit)) {
            return false;
        }
        if (!Objects.equals(this.prescribedMeds, other.prescribedMeds)) {
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
        if (!Objects.equals(this.gameMenu, other.gameMenu)) {
            return false;
        }
        return true;
        
    } 

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAisles() {
        return aisles;
    }

    public void setAisles(String aisles) {
        this.aisles = aisles;
    }

    public String getShelves() {
        return shelves;
    }

    public void setShelves(String shelves) {
        this.shelves = shelves;
    }

    public String getSelectItems() {
        return selectItems;
    }

    public void setSelectItems(String selectItems) {
        this.selectItems = selectItems;
    }

    public String getBuyItems() {
        return buyItems;
    }

    public void setBuyItems(String buyItems) {
        this.buyItems = buyItems;
    }

    public String getDeliverItems() {
        return deliverItems;
    }

    public void setDeliverItems(String deliverItems) {
        this.deliverItems = deliverItems;
    }

    public String getTent() {
        return tent;
    }

    public void setTent(String tent) {
        this.tent = tent;
    }

    public String getCanopy() {
        return canopy;
    }

    public void setCanopy(String canopy) {
        this.canopy = canopy;
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

    public String getCandle() {
        return candle;
    }

    public void setCandle(String candle) {
        this.candle = candle;
    }

    public String getLedLantern() {
        return ledLantern;
    }

    public void setLedLantern(String ledLantern) {
        this.ledLantern = ledLantern;
    }

    public String getMatches() {
        return matches;
    }

    public void setMatches(String matches) {
        this.matches = matches;
    }

    public String getLighter() {
        return lighter;
    }

    public void setLighter(String lighter) {
        this.lighter = lighter;
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

    public String getRainParker() {
        return rainParker;
    }

    public void setRainParker(String rainParker) {
        this.rainParker = rainParker;
    }

    public String getRainBoots() {
        return rainBoots;
    }

    public void setRainBoots(String rainBoots) {
        this.rainBoots = rainBoots;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }

    public String getSweets() {
        return sweets;
    }

    public void setSweets(String sweets) {
        this.sweets = sweets;
    }

    public String getCarbs() {
        return carbs;
    }

    public void setCarbs(String carbs) {
        this.carbs = carbs;
    }

    public String getToiletries() {
        return toiletries;
    }

    public void setToiletries(String toiletries) {
        this.toiletries = toiletries;
    }

    public String getFirstaidKit() {
        return firstaidKit;
    }

    public void setFirstaidKit(String firstaidKit) {
        this.firstaidKit = firstaidKit;
    }

    public String getPrescribedMeds() {
        return prescribedMeds;
    }

    public void setPrescribedMeds(String prescribedMeds) {
        this.prescribedMeds = prescribedMeds;
    }

    public String getOverTheCounterMeds() {
        return overTheCounterMeds;
    }

    public void setOverTheCounterMeds(String overTheCounterMeds) {
        this.overTheCounterMeds = overTheCounterMeds;
    }

    public String getClothing() {
        return clothing;
    }

    public void setClothing(String clothing) {
        this.clothing = clothing;
    }

    public String getBlankets() {
        return blankets;
    }

    public void setBlankets(String blankets) {
        this.blankets = blankets;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getGameMenu() {
        return gameMenu;
    }

    public void setGameMenu(String gameMenu) {
        this.gameMenu = gameMenu;
    }
    
}
