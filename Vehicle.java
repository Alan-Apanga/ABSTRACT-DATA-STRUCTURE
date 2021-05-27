package de.ovgu.icse.assignment04;

public abstract class Vehicle {

    protected boolean wiper_active;
    protected boolean[] doors;
    protected boolean trunk_open;
    //your implementation goes here

    //   1.0 constructor
    public Vehicle(boolean wiperState, boolean trunkState) {
        this.wiper_active=false;
        this.trunk_open=false;
        this.wiper_active = wiperState;
        this.trunk_open = trunkState;//your implementation goes here
    }

    //    1.2
    public void toggle_wiper() {

        if (getWiperState() == false) {
            this.wiper_active = true;
        } else {
            this.wiper_active = false;
        }
        //your implementation goes here
    }

    //    1.1 stores wiper status
    public boolean getWiperState() {

        return this.wiper_active;
        //your implementation goes here
    }

    //   1.3 gets number of doors stored in the array
    public int getNumberOfDoors() {
        return this.doors.length;
        //your implementation goes here
    }

    //  1.4 gets the status of a particular door
    public boolean getDoorState(int door) {
        return this.doors[door];
        //your implementation goes here
    }

    // 1.5 gets trunk state
    public boolean getTrunkState() {
        return this.trunk_open;
        //your implementation goes here
    }

    // 1.6 setters
    public void setWiper_active(boolean wiper_active) {
        this.wiper_active = wiper_active;
    }

    public void setDoors(boolean[] doors) {
        this.doors = doors;
    }

    public void setTrunk_open(boolean trunk_open) {
        this.trunk_open = trunk_open;
    }


//  2.5 method to set each door state
    public void setDoorstate(int door_,boolean doorState){
        this.doors[door_]=doorState;
    }

    public abstract void unlockAllDoors();

    public abstract void lockAllDoors();

}
