
package datastructureactivity2;

import java.util.Scanner;

public class MainClass {

    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        int stacksize;
        boolean condition = false;
        
        System.out.println("Set size of Stack: ");
        stacksize = scn.nextInt();
        
        Prob5 stack = new Prob5(stacksize);
        
        System.out.println("Current size of Stack is " + stacksize);
        
        
        while(!condition) {
            
            System.out.println("\n0 Exit: ");
            System.out.println("1 Push element: ");
            System.out.println("2 Pop element: ");
            System.out.println("3 Peek stack: ");
            System.out.println("4 Peek at bottom stack: ");
            System.out.println("5 Loop through stack: ");
            System.out.println("6 Duplicates: ");
            System.out.println("7 Total elements: ");
            System.out.println("8 Add another to the stack: ");
            System.out.println("9 Peek other stack: ");
            System.out.println("Input: ");
            int choice = scn.nextInt();
            
            switch (choice) {
                case 0:
                    System.out.println("Hi!");
                    condition = true;   
                    break;
                case 1:
                    System.out.println("\nPush this element: ");
                   
                    double push = scn.nextDouble();
                    stack.push(push);
                    break;
                case 2:
                    System.out.println("\nPopped this element: " 
                            + stack.pop());
                    break;
                case 3:
                    System.out.println("\nPeeked at the top: " 
                            + stack.peek());
                    break;
                case 4:
                    System.out.println("\nPeeked at the bottom: "
                            + "" + stack.bottomElement());
                    break;
                case 5:
                    stack.loopStack();
                    break;
                case 6:
                    stack.toremoveDuplicates();
                    break;
                case 7:
                    stack.countmyElements();
                    break;
                case 8:
                    stack.stack();
                    break;
                case 9:
                    stack.loopNewStack();
                    break;
                default:
                    System.out.println("Can you read?\n");
                    condition = false;
                    break;
            }
            

            
     
        }
        
        
        
        
    }
    }
   
