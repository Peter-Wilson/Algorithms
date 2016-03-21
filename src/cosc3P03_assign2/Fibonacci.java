/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cosc3P03_assign2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author pw12nb
 */
public class Fibonacci {

    /**
     * Recurse to find the nth fibonacci
     * @param digit
     * @return the fibonacci number
     */
    public BigInteger getFibonacci(int digit)
    {
        if(digit == 0) return BigInteger.ZERO;
        if(digit == 1) return BigInteger.ONE;
        return getFibonacci(digit-1).add(getFibonacci(digit-2));
    }    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String input = "";
        Fibonacci f = new Fibonacci();
        System.out.println("BRUTE FORCE FIBONACCI\n\n");
        
        do
        {
            //get the digit
            System.out.println("Enter the fibonacci digit you want (quit with Q):");
            try
            {
                //calculate and print the fibonacci number
                input = sc.next();
                long time = System.currentTimeMillis();
                System.out.println("Answer: "+ f.getFibonacci(Integer.parseInt(input)) +" in "+ (System.currentTimeMillis() - time) + " millisecond");
                
            }
            catch(Exception e)
            {
                if(!input.equals("Q") && !input.equals("q"))
                    System.out.println("Please enter a number!");
            }
        }
        while(!input.equals("Q") && !input.equals("q"));
    }
    
}
