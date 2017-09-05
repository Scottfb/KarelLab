package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

/**
 * Write a description of class Problem1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Problem1 extends Robot
{
     public Problem1(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }
   
    public void faceEast()
    {
      if(facingWest()) {
          turnLeft();
          turnLeft();
      }
      else {
          if(facingNorth()) { 
             turnRight();}
          else {
             turnLeft();
          }
                    }
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
