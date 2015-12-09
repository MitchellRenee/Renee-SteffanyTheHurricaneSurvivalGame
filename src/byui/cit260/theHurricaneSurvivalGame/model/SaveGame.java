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
public class SaveGame implements Serializable {

    //class instance variables
    private String savePlayer;
    private String saveInventory;
    private String saveProgress;

    public SaveGame() {
    }

    public String getSavePlayer() {
        return savePlayer;
    }

    public void setSavePlayer(String savePlayer) {
        this.savePlayer = savePlayer;
    }

    public String getSaveInventory() {
        return saveInventory;
    }

    public void setSaveInventory(String saveInventory) {
        this.saveInventory = saveInventory;
    }

    public String getSaveProgress() {
        return saveProgress;
    }

    public void setSaveProgress(String saveProgress) {
        this.saveProgress = saveProgress;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.savePlayer);
        hash = 37 * hash + Objects.hashCode(this.saveInventory);
        hash = 37 * hash + Objects.hashCode(this.saveProgress);
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
        final SaveGame other = (SaveGame) obj;
        if (!Objects.equals(this.savePlayer, other.savePlayer)) {
            return false;
        }
        if (!Objects.equals(this.saveInventory, other.saveInventory)) {
            return false;
        }
        if (!Objects.equals(this.saveProgress, other.saveProgress)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SaveGame{" + "savePlayer=" + savePlayer + ", saveInventory=" + saveInventory + ", saveProgress=" + saveProgress + '}';
    }

}
