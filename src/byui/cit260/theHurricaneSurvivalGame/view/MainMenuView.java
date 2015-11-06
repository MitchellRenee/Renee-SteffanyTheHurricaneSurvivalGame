/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import java.util.Scanner;

/**
 *
 * @author SteffanyFaldmo
 */
public class MainMenuView {
    
    public MainMenuView(){
        
    }
    
    public void displayMenu(){
        
        System.out.println("Please select an option:");
        System.out.println("G - Start Game");
        System.out.println("R - Return to Game");
        System.out.println("H - How to Play");
        System.out.println("S - Save Game");
        System.out.println("X - Exit");
        
    }
    
    public char getInput(){
        
        Scanner in = new Scanner (System.in);
        
        String input = "";
        char rtn = 0;
        
        
        while(input.length() < 1){
            displayMenu();
            input = in.nextLine();
            
            if(input() < 1){
                System.out.println("Please select an option.");
                displayMenu();
            }
            
            rtn = input.toUpperCase().charAt(0);
            
            if(rtn != 'G' || rtn != 'R' || rtn != 'H' || rtn != 'S' || rtn != 'X'){
                System.out.println("Please select a valid menu item.");
                input = "";
            }
            
            
            
        }
        
        
        return rtn;
    }
    
    public void doAction (char input){
        
    }

    private int input() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void startNewGame() {
                // Create a new game
        GameControl.createNewGame(TheHurricaneSurvivalGame())
        
           
        
    
         
     }
    
}
