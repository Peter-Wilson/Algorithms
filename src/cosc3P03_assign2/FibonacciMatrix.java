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
public class FibonacciMatrix {
    
    /**
     * Get the digit'th fibonacci number
     * @param digit 
     * @return the fibonacci number
     */
    public BigInteger getFibonacci(long digit)
    {
        if(digit == 0) return BigInteger.ZERO;
        if(digit == 1) return BigInteger.ONE;
        return getMatrix(digit)[0][1];
    }   
    
    /**
     * Use Divide and Conquer to multiply exponents 
     * @param n
     * @return the matrix
     */
    public BigInteger[][] getMatrix(long n){
        //a matrix divided by zero is the identity
        if(n == 0){
            BigInteger[][] matrix = {{BigInteger.ONE,BigInteger.ZERO},
                                    {BigInteger.ZERO,BigInteger.ONE}};
            return matrix;
        }
        //return the main matrix
        else if(n == 1){
            BigInteger[][] matrix = {{BigInteger.ZERO,BigInteger.ONE},
                                {BigInteger.ONE,BigInteger.ONE}};
            return matrix;
        }
        //if it divides evenly recurse by half and multiply by itself
        else if(n % 2 == 0){
            BigInteger[][] a = getMatrix(n/2);
            return MultiplyMatrices(a,a);
        }
        //if it doesn't divide evenly, use the ceil and floor
        else
        {
            BigInteger[][] a = getMatrix((long)Math.ceil(n/2.0));
            BigInteger[][] b = getMatrix((long)Math.floor(n/2.0));
            return MultiplyMatrices(a,b);
        }
    }
    
    /**
     * Multiply the 2 matrices
     * @param A
     * @param B
     * @return 
     */
    public BigInteger[][] MultiplyMatrices(BigInteger[][] A, BigInteger[][] B)// throws Exception
    {
        //if(A[0].length != B.length) throw new Exception("Multiplication not possible");
        
        BigInteger[][] r = {{A[0][0].multiply(B[0][0]).add(A[0][1].multiply(B[1][0])), 
                        A[0][0].multiply(B[0][1]).add(A[0][1].multiply(B[1][1]))},
                      {A[1][0].multiply(B[0][0]).add(A[1][1].multiply(B[1][0])), 
                          A[1][0].multiply(B[0][1]).add(A[1][1].multiply(B[1][1]))}};
        
        return r;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String input = "";
        FibonacciMatrix f = new FibonacciMatrix();
        System.out.println("FIBONACCI MATRIX\n\n");
        do
        {
            //get the digit
            System.out.println("Enter the fibonacci digit you want (quit with Q):");
            try
            {
                //calculate the fibonacci number
                input = sc.next();
                Long time = System.currentTimeMillis();
                System.out.println("Answer: "+ f.getFibonacci(Integer.parseInt(input)) +
                        " in "+ (System.currentTimeMillis() - time) + " millisecond");
                
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
