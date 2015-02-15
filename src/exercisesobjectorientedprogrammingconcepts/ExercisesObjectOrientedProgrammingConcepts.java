/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercisesobjectorientedprogrammingconcepts;

/**
 *
 * @author Podge
 */
public class ExercisesObjectOrientedProgrammingConcepts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create car objects
        Toyota corolla = new Toyota();
        Toyota auris = new Toyota();
        
        
        //change the values of each object
        //corolla 
        corolla.speedUp(120);
        corolla.slowDown(40);
        corolla.changeGear(6);
        corolla.liftUp(15);
        corolla.printValues("Corolla");
        
        //auris
        auris.speedUp(160);
        auris.slowDown(40);
        auris.changeGear(5);
        auris.liftUp(20);
        auris.printValues("Auris");
    }
    
}
