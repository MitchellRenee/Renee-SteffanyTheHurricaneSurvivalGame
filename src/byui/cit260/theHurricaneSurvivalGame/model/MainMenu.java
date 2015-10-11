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
public class MainMenu implements Serializable{
    
    
    private String startGame;
    private String returnToGame;
    private String howToPlay;
    private String saveGame;
    private String exit;

    public MainMenu() {
    }
    
    

    public String getStartGame() {
        return startGame;
    }

    public void setStartGame(String startGame) {
        this.startGame = startGame;
    }

    public String getReturnToGame() {
        return returnToGame;
    }

    public void setReturnToGame(String returnToGame) {
        this.returnToGame = returnToGame;
    }

    public String getHowToPlay() {
        return howToPlay;
    }

    public void setHowToPlay(String howToPlay) {
        this.howToPlay = howToPlay;
    }

    public String getSaveGame() {
        return saveGame;
    }

    public void setSaveGame(String saveGame) {
        this.saveGame = saveGame;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.startGame);
        hash = 59 * hash + Objects.hashCode(this.returnToGame);
        hash = 59 * hash + Objects.hashCode(this.howToPlay);
        hash = 59 * hash + Objects.hashCode(this.saveGame);
        hash = 59 * hash + Objects.hashCode(this.exit);
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
        final MainMenu other = (MainMenu) obj;
        if (!Objects.equals(this.startGame, other.startGame)) {
            return false;
        }
        if (!Objects.equals(this.returnToGame, other.returnToGame)) {
            return false;
        }
        if (!Objects.equals(this.howToPlay, other.howToPlay)) {
            return false;
        }
        if (!Objects.equals(this.saveGame, other.saveGame)) {
            return false;
        }
        if (!Objects.equals(this.exit, other.exit)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "startGame=" + startGame + ", returnToGame=" + returnToGame + ", howToPlay=" + howToPlay + ", saveGame=" + saveGame + ", exit=" + exit + '}';
    }
    
    
}
