/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author Renee
 */
public class MainMenuView {
    
    public MainMenuView(){
        
    }
    public void displayMenu(){
        
        
        //Computer displays the main menu
        System.out.println("View main menu");
        //Player is prompted to enter the associated letter for their selection and hit enter.
        System.out.println("Please enter letter for selected option and press enter");
        //Display the selected view
        //If an invalid input is entered, the computer displays and error 
        //message and prompts the user to enter a valid input selection.
        System.out.println("You have entered an invalid selection, please try again");
        //Computer redisplays the main menu
        System.out.println("View main menu");
        //Program terminates when the Exit option is entered.
        System.out.println("Exit game");
    }
    @SuppressWarnings("UnusedAssignment")
    public  char getInput(){
        
        Scanner in = new Scanner (System.in);
        
        String input = "";
        char rtn = 0;
               
        while(input.length () < 1){
            displayMenu();
            input = in.nextLine();
            
            if(input.length() < 1){
                System.out.println("Please select an option");
                displayMenu();
                
            rtn = input.toUpperCase().charAt(0);
            
            if(rtn != 'N' || rtn != 'L' || rtn != 'H' || rtn != 'E'){
                System.out.println("Please select a valid input.");
                input = "";
            }
            
        }
        
        return rtn;    
    }
        return 0;

    public void doAction(char input) { 
        
    }    
}
