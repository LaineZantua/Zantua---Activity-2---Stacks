package datastructureactivity2;

/**
 *
 * @author princ
 */
public class Prob2 extends Prob1 {
    
    public Prob2(int Size) {
        super(Size);
    }
    
    public void countmyElements(){
  
        if (!isEmpty()) {
            int sum = top + 1;
            System.out.println("\nElements in stack: " + sum);
        }
        
        else {
            System.out.println("\nEmpty!");  
        }
    }
}
