package de.ovgu.icse.assignment04;

// 2.0 extension of the Vehicle class to car class
public class Car extends Vehicle implements Trunk {

    // 2.1 instantiating variables of the superclass
    private int numDoors = 4;//variable to store the number of doors of the car
    boolean trunk_state = false;
    boolean[] doors = new boolean[numDoors];//creating a new array of size numberDoors

    public Car(boolean wiperState, boolean trunkState) {

//  2.2 With super(parameter list), the superclass constructor with a matching parameter list is called.
        super(wiperState, trunkState);
        setDoors(doors);//passing the number of doors the car has to a constructor
    }

    //  2.4.0 overiding the methods in the superclass
//  2.3 we need the state of each door 1st(create method in Vehicle)
    public void unlockAllDoors() {
        for (int i = 0; i < getNumberOfDoors(); i++) {
            setDoorstate(i, true);//true mean open in this context
        }

    }
    //your implementation goes here

    //   2.4.1 overiding the methods in the superclass
    public void lockAllDoors() {
        for (int i = 0; i < getNumberOfDoors(); i++) {
            setDoorstate(i, false);//false mean close in this context
        }


    }


    //   2.5 additional methods required to close and open the trunk
    public void closeTrunk() {

        trunk_state = false;
    }

    public void openTrunk() {
        trunk_state = true;
    }
}
