package lab_2.pair_programming;


import kareltherobot.*; 
/**
 * @author :
 * teacher :
 * due date:
 */
public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvest() {
       harvestTwoRows();
       harvestTwoRows();
       harvestTwoRows();//Complete this method, using the methods you create below so that all rows are harvested
    }
    /**
     * Precondition: Robot is facing east, one block away from a beeper
     * Postcondition: R0bot is facing east, two streets above where it started
     */
    public void harvestTwoRows() {
       move();
       harvestOneRow();
       repositionRight();
       harvestOneRow();
       repositionLeft();
    }
    public void harvestOneRow() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }  
    public void repositionRight() {
        turnLeft();
        move();
        turnLeft();
    }
    public void repositionLeft() {
        move();
        turnRight();
        move();
        turnRight();
        
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
