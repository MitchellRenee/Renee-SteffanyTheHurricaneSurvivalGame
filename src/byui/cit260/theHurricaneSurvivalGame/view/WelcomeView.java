/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.model.Player;
import java.util.Scanner;

/**
 *
 * @author Renee
 */
public class WelcomeView {
    
        
    public WelcomeView(){
        
    }
    public void displayBanner(){
        
        System.out.println("******************************************");
        //Display the banner screen
        this.displayBanner();
        
        System.out.println("Welcome to The Hurricane Survival Game");
        System.out.println("You have just discover there's a level 8 hurricane coming, with winds up to 120 miles per hour");
        System.out.println("However, you are low on supplies, and need to gather enough supplies to weather out the storm");
        System.out.println("And to make matters interesting you have you are an emergency community voluteer and. . .");
        System.out.println("you just recieved a text to come in and help deliver emergency supplies to the local nursing home and prison");
        System.out.println("Delivering supplies to the community will take up a significant amount of your time . . .");
        System.out.println("but,gives you the opportunity to earn money by making deliveries to both locations ");
        System.out.println("You have a limited budget which will not cover all purchases");
        System.out.println("You will need to visit different locations to check on your supplies, acquire more, and increase your budget");
        System.out.println("Some locations will only require a visit to incrase a particular item, while. . .");
        System.out.println("others items must be purchased which requires a visit to the stores");
        System.out.println("Be aware that there are different categories of supplie, each with survival points.");
        System.out.println("To reach the required number of survival points in each category, you must acquire items specific to the category.");
        System.out.println("Your items may already be in your inventory list, or you may need to purchase them.");
        System.out.println("Once you have matched the survival points in all categories, you are prepared for Hurricane Merlin");
        System.out.println("Once you start the game, you'll find yourself in town, so you must make your way home to start preparing");
        System.out.println("All of this has to be done in less than 48 hours");        
        System.out.println("The clock is ticking and there's no time to waist");
        System.out.println("*******************************************");
    }
           
    public String getPlayerName(){
        
        Scanner in = new Scanner(System.in);
        String name = "";
        
        while(name.length() < 2){        
            System.out.println("Please enter your name:");
            name = in.nextLine();  
        
        if (name.length () <  2){   
            System.out.println("Please enter a name with at least 2 characters:");
        }
    }             
        
    return name;
    
    }
    
    public void displayPlayerNameBanner(Player p){
        System.out.println("*******************************");
        System.out.println("Welcome " + p.getName() + "");
        System.out.println("Best of Luck!");
        System.out.println("*******************************");
    }
}
    

