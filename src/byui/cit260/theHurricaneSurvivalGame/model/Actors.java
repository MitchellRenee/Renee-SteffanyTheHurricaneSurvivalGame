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
 * @author Renee
 */
public enum Actors implements Serializable {
    
    Joan("She is a middle-aged single woman, who is a naturalist."),
    Zion("He is a disaster relief specialist, with a family."),
    Moses("He is an emergency ambulance technician, with several years in firstaid traing."),
    Martha("Is a homemaker of a family of 5, who volunteers, in a homeless shelter."),
    Alma("Is a single parent of two girls, who works a the local farmer's market.");
   
    private final String description;
    private final Point coordinates;
    //create enum list of other items in a fixed list. What is this?
    
    Actors(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription() {
        return description;
    }
    public Point getCoordinates() {
        return coordinates;
    }
}

    //@Override
    //public String toString() {
    //    return "Actors{" + "name=" + name + ", description=" + description + ", coordinates=" + coordinates + '}';
   
    class Point {

        public Point() {
        }

    Point(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
