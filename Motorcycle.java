package de.ovgu.icse.assignment04;

public class Motorcycle extends Vehicle {

    // 4.1 instantiating variables of the superclass
    private int numDoors = 0;//variable to store the number of doors of the car
    boolean[] doors = new boolean[numDoors];//creating a new array of size numberDoors

    public Motorcycle(boolean wiperState, boolean trunkState) {

//  4.2 With super(parameter list), the superclass constructor with a matching parameter list is called.
        super(wiperState, trunkState);
        setDoors(doors);//passing the number of doors the bus has to a constructor
    }

//   4.3
    public void unlockAllDoors() {
        for (int i = 0; i < getNumberOfDoors(); i++) {
            setDoorstate(i, true);//true mean open in this context
        }

    }

//  4.4 overiding the methods in the superclass
    public void lockAllDoors() {
        for (int i = 0; i < getNumberOfDoors(); i++) {
            setDoorstate(i, false);//false mean close in this context
        }


    }





    //your implementation goes here
}
