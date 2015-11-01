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
public class HelpMenuView {
    
    public HelpMenuView(){
        
    }
    
    public void displayMenu(){
        
        System.out.println("Please select an option:");
        System.out.println("G - What is the goal of this game?");
        System.out.println("S - How do I view supplies needed?");
        System.out.println("I - How do I view current inventory?");
        System.out.println("P - How do I view survival points earned?");
        System.out.println("M - How do I move locations?");
        System.out.println("A - How do I make money?");
        System.out.println("D - How do I deliver supplies?");
        System.out.println("B - How do I buy supplies?");
        System.out.println("V - How do I view what each location has?");
        System.out.println("X - Close Help Menu");
        
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
            
            if(rtn != 'G' || rtn != 'S' || rtn != 'I' || rtn != 'P' || rtn != 'M' || rtn != 'A' || rtn != 'D' || rtn != 'B' || rtn != 'V' || rtn != 'X'){
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
    
}

   
