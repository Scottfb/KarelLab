package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  S. Brydon
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        setup();
        
    }
    
   public void turnRight() {
       turnLeft();
       turnLeft();
       turnLeft();
    }
   public void setup() {
       turnLeft();
       move();
       move();
       move();
       turnLeft();
       move();
       move();
    }
   public void move2() {
       move();
       move();
    }
}