/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import byui.cit260.theHurricaneSurvivalGame.Exception.CityMapException;
import byui.cit260.theHurricaneSurvivalGame.Exception.GameException;
import byui.cit260.theHurricaneSurvivalGame.Exception.LocationException;
import byui.cit260.theHurricaneSurvivalGame.Exception.MoveException;
import static byui.cit260.theHurricaneSurvivalGame.control.PlayerControl.player;
import byui.cit260.theHurricaneSurvivalGame.model.Location;

/**
 *
 * @author Renee
 */
/**
 * Call method for input
 *
 * @param input
 */
public class RotateView extends View {
    
    public RotateView(String message) {
        
        super("Please make a selection:\n"
                + "N - Move North\n"
                + "E - Move East\n"
                + "S - Move South\n"
                + "W - Move West\n"
                + "I - Search for item\n"
                + "G - Save Game\n"
                + "Q - Quit to Main Menu\n");
        
}
    public boolean doAction(char input) {
        try {
            switch (input) {
                case 'N':
                    moveNorth();
                    break;
                case 'G':
                    moveEast();
                    break;
                case 'H':
                    moveSouth();
                    break;
                case 'S':
                    moveWest();
                    break;
                case 'Q': // Quit the program
                    return true;
                default:
                    System.out.println("\n*** This is an invalid selection *** Please try again");
                    break;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        
            System.out.print("Error reading input: " + e.getMessage());
            ErrorView.display(this.getClass().getName());
        } finally {
            System.out.close();
        }
        return false;
    }
    //Returns error when I added in the try catch according to the video from wk 10
    //Video link: https://www.youtube.com/watch?v=9iAcqnesaS4&feature=youtu.be
    private void moveNorth() {
        try {
        Location l = new Location();
        l.moveNorth(0, 0);
        //} catch (LocationException | GameException le) {
        //  System.out.println(le.getMessage()); 
        } catch (Throwable te) { 
            System.out.println(te.getMessage());
            te.printStackTrace();
        }finally{
            System.out.close();
        } 
    }

    private void moveEast() {
        try {
        Location l = new Location();
        l.moveEast(0, 0);
        //} catch (LocationException | CityMapException le) {
        //    System.out.println(le.getMessage());
        } catch (Throwable te) { 
            System.out.println(te.getMessage());    
        te.printStackTrace();
        }finally {
            System.out.close();
            
        }
        
    }

    private void moveSouth() {
        try {
        LocationControl l = new LocatonControl();
        l.moveSouth(0, 0);
        } catch (Throwable te) { 
            System.out.println(te.getMessage());    
        te.printStackTrace();
        }finally {
            System.out.close();
    }
}
    private void moveWest() {
        try {
        LocationControl l = new LocatonControl();
        l.moveWest(0, 0);
        } catch (Throwable te) { 
            System.out.println(te.getMessage());    
        te.printStackTrace();
        }finally {
            System.out.close();
    }
}
    @Override
    public boolean doAction(Object obj) {
        System.out.println("Player cannot move if location is not on the Citymap.");
        return false;
    }

    private static class pubic {

        public pubic() {
        }
    }

    private static class LocationControl {
        
        public LocationControl() {
           
        }
        private void moveNorth(double getRow, double getCol) {
            System.out.println("Row location cannot be null.");
        }
            
        private void moveEast(double getRow, double getCol) {
            System.out.println("Row location cannot be null.");
        }

        private void moveSouth(double getRow, double getCol) {
            System.out.println("Row location cannot be null.");
        }

        private void moveWest(double getRow, double getCol) {
            System.out.println("Row location cannot be null.");
      
            
    }
    }

    private static class LocatonControl extends LocationControl {

        public LocatonControl() {
        }
    }

    private static class getRow {

        public getRow() {
        }
    }
}
