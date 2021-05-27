package de.ovgu.icse.assignment04;

/**
 * Main class of the Java program.
 */

import java.util.*;

public class Main {

    public static boolean isPalindrome(String str) {
        //		The replaceAll() method replaces removes the special characters and punctuation characters in ""
        str = str.replaceAll("[^a-zA-z0-9]+", "");


        str = str.trim();// remove leading and trailing white spaces
        str = str.toLowerCase();//turns the string to lower case
        System.out.println("before reversing the String " + str);

        char[] letters = str.toCharArray();// stores the string in a character array

//      creation of a list character stack
        Stack<Character> stack = new Stack<>();

//      Pushing element from the array to the top of the stack
        for (int i = 0; i < letters.length; i++) {
            stack.push(letters[i]);
        }

//		Popping element from the top of the stack
        for (int i = 0; i < letters.length; i++) {
            if (stack.pop() != letters[i])

                return false;// removes(pop) the letters from the stack and compares with the pushed values
        }

        return true;

        //your implementation goes here
    }

    public static void main(String[] args) {


//   Test for Car Methods
//   Unlocking doors
        Car Mercedes = new Car(false, false);
        boolean[] doors = {false, false, true};
        Mercedes.setDoors(doors);
        System.out.println("The car has " + Mercedes.getNumberOfDoors());
        Mercedes.unlockAllDoors();

//   locking doors
     Mercedes.lockAllDoors();

//   checking door state
        for(int j=0;j<Mercedes.getNumberOfDoors();j++){
            System.out.println(Mercedes.getDoorState(j));
        }

//   locking doors
        Mercedes.lockAllDoors();

//    wiper
        System.out.println("The wiper is " + Mercedes.getWiperState());
        Mercedes.toggle_wiper();// flips the wiper status
        System.out.println("The wiper is " + Mercedes.getWiperState());

//   trunkstate
        System.out.println("The trunk is  " + Mercedes.getTrunkState());

//   open trunk
        Mercedes.openTrunk();// dont print its void method
        System.out.println("The trunk is  " + Mercedes.getTrunkState());

// locktrunk

        Mercedes.closeTrunk();
        System.out.println("The trunk is  " + Mercedes.getTrunkState());

        int Num_Doors1 = 0;

        Bus Man = new Bus(false, false);// setting the defaults for the door state
        Num_Doors1 = Man.getNumberOfDoors();// getting the number of doors of the car
        System.out.println("The number of Bus doors is  " + Num_Doors1);

//   locking the bus Doors
        Man.lockAllDoors();

//    unlocking the bus Doors
        Man.unlockAllDoors();

// checking state of the bus doors
        for (int i = 0; i < Num_Doors1; i++) {
            System.out.println(Man.getDoorState(i));
        }
        // wiper of the bus
        System.out.println("The Bus wiper is  " + Man.getWiperState());
        Man.toggle_wiper();
        System.out.println("The Bus wiper is  " + Man.getWiperState());

        // Bus trunk state
        System.out.println("The trunk is  " + Man.getTrunkState());

        // open Bus trunk
        Man.openTrunk();
        System.out.println("The trunk is  " + Man.getTrunkState());

        // close trunk
        Man.closeTrunk();
        System.out.println("The trunk is  " + Man.getTrunkState());


//   TEST OF toText method

//    creation of objects(nodes) of type string and data passed to it
        LinkedNode<String> node1 = new LinkedNode<String>("sleeping late",null);

        LinkedNode<String> node2 = new LinkedNode<String>("attending a party",node1);
        node1.setNextNode(node2);

        LinkedNode<String> node3 = new LinkedNode<String>("going to bed",node2);
        node2.setNextNode(node3);
        System.out.println(node1.toText());

        LinkedNode<String> nodeNew1 = new LinkedNode<String>("visit the canteen",null);

        LinkedNode<String> nodeNew2 = new LinkedNode<String>("attend a lecture", nodeNew1 );


        LinkedNode<String> nodeNew3 = new LinkedNode<String>("go to mensa",nodeNew2);

        System.out.println(nodeNew3.toText());

        LinkedNode<String> day1 = new LinkedNode<String>("Friday",null);

        LinkedNode<String> day2 = new LinkedNode<String>("Thursday",day1);


        LinkedNode<String> day3 = new LinkedNode<String>("Tuesday",day2);


        LinkedNode<String> day4 = new LinkedNode<String>("Monday",day2);
        day4.setNextNode(day3);//inserting the next node for Mon to be Tuesday i.e next node for Monday
        day3.setNextNode(day2);//setting next node for Tue to be Thur


        LinkedNode<String> day5 = new LinkedNode<String>("Wednesday",day2);
        day3.setNextNode(day5);//setting next node for Wednesday to be Thur

        System.out.println(day4.toText());

// isPalindrome
        String text1 = "Hannah";
        System.out.println(isPalindrome(text1));
        //test your implemenation here
    }
}

