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
public interface interfaceForCar {
    void speedUp(int increaseSpeedBy);
    
    void slowDown(int decreaseSpeedBy);
    
    void changeGear(int newGear);
    
    void liftUp(int increaseInclineBy);
    
    void printValues(String modelName);
}
