/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import Exception.MoveException;

/**
 *
 * @author Renee
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
    
    /**
     * Call method for input
     * @param input
     */
    public boolean doAction(char input){
       
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
    }

    private void moveNorth() {
        LocationControl l = new LocatonControl();
        l.moveNorth(null,null);
    }

    private void moveEast() {
        System.out.println("Player moves to east coordinates."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveSouth() {
        System.out.println("Player moves to south coordinates."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveWest() {
        System.out.println("Player moves to west coordinates."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class pubic {

        public pubic() {
        }
    }

    private static class LocationControl {

        public LocationControl() {
        }

        private void moveNorth(Object object, Object object0) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class LocatonControl extends LocationControl {

        public LocatonControl() {
        }
    }
   
}
