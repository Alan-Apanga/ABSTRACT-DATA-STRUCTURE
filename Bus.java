package de.ovgu.icse.assignment04;

public class Bus extends Vehicle {

    // 3.1 instantiating variables of the superclass
    private int numDoors = 3;//variable to store the number of doors of the car
    boolean trunk_state = false;//assigning default trunk status
    boolean[] doors = new boolean[numDoors];//creating a new array of size numberDoors

    //your implementation goes here

    public Bus(boolean wiperState, boolean trunkState) {

//  3.2 With super(parameter list), the superclass constructor with a matching parameter list is called.
        super(wiperState, trunkState);
        setDoors(doors);//passing the number of doors the bus has to a constructor
    }

    //  3.3.0 overiding the methods in the superclass
//  3.4 we need the state of each door 1st(create method in Vehicle)
    public void unlockAllDoors() {
        for (int i = 0; i < getNumberOfDoors(); i++) {
            setDoorstate(i, true);//true mean open in this context
        }

    }

    //   3.3.1 overiding the methods in the superclass
    public void lockAllDoors() {
        for (int i = 0; i < getNumberOfDoors(); i++) {
            setDoorstate(i, false);//false mean close in this context
        }


    }

    //   3.5 additional methods required to close and open the trunk
    public void closeTrunk() {

        trunk_state = false;
    }

    public void openTrunk() {
        trunk_state = true;

    }

}
