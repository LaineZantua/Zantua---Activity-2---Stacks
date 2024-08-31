
package datastructureactivity2;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Prob1 {
    int Size;
    double[] StackArray;
    int top;
    
    Stack<Double> newStack = new Stack<>();
    
    public Prob1(int Size){
        this.Size = Size;
        StackArray = new double[this.Size];
        top = -1;
    }
    
    
    public void push(double value){
        if (!isFull()) {
           StackArray[++top] = value;
           System.out.println("Push value: " + value);
        } else {
            System.out.println("Stack is full.");
        }
    } 
    
    public void toremoveDuplicates(){
        Set<Double> uniques = new HashSet<>();
        int newTop = -1;
        boolean hasDuplicate = false;
        for (int i = 0; i <= top; i++) {
            if (uniques.contains(StackArray[i])){
                System.out.println("A duplicate is found " + StackArray[i]);
                StackArray[++newTop] = StackArray[i];
                top = newTop;        
                hasDuplicate = true;
            }
            uniques.add(StackArray[i]);
        }
        if(hasDuplicate == false){
            System.out.println("\nNo duplicate.");
        }
        
    }
    
    
    public void stack(){
        
        for (int i = 0; i <= top; i++) {
            if (!isFull()) {
                System.out.println("\nAdded stack: "
                + StackArray[i]);
                newStack.push(StackArray[i]);
            } else {
                System.out.println("\nYou're stack is full.");
            }
            }

        }
    
    public void loopNewStack(){
            if(isEmpty()){
                System.out.println("Stack is empty! ");
            } else {
                System.out.println("\nNew Stack Elements: ");
                for (int i = 0; i <= top; i++) {
                    
                System.out.println(newStack.get(i));
            }

            } 
        
        }
    
    public void countElements(){
  
        if (!isEmpty()) {
            int sum = top + 1;
            System.out.println("\nElements in stack: " + sum);
        }
        else {
            System.out.println("\nStack is empty!");

            
        }
    }
    
    
    public void loopStack(){
        if (isEmpty()) {
            System.out.println("Stack is empty! ");
        }
        else {
            System.out.println("\nStack:");
            
            for (int i = top; i >= 0; i-- ) {
            System.out.println(StackArray[i]);           
        }
        }

    }
    
    public double pop(){
        if (!isEmpty()) {
            return StackArray[top--];
        }
        
        else {
            System.out.println("\nStack is Empty, input values first.");
            return -1;          
        }
    
    }
    
    
    public double peek(){
        if (!isEmpty()) {
            return StackArray[top];
        }
        else {
            System.out.println("\nStack is Empty, so you can't peek anything.");
            return -1;
        }
    }
    
        
    public double  bottomElement(){
        if (!isEmpty()) {
            return StackArray[0];
            
        }
        else {
            System.out.println("\nStack is Empty, so you can't see the bottom.");
            return -1;
         
        }
        
    }
    
    
    public boolean isEmpty(){
         return (top == -1);
    }
    
   
    public boolean isFull(){
        return (top == Size -1);
    }
}
