/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHurricaneSurvivalGame.view;

import Exception.MoveException;
import byui.cit260.theHurricaneSurvivalGame.model.Location;
import byui.cit260.theHurricaneSurvivalGame.model.Player;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Renee
 */
public abstract class MovePlayerView extends View {

    
    public MovePlayerView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Move Player View                     "
                + "\n------------------------------------"
                + "\nG - Start player view menu                     "
                + "\nH - Get help on how to view move"
                + "\nS - Save view menu" 
                + "\nC - View City Map location"
                + "\nE - Exit"
                + "\n------------------------------------");
    }

    //private static Player player = null;
    //private static Location currentGame = null;
    
    //private static PrintWriter outFile = null;
    //private static BuferedReader inFile = null;

     
        
    
    public int doAction(Object selection) {
        Location location;
        
        
        int [][] Location = new int [0][1];
        value = value.Home = [0,1];
                int choice = value.intAt(0,1);
                switch (choice) {
                    case 'B': //Begin move
                        this.viewLocation();
                        break;
                    case 'N':
                        this.moveNorth();
                        break;
                    case 'E':
                        this.moveEast();
                        break;
                    case 'S':
                        this.moveSouth();
                        break;
                    case 'W':
                        this.moveWest();
                        break;
                    case 'M':
                        this.viewMap();
                        break;
                    default:
                        System.out.println("\n*** This is an invalid selection *** Please try again");
                        break;
                }
      
        int newLocation = 0;
        
        return newLocation;
    }

    //should this be the class name or the doAction method    
    public void printMovePlayerViewReport(ArrayList<LocationTypes> locationTypes,
                                          String outputLocationType) {
        //should this be the class name or the doAction method
        try (doAction out = newPrintWriter(outputLocation)) {
            
            out.println("\n\               Location name");
            out.println("\n                Location index");
            out.println("\n               Location row")";
            out.println("\n               Location column");
            out.println("\n               Location visted");
            Iterable<Location> locationCoordinates = null;
            
            for (Location location : locationCoordinates) {
                out.printf("Location type dat" 
                                    ,location.getLocationType()
                                    ,location.getLocationName()
                                    ,location.getIndex()
                                    ,location.getRow()
                                    ,location.getColumn()
                                    ,location.getVisited());
            }
        } catch(IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }
            
        }
            
        }
    }     

    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveWest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveSouth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveEast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveNorth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class Printwriter {

        public Printwriter() {
        }
    }

           


    private void viewMap() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveNorth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveEast() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveSouth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void moveWest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewLocation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class BuferedReader {

        public BuferedReader() {
        }
    }
      
        
              
        
        
    