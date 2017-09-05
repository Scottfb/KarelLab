package lab_2.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem2 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     */
    public Problem2(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void setField(){
        move();
        firstRow();
        repositionLeft();
        secondRow();
        repositionRight();
        thirdRow();
        repositionLeft();
        fourthRow();
        move();
        reset();
        thirdRow();
        repositionLeft();
        move();
        move();
        secondRow();
        repositionRight();
        move();
        move();
        putBeeper();
    }
    public void firstRow() {
        putBeeper();
        turnRight();
    }
    public void repositionLeft() {
        move();
        turnLeft();
        move();
        turnLeft();
    }
    public void secondRow() {
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void repositionRight() {
        move();
        turnRight();
        move();
        turnRight();
    }
    public void thirdRow() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void fourthRow() {
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
        move();
        move();
        putBeeper();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void reset() {
        turnRight();
        move();
        turnRight();
        move();
        move();
    }
}
