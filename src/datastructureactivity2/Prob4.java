
package datastructureactivity2;


public class Prob4 extends Prob3{
    public Prob4(int Size) {
        super(Size);
    }

    public double peek(){
        
        if (!isEmpty()) {
            return StackArray[top];
        }
        
        else {
            System.out.println("\nStack is Empty"
                    + ", so you can't peek anything.");
            return -1;
        }
        
    }
}
