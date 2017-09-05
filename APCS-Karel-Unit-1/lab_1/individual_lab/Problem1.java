package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
        move();
        move();
        turnLeft();
        Picking();
        turnAround();
        move3();
        Picking2();
        turnAround();
        move3();
        putDown();
        returnBack();
    }
    public void Picking() {
        pickBeeper();
        move();
        pickBeeper();
        move();
        pickBeeper();
    }
    public void Picking2() {
        pickBeeper();
        move();
        pickBeeper();
        move();
    }
    public void turnAround() {
        turnLeft();
        turnLeft();
    }
    public void putDown() {
        putBeeper();
        turnLeft();
        move();
        putBeeper();
        move();
        putBeeper();
        turnAround();
        move3();
        putBeeper();
        move();
        putBeeper();
    }
    public void returnBack() {
        turnAround();
        turnLeft();
        move();
        move();
        turnRight();
        move();
        move();
        turnRight();
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void move3() {
        move();
        move();
        move();
    }
}
