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
        newRoom();
        checkRoom();
        newRoom();
        checkRoom();
        newRoom();
        checkRoom();
        newRoom();
        checkRoom();
        newRoom();
        checkRoom();
        newRoom();
        checkRoom();
        newRoom();
        checkRoom();
    }
    public void newRoom() {
        move();
        turnLeft();
        move();
    }
    public void checkRoom() {
        if (!frontIsClear()) {
            turnLeft();
            if (!frontIsClear()) {
                turnLeft();
                turnLeft();
                if (!frontIsClear()) {
                    putBeeper();
                    leaveRoom();
                } else {
                    leaveRoom();
                }
            } else {
                leaveRoom();
            }
        } else {
            leaveRoom();
        }
    }
        public void leaveRoom() {
        for(int i = 0; i < 3; i++) {
            if (!facingSouth()) {
                turnLeft();
            }
        }
        move();
        turnLeft();
    }
}


