package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem1Driver implements Directions
{
    public static void main(String args[])  {
        Problem1 karel = new Problem1(1, 1, South, -1);
        karel.faceEast();
        karel.turnOff();
        
    } 

    static {
        World.reset(); 
        World.readWorld("first"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}
