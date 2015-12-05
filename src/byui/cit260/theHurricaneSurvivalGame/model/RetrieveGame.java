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
public class RetrieveGame implements Serializable {

    //class instance variables
    private String locateSavedGame;
    private String readSavedGame;
    private String retrieveSavedGame;

    public RetrieveGame() {
    }

    public String getLocateSavedGame() {
        return locateSavedGame;
    }

    public void setLocateSavedGame(String locateSavedGame) {
        this.locateSavedGame = locateSavedGame;
    }

    public String getReadSavedGame() {
        return readSavedGame;
    }

    public void setReadSavedGame(String readSavedGame) {
        this.readSavedGame = readSavedGame;
    }

    public String getRetrieveSavedGame() {
        return retrieveSavedGame;
    }

    public void setRetrieveSavedGame(String retrieveSavedGame) {
        this.retrieveSavedGame = retrieveSavedGame;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.locateSavedGame);
        hash = 43 * hash + Objects.hashCode(this.readSavedGame);
        hash = 43 * hash + Objects.hashCode(this.retrieveSavedGame);
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
        final RetrieveGame other = (RetrieveGame) obj;
        if (!Objects.equals(this.locateSavedGame, other.locateSavedGame)) {
            return false;
        }
        if (!Objects.equals(this.readSavedGame, other.readSavedGame)) {
            return false;
        }
        if (!Objects.equals(this.retrieveSavedGame, other.retrieveSavedGame)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RetrieveGame{" + "locateSavedGame=" + locateSavedGame + ", readSavedGame=" + readSavedGame + ", retrieveSavedGame=" + retrieveSavedGame + '}';
    }

}
