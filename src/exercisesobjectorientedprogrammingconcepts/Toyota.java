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
public class Toyota implements interfaceForCar {
    
    //fields - state of the car
    int speed = 0;
    int gear = 1;
    int incline = 0;
    String model = "";
    
    //set methods - behaviours of the car
    @Override
    public void speedUp(int increaseSpeedBy){
        speed = speed + increaseSpeedBy;
    }
    
    @Override
    public void slowDown(int decreaseSpeedBy){
        speed = speed - decreaseSpeedBy;
    }
    
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    @Override
    public void liftUp(int increaseInclineBy){
        incline = incline + increaseInclineBy; 
    }
    
    @Override
    public void printValues(String modelName){
        model = modelName;
        System.out.println("Model: " + model);
        System.out.println("Current Speed: " + speed + " Current Gear: " + gear + " Current Incline: " + incline);
        System.out.println("---------------------");
    }
    
}
