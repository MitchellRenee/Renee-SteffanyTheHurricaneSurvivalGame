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
public class StartMenu implements Serializable{
    
    //class instance variables
    private String continueGame;
    private String returnToMenu;
    private String viewMap;
    private String goToHouse;

    public StartMenu() {
    }
    
    
    

    public String getContinueGame() {
        return continueGame;
    }

    public void setContinueGame(String continueGame) {
        this.continueGame = continueGame;
    }

    public String getReturnToMenu() {
        return returnToMenu;
    }

    public void setReturnToMenu(String returnToMenu) {
        this.returnToMenu = returnToMenu;
    }

    public String getViewMap() {
        return viewMap;
    }

    public void setViewMap(String viewMap) {
        this.viewMap = viewMap;
    }

    public String getGoToHouse() {
        return goToHouse;
    }

    public void setGoToHouse(String goToHouse) {
        this.goToHouse = goToHouse;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 23 * hash + Objects.hashCode(this.continueGame);
        hash = 23 * hash + Objects.hashCode(this.returnToMenu);
        hash = 23 * hash + Objects.hashCode(this.viewMap);
        hash = 23 * hash + Objects.hashCode(this.goToHouse);
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
        final StartMenu other = (StartMenu) obj;
        if (!Objects.equals(this.continueGame, other.continueGame)) {
            return false;
        }
        if (!Objects.equals(this.returnToMenu, other.returnToMenu)) {
            return false;
        }
        if (!Objects.equals(this.viewMap, other.viewMap)) {
            return false;
        }
        if (!Objects.equals(this.goToHouse, other.goToHouse)) {
            return false;
        }
        return true;
    }

    
    
    
}
