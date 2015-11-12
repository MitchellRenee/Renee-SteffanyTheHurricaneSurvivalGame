/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

/**
 *
 * @author Renee
 */
public interface ViewInterface {
    /** 
    * Interfaces are method declaration only
    * must implement the methods below
    * the display, getInput, and doAction methods.
    */
    
    public void display();
    
    public String getInput();
    
    public boolean doAction(String input);
}
