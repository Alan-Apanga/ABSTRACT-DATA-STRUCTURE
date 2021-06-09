Java Project
#We wish to build new cars, motorcycles and buses. These should be able to open and lock their doors (if any) and to activate the windscreen wiper. In addition, cars and buses should be able to automatically open their trunk, whereas this is done manually for motorcycles. Steering is not important at this stage of development.

1.Please write an abstract class Vehicle containing the following protected member variables:

protected boolean wiper_active; 
protected boolean[] doors; 
protected boolean trunk_open;
The variables should store whether the wiper is active, for each door whether it is locked (i.e., doors[i]==true if the door is locked) and for the trunk whether it is open.

2.Next, add the following methods and implement the non-abstract methods in an appropriate way:

  public void toggle_wiper() {…}

  public boolean getWiperState() {…} 
  public int getNumberOfDoors() {…}
  public boolean getDoorState(int door) {…} 
  public boolean getTrunkState() {…} 

  public abstract void unlockAllDoors(); 
  public abstract void lockAllDoors(); 

Finally, implement the following constructor:

public Vehicle(boolean wiperState, boolean trunkState) {…} 
The constructor should initialize the member variables wiper_active and trunk_open. However, do not initialize the doors variable as this is dependent on the concrete number of doors.


3.Next, write the classes Car, Motorcycle, and Bus extending the abstract class from above. Write a new constructor with the same parameters as above which additionally initializes the member variable doors with the appropriate number of doors (Bus=2, Car=4, Motorcycle=0). Remember: to call the constructor of the abstract class Vehicle use the super() keyword. Make use of it.

Moreover, you should implement the functions:

public void unlockAllDoors() {…} 
public void lockAllDoors() {…}

4.Finally, cars and buses are usually able to automatically open their trunk. To this end, write a small interface Trunk (i.e., add a new file for this interface) containing the following functions, which should be implemented by the classes Car and Bus:

public void openTrunk(); 
public void closeTrunk();
