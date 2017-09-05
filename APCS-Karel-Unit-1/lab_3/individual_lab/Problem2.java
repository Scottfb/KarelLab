package lab_3.individual_lab;

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

    public void carpetRooms(){
        newRoom();
        checkRoom();
        leaveRoom();
        newRoom();
    }
    public void newRoom() {
        move();
        turnLeft();
        move();
    }
    public void checkRoom() {
        if (frontIsClear()) {
            turnLeft();
            if (frontIsClear())
            turnLeft();
            turnLeft();
        }
    }
}
